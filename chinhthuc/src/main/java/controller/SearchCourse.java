package controller;

import dao.CourseService;
import dao.AccountDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Course;

/**
 *
 * @author sinh
 */
public class SearchCourse {
    
    CourseService daoCourse = null;
    AccountDAO daoUser = null;
    
    public SearchCourse() throws SQLException{
        daoUser = new AccountDAO();
        daoCourse = new CourseService(daoUser);
    }
    
    
    public static SearchCourse getInstance() throws SQLException {
        return new SearchCourse();
    }

    public ArrayList<Course> searchTatCa(String text) throws SQLException{
        ArrayList<Course> result = new ArrayList<>();
        ArrayList<Course> armt = daoCourse.selectAll();
        for (var mt : armt) {
            
            if (mt.getName().toLowerCase().contains(text.toLowerCase()) || mt.getUser().getUserName().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Course> searchTenKhoaHoc(String text) throws SQLException{
        ArrayList<Course> result = new ArrayList<>();
        ArrayList<Course> armt = daoCourse.selectAll();
        for (var mt : armt) {
            if (mt.getName().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }


    public ArrayList<Course> searchDonGia(String text) throws SQLException{
        ArrayList<Course> result = new ArrayList<>();
        ArrayList<Course> armt = daoCourse.selectAll();
        for (var mt : armt) {
            if (text.length() != 0) {
                if (mt.getPrice() > Integer.parseInt(text)) {
                    result.add(mt);
                }
            }
            else {
                result.add(mt);
            }
        }
        return result;
    }
    
    public ArrayList<Course> searchGiaoVien(String text) throws SQLException{
        ArrayList<Course> result = new ArrayList<>();
        ArrayList<Course> armt = daoCourse.selectAll();
        for (var mt : armt) {
            if (mt.getUser().getUserName().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }
}
