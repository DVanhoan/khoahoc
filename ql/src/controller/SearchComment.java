/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.CommentService;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;
import model.Comment;

/**
 *
 * @author sinh
 */
public class SearchComment {
    
    

    public static SearchComment getInstance() {
        return new SearchComment();
    }

    public ArrayList<Comment> searchTatCaAcc(String text) throws SQLException {
        ArrayList<Comment> result = new ArrayList<>();
        ArrayList<Comment> armt = CommentService.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getContent().toLowerCase().contains(text.toLowerCase())
                || ncc.getUser().getUserName().toLowerCase().contains(text.toLowerCase())
                || ncc.getLesson().getTitle().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Comment> searchContent(String text) throws SQLException {
        ArrayList<Comment> result = new ArrayList<>();
        ArrayList<Comment> armt = CommentService.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getContent().toLowerCase().contains(text.toLowerCase())) { 
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Comment> searchUser(String text) throws SQLException {
        ArrayList<Comment> result = new ArrayList<>();
        ArrayList<Comment> armt = CommentService.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getUser().getUserName().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Comment> searchlesson(String text) throws SQLException {
        ArrayList<Comment> result = new ArrayList<>();
        ArrayList<Comment> armt = CommentService.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getLesson().getTitle().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
}
