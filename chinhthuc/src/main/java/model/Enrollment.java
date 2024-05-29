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

public class Enrollment implements Serializable {
    private int id;
    private Account user;
    private Course course;
    private String start_date;
    private String finish_date;
    private int status;

    public Enrollment() {
    }

    public Enrollment(int id, Account user, Course course, String start_date, String finish_date, int status) {
        this.id = id;
        this.user = user;
        this.course = course;
        this.start_date = start_date;
        this.finish_date = finish_date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(String finish_date) {
        this.finish_date = finish_date;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", user=" + user +
                ", course=" + course +
                ", start_date=" + start_date +
                ", finish_date=" + finish_date +
                ", status=" + status +
                '}';
    }
}
