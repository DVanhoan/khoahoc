/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AccountDAO;
import dao.CourseService;
import dao.LessonService;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Lesson;

/**
 *
 * @author Hoan
 */
public class SearchLesson {
    
    LessonService daoLesson = null;
    CourseService daoCourse = null;
    AccountDAO daoUser = null;

    public static SearchLesson getInstance() throws SQLException {
        return new SearchLesson();
    }
    
    public SearchLesson() throws SQLException{
        daoUser = new AccountDAO();
        daoCourse = new CourseService(daoUser);
        daoLesson = new LessonService(daoCourse);
    }

    public ArrayList<Lesson> searchTatCa(String text) {
        ArrayList<Lesson> result = new ArrayList<>();
        ArrayList<Lesson> armt = daoLesson.selectAll();
        for (var lesson : armt) {
            boolean matchesTitle = lesson.getTitle() != null && lesson.getTitle().toLowerCase().contains(text.toLowerCase());
            boolean matchesDescription = lesson.getDescription() != null && lesson.getDescription().toLowerCase().contains(text.toLowerCase());
            boolean matchesVideo = lesson.getVideo() != null && lesson.getVideo().toLowerCase().contains(text.toLowerCase());
            boolean matchesCourse = lesson.getCourse() != null && lesson.getCourse().getName() != null && lesson.getCourse().getName().toLowerCase().contains(text.toLowerCase());

            if (matchesTitle || matchesDescription || matchesVideo || matchesCourse) {
                result.add(lesson);
            }
        }
        return result;
    }


    public ArrayList<Lesson> searchTenBaiHoc(String text) {
        ArrayList<Lesson> result = new ArrayList<>();
        ArrayList<Lesson> armt = daoLesson.selectAll();
        for (var lesson : armt) {
            if (lesson.getTitle().toLowerCase().contains(text.toLowerCase())) {
                result.add(lesson);
            }
        }
        return result;
    }

    public ArrayList<Lesson> searchMoTa(String text) {
        ArrayList<Lesson> result = new ArrayList<>();
        ArrayList<Lesson> armt = daoLesson.selectAll();
        for (var lesson : armt) {
            if (lesson.getDescription().toLowerCase().contains(text.toLowerCase())) {
                result.add(lesson);
            }
        }
        return result;
    }

    public ArrayList<Lesson> searchKhoaHoc(String text) {
        ArrayList<Lesson> result = new ArrayList<>();
        ArrayList<Lesson> armt = daoLesson.selectAll();
        for (var lesson : armt) {
            if (lesson.getCourse() != null && lesson.getCourse().getName() != null && lesson.getCourse().getName().toLowerCase().contains(text.toLowerCase())) {
                result.add(lesson);
            }
        }

        return result;
    }

    public ArrayList<Lesson> searchVideo(String text) {
        ArrayList<Lesson> result = new ArrayList<>();
        ArrayList<Lesson> armt = daoLesson.selectAll();
        for (var lesson : armt) {
            if (lesson.getVideo().toLowerCase().contains(text.toLowerCase())) {
                result.add(lesson);
            }
        }
        return result;
    }
}
