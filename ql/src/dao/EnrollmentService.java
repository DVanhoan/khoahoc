/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author HOAN
 */
import model.*;
import database.MySQLConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EnrollmentService implements DAOInterface<Enrollment> {
    private Connection connection = MySQLConnection.getInstance().getConnection();
    
    CourseService courseService;
    AccountDAO userService;

    public EnrollmentService() throws SQLException {
        userService = new AccountDAO();
        courseService = new CourseService(userService);
    }


    @Override
    public int insert(Enrollment data) {
        int ketqua=0;
        String query = "INSERT INTO enrollments (id_user, id_course, start_date, finish_date,  status) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            // No need to set 'id', as it should be auto-generated.
            statement.setInt(1, data.getUser().getId());
            statement.setInt(2, data.getCourse().getId());
            statement.setString(3, data.getStart_date().toString());
            statement.setString(4, data.getFinish_date().toString());

            statement.setInt(5, data.isStatus());

            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    data.setId(id); 
                    JOptionPane.showMessageDialog(null, "Đăng ký khóa học thành công","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Đăng ký khóa học thất bại","Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Đăng ký khóa học thất bại","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi : " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }


    @Override
    public int update(Enrollment data) {
        int ketqua=0;
        String query = "UPDATE enrollments SET id_user = ?, id_course = ?, start_date = ?, finish_date = ?, status = ? WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getUser().getId());
            statement.setInt(2, data.getCourse().getId());
            statement.setString(3, data.getStart_date().toString());
            statement.setString(4, data.getFinish_date().toString());
            statement.setInt(5, data.isStatus());
            statement.setInt(6, data.getId());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật đăng ký khóa học","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thất bại ","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thất bại: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }

    @Override
    public int delete(Enrollment data) {
        int ketqua=0;
        String query = "DELETE FROM enrollments WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getId());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Xóa đăng ký khóa học","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thất bại","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }

    @Override
    public Enrollment selectById(int id){
        String query = "SELECT * FROM enrollments WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Enrollment enrollment = new Enrollment();
                enrollment.setId(resultSet.getInt("id"));
                Account user = userService.selectById(resultSet.getInt("id_user"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                enrollment.setUser(user);
                enrollment.setCourse(course);
                enrollment.setStart_date(resultSet.getString("start_date"));
                enrollment.setFinish_date(resultSet.getString("finish_date"));
                enrollment.setStatus(resultSet.getInt("status"));
                return enrollment;
            }else {
                JOptionPane.showMessageDialog(null, "khong tim thay enrollment nay ","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Enrollment> selectAll() {
        String query = "SELECT * FROM enrollments";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Enrollment> enrollments = new ArrayList<>();
            while (resultSet.next()) {
                Enrollment enrollment = new Enrollment();
                enrollment.setId(resultSet.getInt("id"));
                Account user = userService.selectById(resultSet.getInt("id_user"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                enrollment.setUser(user);
                enrollment.setCourse(course);
                enrollment.setStart_date(resultSet.getString("start_date"));
                enrollment.setFinish_date(resultSet.getString("finish_date"));
                enrollment.setStatus(resultSet.getInt("status"));
                enrollments.add(enrollment);
            }
            return enrollments;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Enrollment> search(String key) {
        String query = "SELECT * FROM enrollments WHERE idUser LIKE ? OR idCourse LIKE ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "%" + key + "%");
            statement.setString(2, "%" + key + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Enrollment> enrollments = new ArrayList<>();
            while (resultSet.next()) {
                Enrollment enrollment = new Enrollment();
                enrollment.setId(resultSet.getInt("id"));
                Account user = userService.selectById(resultSet.getInt("id_user"));
                Course course = courseService.selectById(resultSet.getInt("id_course"));
                enrollment.setUser(user);
                enrollment.setCourse(course);
                enrollment.setStart_date(resultSet.getString("start_date"));
                enrollment.setFinish_date(resultSet.getString("finish_date"));
                enrollment.setStatus(resultSet.getInt("status"));
                enrollments.add(enrollment);
            }
            return enrollments;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

