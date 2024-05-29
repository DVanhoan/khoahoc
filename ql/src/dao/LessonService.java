/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author HOAN
 */
import dao.DAOInterface;
import model.Course;
import model.Lesson;
import database.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Account;

/**
 *
 * @author HOAN
 */
public class LessonService implements DAOInterface<Lesson> {
    
    Connection connection = MySQLConnection.getInstance().getConnection();
    private CourseService courseService;
   

    public LessonService(CourseService courseService)throws SQLException{
        this.courseService = courseService;
    }
    
    @Override
    public int insert(Lesson data) {
        int ketqua = 0;
        String query = "INSERT INTO lessons (id_course, title, description, `order`) VALUES (?, ?, ?, ?)";
        try {
            Course course = courseService.selectById(data.getCourse().getId());
            if (course == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy khóa học đã chọn","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getCourse().getId());
            statement.setString(2, data.getTitle());
            statement.setString(3, data.getDescription());
            statement.setInt(4, data.getOrder());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Thêm bài học thành công","Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm bài học không thành công","lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage(),"lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }


    @Override
    public int update(Lesson data) {
        int ketqua = 0;
        String query = "UPDATE lessons SET id_course = ?, title = ?, description = ?, order = ? WHERE id = ?";
        try {
            Course course = this.courseService.selectById(data.getCourse().getId());
          
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getCourse().getId());
            statement.setString(2, data.getTitle());
            statement.setString(3, data.getDescription());
            statement.setInt(4, data.getOrder());
            statement.setInt(5, data.getId());
            ketqua = statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int delete(Lesson data) {
        int ketqua = 0;
        String query = "DELETE FROM lessons WHERE id = ?";
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
    public Lesson selectById(int id) {
        String query = "SELECT * FROM lessons WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                return lesson;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Lesson selectByTitle(String title) {
        String query = "SELECT * FROM lessons WHERE title = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, title);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                lesson.setVideo(resultSet.getString("video"));
                return lesson;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Lesson> selectAll() {
        String query = "SELECT * FROM lessons";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Lesson> lessons = new ArrayList<>();
            while (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                lessons.add(lesson);
            }
            return lessons;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Lesson> selectByCourseId(int id) {
        String query = "SELECT * FROM lessons WHERE id_course = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Lesson> lessons = new ArrayList<>();
            while (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                lessons.add(lesson);
            }
            return lessons;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public ArrayList<Lesson> search(String key) {
        String query = "SELECT * FROM lessons WHERE title LIKE ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "%" + key + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Lesson> lessons = new ArrayList<>();
            while (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                lessons.add(lesson);
            }
            return lessons;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Lesson> selectByIdCourse(int id) {
        String query = "SELECT * FROM lessons WHERE id_course = ?";
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Lesson> lessons = new ArrayList<>();
            while (resultSet.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(resultSet.getInt("id"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                lesson.setCourse(course);
                lesson.setTitle(resultSet.getString("title"));
                lesson.setDescription(resultSet.getString("description"));
                lesson.setOrder(resultSet.getInt("order"));
                lessons.add(lesson);
            }
            return lessons;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    

    public static void main(String[] args) throws SQLException {
        AccountDAO dao = new AccountDAO();
        CourseService daoc = new CourseService(dao);
        Course course = daoc.selectById(2);
        LessonService svit = new LessonService(daoc);
//        ArrayList<Lesson> ds = svit.selectAll();
//        for(Lesson l: ds){
//            l.toString();
//        }
    }

   
    
}
