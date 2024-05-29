/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import dao.CourseService;
import model.Account;
import dao.AccountDAO;
import dao.EnrollmentService;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import model.Course;
import model.Enrollment;

import javax.swing.*;

/**
 *
 * @author Hoan
 */
public class AddEnro extends javax.swing.JDialog {

    /**
     * Creates new form AddAccount
     */
    private EnrollmentForm homeAcc;
    
    EnrollmentService serviceEnro;
    CourseService daocourse;
    AccountDAO daouser;

    public AddEnro(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) throws SQLException {
        super(owner, modal);
        initComponents();
        setmodeltime();
        setLocationRelativeTo(null);
        init();
        homeAcc = (EnrollmentForm) parent;
    }
    
    
    public void init() throws SQLException {
        serviceEnro = new EnrollmentService();
        daouser = new AccountDAO();
        daocourse = new CourseService(daouser);

        ArrayList<Account> allAccount = daouser.selectStudent();
        for (Account account : allAccount) {
            cbx_user.addItem(account.getUserName());
        }

        ArrayList<Course> allCourse = daocourse.selectAll();
        for (Course course : allCourse) {
            cbx_course1.addItem(course.getName());
        }
    }


    public void setmodeltime(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbx_time.getModel();
        model.addElement("3 tháng");
        model.addElement("6 tháng");
        model.addElement("1 năm");
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
        button_dk = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_user = new javax.swing.JComboBox<>();
        button_dk1 = new javax.swing.JButton();
        btn_huy1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbx_time = new javax.swing.JComboBox<>();
        cbx_course1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm tài khoản mới");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_dk.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        button_dk.setForeground(new java.awt.Color(255, 255, 255));
        button_dk.setText("Đăng ký");
        button_dk.setBorder(null);
        button_dk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_dk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_dkMouseClicked(evt);
            }
        });
        jPanel1.add(button_dk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, 38));

        btn_huy.setText("Huỷ");
        btn_huy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 140, 38));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đăng Ký Khóa Học");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel6.setText("Người đăng ký");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel7.setText("khóa học");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 30));

        cbx_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cbx_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 298, 38));

        button_dk1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        button_dk1.setForeground(new java.awt.Color(255, 255, 255));
        button_dk1.setText("Đăng ký");
        button_dk1.setBorder(null);
        button_dk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_dk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_dk1MouseClicked(evt);
            }
        });
        jPanel3.add(button_dk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, 38));

        btn_huy1.setText("Huỷ");
        btn_huy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_huy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huy1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_huy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 140, 38));

        jPanel4.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Đăng Ký Khóa Học");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        cbx_time.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbx_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_timeActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 298, 38));

        cbx_course1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cbx_course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 298, 38));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel5.setText("Lộ trình");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_huyActionPerformed

    private void button_dkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_dkMouseClicked
        // TODO add your handling code here:
        String username = cbx_user.getSelectedItem().toString();
        Account user = daouser.find(username);
        String nameCourse = cbx_course1.getSelectedItem().toString();
        Course course = daocourse.find(nameCourse);

        LocalDate startLocalDate = LocalDate.now();  // Lấy ngày hiện tại
        String duration = cbx_time.getSelectedItem().toString();
        LocalDate endLocalDate = startLocalDate;  // Khởi tạo ngày kết thúc

        switch (duration) {
            case "3 tháng":
                endLocalDate = startLocalDate.plusMonths(3);  // Thêm 3 tháng vào ngày bắt đầu
                break;
            case "6 tháng":
                endLocalDate = startLocalDate.plusMonths(6);  // Thêm 6 tháng vào ngày bắt đầu
                break;
            case "1 năm":
                endLocalDate = startLocalDate.plusYears(1);  // Thêm 1 năm vào ngày bắt đầu
                break;
        }
        // Chuyển đổi LocalDate sang java.sql.Date
        Date startday = Date.valueOf(startLocalDate);
        Date endday = Date.valueOf(endLocalDate);

        // Định dạng ngày để hiển thị (nếu cần)
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedStartDay = formatter.format(startday);
        String formattedEndDay = formatter.format(endday);

        serviceEnro.insert(new Enrollment(1, user, course, formattedStartDay, formattedEndDay ,1));
        homeAcc.loadDataToTable(serviceEnro.selectAll());

        
    }//GEN-LAST:event_button_dkMouseClicked

    private void button_dk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_dk1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dk1MouseClicked

    private void btn_huy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_huy1ActionPerformed

    private void cbx_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_timeActionPerformed

    public String createIdLT() throws SQLException {
        ArrayList<Enrollment> allAccount = serviceEnro.selectAll();
        int maxId = 0;
        for (Enrollment enro : allAccount) {
            int currentId = (enro.getId());
            if (currentId > maxId) {
                maxId = currentId;
            }
        }
        return ""+(maxId + 1); 
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_huy1;
    private javax.swing.JButton button_dk;
    private javax.swing.JButton button_dk1;
    private javax.swing.JComboBox<String> cbx_course1;
    private javax.swing.JComboBox<String> cbx_time;
    private javax.swing.JComboBox<String> cbx_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}