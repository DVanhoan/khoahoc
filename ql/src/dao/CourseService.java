/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Account;
import model.Course;
import database.MySQLConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author HOAN
 */
public class CourseService implements DAOInterface<Course>{


    Connection connection = MySQLConnection.getInstance().getConnection();
    
    private AccountDAO userService;

    public CourseService(AccountDAO userService) throws SQLException {
        this.userService = userService;
    }

    
  
    @Override
    public int insert(Course data) {
        int ketqua = 0;
        String query = "INSERT INTO courses (id, name , description, userId, price, image) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Account user = userService.find(data.getUser().getUserName());
            if (user == null) {
                JOptionPane.showMessageDialog(null, "User does not exit","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, data.getId());
            statement.setString(2, data.getName());
            statement.setString(3, data.getDescription());
            statement.setInt(4, data.getUser().getId());
            statement.setDouble(5, data.getPrice());
            statement.setString(6, data.getImage());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    data.setId(id);
                    JOptionPane.showMessageDialog(null, "Sussecfull to create Course","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "False to create Course","Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "False to create Course","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to create course due to an error: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }
    
    
 


    @Override
    public int update(Course data){
        int ketqua = 0;
        String query = "UPDATE courses SET name = ?, description = ?, userId = ?, price = ?, image=? WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, data.getName());
            statement.setString(2, data.getDescription());
            statement.setInt(3, data.getUser().getId());
            statement.setDouble(4, data.getPrice());
            statement.setString(5, data.getImage());
            statement.setInt(6, data.getId());
            ketqua = statement.executeUpdate();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int delete(Course data) {
        int ketqua = 0;
        String query = "DELETE FROM courses WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getId());
            ketqua = statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public Course selectById(int id) {
        String query = "SELECT * FROM courses WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDescription(resultSet.getString("description"));
                Account user = new Account();
                user.setId(resultSet.getInt("userId"));
                course.setUser(user);
                course.setPrice(resultSet.getDouble("price"));
                course.setImage(resultSet.getString("image"));
                return course;
            }
            else{
                JOptionPane.showMessageDialog(null, "khong tim thay khoa hoc nay ","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Course find(String name) {
        String query = "SELECT * FROM courses WHERE name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDescription(resultSet.getString("description"));
                Account user = new Account();
                user.setId(resultSet.getInt("userId"));
                course.setUser(user);
                course.setPrice(resultSet.getDouble("price"));
                course.setImage(resultSet.getString("image"));
                return course;
            }
            else{
                JOptionPane.showMessageDialog(null, "khong tim thay khoa hoc nay ","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Course> selectAll() {
        String query = "SELECT * FROM courses";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Course> courses = new ArrayList<>();
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDescription(resultSet.getString("description"));
                Account user = this.userService.selectById(resultSet.getInt("userId"));
                course.setUser(user);
                course.setPrice(resultSet.getDouble("price"));
                course.setImage(resultSet.getString("image"));
                courses.add(course);
            }
            return courses;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public HashMap<String, String> searchNumStudents() {
        String query = "SELECT courses.name, COUNT(enrollments.id_user) AS num_students\n" +
                "FROM courses\n" +
                " LEFT JOIN enrollments ON courses.id = enrollments.id_course\n" +
                " GROUP BY courses.id, courses.name\n";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            HashMap<String, String> courses = new HashMap<>();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String numStudents = resultSet.getString("num_students");
                courses.put(name, numStudents);
            }
            return courses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    
    
  
    @Override
    public ArrayList<Course> search(String key) {
        String query = "SELECT * FROM courses WHERE name LIKE ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "%" + key + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Course> courses = new ArrayList<>();
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDescription(resultSet.getString("description"));
                Account user = new Account();
                user.setId(resultSet.getInt("userId"));
                course.setUser(user);
                course.setPrice(resultSet.getDouble("price"));
                course.setImage(resultSet.getString("image"));
                courses.add(course);
            }
            return courses;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws SQLException {
        AccountDAO dao = new AccountDAO();
        Account user = dao.selectById(5);
        user.toString();
        Course course = new Course();
        course.toString();
        
//        CourseService daoc = new CourseService(dao);
//        daoc.insert(course);
        
    }

    
    
}
