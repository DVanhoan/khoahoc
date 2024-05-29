/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import controller.Hash;
import database.MySQLConnection;

import java.sql.SQLException;

import model.Account;

public class AccountDAO implements DAOInterface<Account> {
    
//    private static AccountDAO instance;
    Connection con = MySQLConnection.getInstance().getConnection();

    public AccountDAO() throws SQLException {
    }
    
    public static AccountDAO getInstance() throws SQLException {
        return new AccountDAO();
    }

    @Override
    public int insert(Account t) {
        int ketQua = 0;
        try {
            String sql = "INSERT INTO users (id, username, password, role, status, email) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getId());
            pst.setString(2, t.getUserName());
            pst.setString(3, Hash.signData( t.getPassword()));
            pst.setString(4, t.getRole());
            pst.setInt(5, t.getStatus());
            pst.setString(6, t.getEmail());
            ketQua = pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Account t) {
        int ketQua = 0;
        try {
            String sql = "UPDATE users SET username=?, password=?, role=?, status=?, email=? WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUserName());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getRole());
            pst.setInt(4, t.getStatus());
            pst.setInt(6, t.getId());
            pst.setString(5, t.getEmail());

            ketQua = pst.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Account t) {
        int ketQua = 0;
        try {
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getId());
            ketQua = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> selectAll() {
        ArrayList<Account> result = new ArrayList<>();
        String query = "SELECT * FROM users";
        try {
            con = MySQLConnection.getInstance().getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                Account acc = new Account(
                    rs.getInt("id"),
                    rs.getString("userName"),
                    rs.getString("password"),
                    rs.getString("role"),
                    rs.getInt("status"),
                    rs.getString("email"));
                result.add(acc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    
    public ArrayList<Account> selectTeacher() {
        ArrayList<Account> ketQua = new ArrayList<Account>();
        String sql =  "SELECT * FROM users WHERE role IN ('teacher', 'admin')";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");

                Account acc = new Account(id, username, password, role, status, email);
                ketQua.add(acc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Account> selectStudent() {
        ArrayList<Account> ketQua = new ArrayList<Account>();
        String sql =  "SELECT * FROM users WHERE role IN ('student', 'admin')";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");

                Account acc = new Account(id, username, password, role, status, email);
                ketQua.add(acc);

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public Account find(String t) {
        Account acc = null;
        String sql = "select * from users where username = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String role = rs.getString("role");
                    int status = rs.getInt("status");
                    String email = rs.getString("email");
                    acc = new Account(id, username, password, role, status, email);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acc;
    }



    
    
    
    public Account selectById(int id) {
        Account acc = null;
        String sql = "SELECT * FROM users WHERE id=?";  
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int idUser = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String role = rs.getString("role");
                    int status = rs.getInt("status");
                    String email = rs.getString("email");
                    acc = new Account(idUser, username, password, role, status, email);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  // Consider a more robust error handling strategy
        }
        return acc;
    }


    
    
    public int updatePassword(String email, String password) {
        int ketQua = 0;
        try {
            String sql = "UPDATE users SET password=? WHERE email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, password);
            pst.setString(2, email);

            ketQua = pst.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    public static void main(String[] args) throws SQLException {
        Account Minh = new Account(3, "Võ Chí Luân", "123", "teacher", 1, "luan@gmail.com");
        AccountDAO dao = new AccountDAO();
//        dao.insert(Minh);
        dao.find(Minh.getUserName());
    }

    
    }
