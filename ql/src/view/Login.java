/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import controller.Hash;
import dao.AccountDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import model.Account;

/**
 *
 * @author Hoan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    Connection con = null;
    Resultset rs = null;
    Color panDefualt, panEnter, panClick;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        UIManager.put("Button.focus", Color.white);
        panDefualt = new Color(89, 168, 105);
        panClick = new Color(89, 168, 120);
        panEnter = new Color(89, 168, 120);
        JPaneSignUp.setBackground(panDefualt);
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        JPaneSignUp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JPaneLogin1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào phần mềm");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(13, 39, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐĂNG NHẬP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 410, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 580));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 110, 40));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 260, -1));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 260, -1));

        loginUser.setBackground(new java.awt.Color(13, 39, 51));
        loginUser.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        loginUser.setForeground(new java.awt.Color(255, 255, 255));
        loginUser.setText("admin");
        loginUser.setBorder(null);
        loginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginUserMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUserMousePressed(evt);
            }
        });
        loginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserActionPerformed(evt);
            }
        });
        loginUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUserKeyPressed(evt);
            }
        });
        jPanel1.add(loginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 260, 30));

        passwordUser.setBackground(new java.awt.Color(13, 39, 51));
        passwordUser.setForeground(new java.awt.Color(255, 255, 255));
        passwordUser.setText("123456");
        passwordUser.setBorder(null);
        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });
        jPanel1.add(passwordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 260, 30));

        JPaneSignUp.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        JPaneSignUp.setToolTipText("");
        JPaneSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPaneSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneSignUpMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneSignUpMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng ký");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPaneSignUpLayout = new javax.swing.GroupLayout(JPaneSignUp);
        JPaneSignUp.setLayout(JPaneSignUpLayout);
        JPaneSignUpLayout.setHorizontalGroup(
            JPaneSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneSignUpLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        JPaneSignUpLayout.setVerticalGroup(
            JPaneSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneSignUpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPaneSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 270, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 130, 40));

        JPaneLogin1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        JPaneLogin1.setToolTipText("");
        JPaneLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPaneLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneLogin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPaneLogin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPaneLogin1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPaneLogin1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneLogin1MouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Đăng nhập");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPaneLogin1Layout = new javax.swing.GroupLayout(JPaneLogin1);
        JPaneLogin1.setLayout(JPaneLogin1Layout);
        JPaneLogin1Layout.setHorizontalGroup(
            JPaneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLogin1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        JPaneLogin1Layout.setVerticalGroup(
            JPaneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLogin1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPaneLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_loginUserActionPerformed

    private void loginUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseEntered
        // TODO add your handling code here:    
    }//GEN-LAST:event_loginUserMouseEntered

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());

    }//GEN-LAST:event_formKeyPressed

    private void loginUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            checkLogin();
        }
    }//GEN-LAST:event_loginUserKeyPressed

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            checkLogin();
        }
    }//GEN-LAST:event_passwordUserKeyPressed

    private void loginUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginUserMousePressed

    private void JPaneLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLogin1MouseClicked
        // TODO add your handling code here:
        checkLogin();
    }//GEN-LAST:event_JPaneLogin1MouseClicked

    private void JPaneLogin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLogin1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLogin1MouseEntered

    private void JPaneLogin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLogin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLogin1MouseExited

    private void JPaneLogin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLogin1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLogin1MousePressed

    private void JPaneLogin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLogin1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLogin1MouseReleased

    private void JPaneSignUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneSignUpMouseReleased
        // TODO add your handling code here:
        JPaneSignUp.setBackground(panClick);
    }//GEN-LAST:event_JPaneSignUpMouseReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        checkLogin();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void JPaneSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneSignUpMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Register rs = new Register();
        rs.setVisible(true);
    }//GEN-LAST:event_JPaneSignUpMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Register rs = new Register();
        rs.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void checkLogin() {
    String usercheck = loginUser.getText();
    String passwordcheck = passwordUser.getText();
//    System.out.println("Attempting login with username: " + usercheck);
    if (usercheck.equals("") || passwordcheck.equals("")) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
    } else {
        
        try {
            AccountDAO dao = new AccountDAO();
            Account acc = dao.find(usercheck);
            System.out.println("User found: " + (acc != null));
            System.out.println(acc);
            if (acc == null) {
                JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại trên hệ thống !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
            } else {
                
                if (Hash.verifySignature(passwordcheck, acc.getPassword())) {
                    System.out.println("Password verified: " + acc.getUserName());
                    if (acc.getStatus() == 1) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        this.dispose();
                        String role = acc.getRole();
                        System.out.println("User role: " + role);
                        if (role.equals("admin")) {
                            Admin ad = new Admin(acc);
                            ad.setVisible(true);
                            ad.setName(acc.getUserName());
                        }
                        if (role.equals("teacher")) {
                            Teacher tc = new Teacher(acc);
                            tc.setVisible(true);
                            tc.setName(acc.getUserName());
                        }
                        if(role.equals("student")){
                            Student st = new Student(acc);
                            st.setVisible(true);
                            st.setName(acc.getUserName());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản của bạn đã bị khóa !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPaneLogin1;
    private javax.swing.JPanel JPaneSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables
}
