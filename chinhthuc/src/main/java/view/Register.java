/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author HOAN
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        passwordUser1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginUser1 = new javax.swing.JTextField();
        JPaneRegister1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(797, 578));
        setSize(new java.awt.Dimension(797, 578));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đăng ký");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 270, 80));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jPanel1.setBackground(new java.awt.Color(13, 39, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng ký");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 270, 80));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 580));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 110, 40));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 260, 0));

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 194, 260, -1));

        txtemail.setBackground(new java.awt.Color(13, 39, 51));
        txtemail.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtemailMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtemailMousePressed(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 130, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "teacher", "student" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 270, 40));

        passwordUser1.setBackground(new java.awt.Color(13, 39, 51));
        passwordUser1.setForeground(new java.awt.Color(255, 255, 255));
        passwordUser1.setBorder(null);
        passwordUser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUser1KeyPressed(evt);
            }
        });
        jPanel1.add(passwordUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 260, 30));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 260, -1));

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 260, 0));

        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 312, 260, -1));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 130, 40));

        loginUser1.setBackground(new java.awt.Color(13, 39, 51));
        loginUser1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        loginUser1.setForeground(new java.awt.Color(255, 255, 255));
        loginUser1.setBorder(null);
        loginUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginUser1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUser1MousePressed(evt);
            }
        });
        loginUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUser1ActionPerformed(evt);
            }
        });
        loginUser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUser1KeyPressed(evt);
            }
        });
        jPanel1.add(loginUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 260, 30));

        JPaneRegister1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        JPaneRegister1.setToolTipText("");
        JPaneRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPaneRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneRegister1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPaneRegister1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPaneRegister1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPaneRegister1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneRegister1MouseReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Đăng ký");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPaneRegister1Layout = new javax.swing.GroupLayout(JPaneRegister1);
        JPaneRegister1.setLayout(JPaneRegister1Layout);
        JPaneRegister1Layout.setHorizontalGroup(
            JPaneRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneRegister1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        JPaneRegister1Layout.setVerticalGroup(
            JPaneRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneRegister1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPaneRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 270, 40));

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Thoát");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 105, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 377, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailMouseEntered

    private void txtemailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailMousePressed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            checkRegister();
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void passwordUser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUser1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUser1KeyPressed

    private void loginUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUser1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1MouseEntered

    private void loginUser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUser1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1MousePressed

    private void loginUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1ActionPerformed

    private void loginUser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUser1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1KeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:

        checkRegister();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void JPaneRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneRegister1MouseClicked
        // TODO add your handling code here:
        checkRegister();
    }//GEN-LAST:event_JPaneRegister1MouseClicked

    private void JPaneRegister1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneRegister1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneRegister1MouseEntered

    private void JPaneRegister1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneRegister1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneRegister1MouseExited

    private void JPaneRegister1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneRegister1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneRegister1MousePressed

    private void JPaneRegister1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneRegister1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneRegister1MouseReleased

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_jLabel14MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    
    public void checkRegister() {
        String usercheck = loginUser1.getText();
        String passwordcheck = passwordUser1.getText();
        String role = jComboBox1.getSelectedItem().toString();
        String email = txtemail.getText();
    //    System.out.println("Attempting login with username: " + usercheck);
        if (usercheck.equals("") || passwordcheck.equals("") || txtemail.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                AccountDAO dao = new AccountDAO();
                Account acc = dao.find(usercheck);
                System.out.println("User found: " + (acc != null));
                if (acc != null) {
                    JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại trên hệ thống !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                } else {
                    if(!isValid(email)){
                        JOptionPane.showMessageDialog(this, "email không đúng định dạng !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                    }else{
                        Account account = new Account();
                        account.setUserName(usercheck);
                        account.setPassword(passwordcheck);
                        account.setEmail(email);
                        account.setRole(role);
                        account.setStatus(1);
                        dao.insert(account);
                        JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công !", "Thành công !", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPaneRegister1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField loginUser1;
    private javax.swing.JPasswordField passwordUser1;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
