/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import view.AccountForm;
import model.Account;
import dao.AccountDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class UpdateAccount extends javax.swing.JDialog {

    /**
     * Creates new form AddAccount
     */
    private AccountForm homeAcc;

    public UpdateAccount(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) throws SQLException {
        super(owner, modal);
        initComponents();
        setLocationRelativeTo(null);
        homeAcc = (AccountForm) parent;
        Account acc = homeAcc.getAccountSelect();
        txtId.setText(createIdLT());
        txtId.setEditable(false);
        txtfullname1.setText(acc.getUserName());
        txtEmail.setText(acc.getEmail());
        vaitro.setSelectedItem(acc.getRole());
        trangthai.setSelectedIndex(acc.getStatus());
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
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        vaitro = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        trangthai = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtfullname1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa tài khoản");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 298, 38));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel5.setText("Vai trò");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 50, -1));

        vaitro.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        vaitro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "teacher", "student" }));
        vaitro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaitroActionPerformed(evt);
            }
        });
        jPanel1.add(vaitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 298, 38));

        btnupdate.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnupdate.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Cập nhật");
        btnupdate.setBorder(null);
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, 38));

        btnClose.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        btnClose.setText("Huỷ");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 140, 38));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CẬP NHẬT THÔNG TIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel6.setText("Trạng thái");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 90, -1));

        trangthai.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        trangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bị Khóa", "Hoạt động" }));
        trangthai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangthaiActionPerformed(evt);
            }
        });
        jPanel1.add(trangthai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 298, 38));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 40));

        txtfullname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfullname1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtfullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 298, 38));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel3.setText("Tên tài khoản");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    
    public String createIdLT() throws SQLException {
        Account account = AccountDAO.getInstance().find(homeAcc.getAccountSelect().getUserName());
        
        return ""+(account.getId()); 
    }
    
    
    
    
    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(txtId.getText());
            String fullName = txtfullname1.getText();
            String password = homeAcc.getAccountSelect().getPassword();
            String role = vaitro.getSelectedItem().toString();
            String email = txtEmail.getText();
            int status = trangthai.getSelectedIndex();
            
            if(AddAccount.isValid(email)){
                Account acc = new Account(id, fullName, password, role, status, email);
                AccountDAO.getInstance().update(acc);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công !");
                homeAcc.loadDataToTable(AccountDAO.getInstance().selectAll());
            }else{
                JOptionPane.showMessageDialog(this, "Vui lòng nhập email đúng định dạng !", "Cảnh báo =", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnupdateMouseClicked

    private void vaitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaitroActionPerformed

    private void trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trangthaiActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtfullname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfullname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfullname1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> trangthai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtfullname1;
    private javax.swing.JComboBox<String> vaitro;
    // End of variables declaration//GEN-END:variables
}