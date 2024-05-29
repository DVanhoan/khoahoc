/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HOAN
 */
import java.io.Serializable;

public class Comment implements Serializable {
    private int id;
    private String content;
    private Account user;
    private Lesson lesson;


    public Comment(int id, String content, Account user) {
        this.id = id;
        this.content = content;
        this.user = user;
    }

    public Comment(int id, String content, Account user, Lesson lesson) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.lesson = lesson;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }



    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", lesson=" + lesson +
                '}';
    }
}
