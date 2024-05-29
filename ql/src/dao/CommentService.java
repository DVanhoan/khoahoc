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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CommentService implements DAOInterface<Comment> {
    
    private Connection connection = MySQLConnection.getInstance().getConnection();
    private CourseService courseService;
    private AccountDAO useDAO;
    private LessonService lessonService;

    public CommentService() throws SQLException {
        useDAO = new AccountDAO();
        courseService = new CourseService(useDAO);
        lessonService = new LessonService(courseService);
    }
    
    public static CommentService getInstance() throws SQLException {
        return new CommentService();
    }
    
    public static void validateComment(Comment data) {
        if (data == null) {
            JOptionPane.showMessageDialog(null, "Comment data is null", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (data.getContent() == null) {
            JOptionPane.showMessageDialog(null, "Comment content is missing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (data.getUser() == null) {
            JOptionPane.showMessageDialog(null, "Comment user is missing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (data.getLesson() == null) {
            JOptionPane.showMessageDialog(null, "Comment lesson is missing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // If all checks pass
//        JOptionPane.showMessageDialog(null, "Comment is valid", "Validation Success", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int insert(Comment data) {
        int ketqua=0;
        validateComment(data);
        
        String query = "INSERT INTO comments (content, id_user, id_lesson) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, data.getContent());
            statement.setInt(2, data.getUser().getId());
            statement.setInt(3, data.getLesson().getId());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm không thành công","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to create comment due to an error: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }


    @Override
    public int update(Comment data) {
        int ketqua=0;
        validateComment(data);
        String query = "UPDATE comments SET content = ?, id_user = ?, id_lesson = ? WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, data.getContent());
            statement.setInt(2, data.getUser().getId());
            statement.setInt(3, data.getLesson().getId());
            statement.setInt(4, data.getId());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Comment updated successfully","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "False to update comment","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update comment due to an error: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }

    @Override
    public int delete(Comment data) {
        int ketqua=0;
        String query = "DELETE FROM comments WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, data.getId());
            ketqua = statement.executeUpdate();
            if (ketqua > 0) {
                JOptionPane.showMessageDialog(null, "Comment deleted successfully","Thanh cong", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "False to delete comment","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to delete comment due to an error: " + e.getMessage(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketqua;
    }

    @Override
    public Comment selectById(int id) {
        String query = "SELECT * FROM comments WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Comment comment = new Comment();
                comment.setId(resultSet.getInt("id"));
                comment.setContent(resultSet.getString("content"));
                Account user = AccountDAO.getInstance().selectById(resultSet.getInt("id_user"));
                comment.setUser(user);
                Lesson lesson = lessonService.selectById(resultSet.getInt("id_lesson"));
                comment.setLesson(lesson);
                return comment;
            } else {
                JOptionPane.showMessageDialog(null, "khong tim thay comment nay ","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Comment> selectAll() {
        String query = "SELECT * FROM comments";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Comment> comments = new ArrayList<>();
            while (resultSet.next()) {
                Comment comment = new Comment();
                comment.setId(resultSet.getInt("id"));
                comment.setContent(resultSet.getString("content"));
                Account user = AccountDAO.getInstance().selectById(resultSet.getInt("id_user"));
                comment.setUser(user);
                Lesson lesson = lessonService.selectById(resultSet.getInt("id_lesson"));
                comment.setLesson(lesson);
                comments.add(comment);
            }
            return comments;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Comment> search(String key) {
        String query = "SELECT * FROM comments WHERE content LIKE ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "%" + key + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Comment> comments = new ArrayList<>();
            while (resultSet.next()) {
                Comment comment = new Comment();
                comment.setId(resultSet.getInt("id"));
                comment.setContent(resultSet.getString("content"));
                Account user = AccountDAO.getInstance().selectById(resultSet.getInt("id_user"));
                comment.setUser(user);
                Lesson lesson = lessonService.selectById(resultSet.getInt("id_lesson"));
                comment.setLesson(lesson);
                comments.add(comment);
            }
            return comments;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {

    }

    
}
