/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AccountDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;

/**
 *
 * @author sinh
 */
public class SearchAccount {

    public static SearchAccount getInstance() {
        return new SearchAccount();
    }

    public ArrayList<Account> searchTatCaAcc(String text) throws SQLException {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> armt = AccountDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getUserName().toLowerCase().contains(text.toLowerCase())
                    || ncc.getRole().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchFullName(String text) throws SQLException {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> armt = AccountDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getUserName().toLowerCase().contains(text.toLowerCase())) { 
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchEmail(String text) throws SQLException {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> armt = AccountDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getEmail().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchRole(String text) throws SQLException {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> armt = AccountDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getRole().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
}
