/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiSuperAdmin;

import guiManager.AdminDashboard;
import guiManager.EmployeeManageQR;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.mySQL;

/**
 *
 * @author Geeth Kalhara
 */
public class AddUser extends javax.swing.JFrame {

    
    HashMap<String,String> usertypemap = new HashMap<>();
    
    public AddUser(String mobile,String name,String email) {
        initComponents();
        loadUserType();
        
        jTextField5.setText(mobile);
        jTextField6.setText(name);
        jTextField7.setText(email);
        
        
 
        
        
    }
    
    
        public JTextField getjTextField5() {

        return jTextField5;

    }

    public JTextField getjTextField6() {

        return jTextField6;

    }

    public JTextField getjTextField7() {

        return jTextField7;

    }

    public JTextField getjTextField8() {

        return jTextField8;

    }

    
    

       private void loadUserType() {
        try {
            ResultSet result = mySQL.executeSearch("SELECT * FROM `user_type`");

            Vector<String> v = new Vector<>();
            v.add("Select");

            while (result.next()) {

                v.add(result.getString("type"));
                usertypemap.put(result.getString("type"), result.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(v);
            jComboBox2.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 578));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 578));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(380, 70));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add User");
        jPanel6.add(jLabel7);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(380, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(380, 70));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setPreferredSize(new java.awt.Dimension(2, 70));
        jPanel14.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee");
        jPanel14.add(jLabel4);

        jButton1.setBackground(new java.awt.Color(24, 119, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Find");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1);

        jPanel13.add(jPanel14);

        jPanel10.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(380, 5));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setPreferredSize(new java.awt.Dimension(380, 70));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(189, 70));
        jPanel18.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Mobile");
        jPanel18.add(jLabel5);
        jPanel18.add(jTextField5);

        jPanel16.add(jPanel18, java.awt.BorderLayout.LINE_START);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setPreferredSize(new java.awt.Dimension(2, 70));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel21.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee Name");
        jPanel21.add(jLabel6);
        jPanel21.add(jTextField6);

        jPanel19.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel22.setPreferredSize(new java.awt.Dimension(380, 5));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setPreferredSize(new java.awt.Dimension(380, 70));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setPreferredSize(new java.awt.Dimension(189, 70));
        jPanel25.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        jPanel25.add(jLabel8);
        jPanel25.add(jTextField7);

        jPanel24.add(jPanel25, java.awt.BorderLayout.LINE_START);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setPreferredSize(new java.awt.Dimension(2, 70));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel27, java.awt.BorderLayout.LINE_START);

        jPanel28.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel28.add(jLabel9);
        jPanel28.add(jTextField8);

        jPanel26.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel30.setPreferredSize(new java.awt.Dimension(380, 5));
        jPanel30.setLayout(new java.awt.BorderLayout());
        jPanel29.add(jPanel30, java.awt.BorderLayout.PAGE_START);

        jPanel31.setLayout(new java.awt.BorderLayout());

        jPanel32.setPreferredSize(new java.awt.Dimension(380, 70));
        jPanel32.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Type");
        jPanel32.add(jLabel10);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel32.add(jComboBox2);

        jPanel31.add(jPanel32, java.awt.BorderLayout.PAGE_START);

        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel34.setPreferredSize(new java.awt.Dimension(380, 20));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel34, java.awt.BorderLayout.PAGE_START);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel40.setPreferredSize(new java.awt.Dimension(380, 20));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel40, java.awt.BorderLayout.PAGE_START);

        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel42.setLayout(new java.awt.GridLayout(4, 2, 7, 2));

        jButton2.setBackground(new java.awt.Color(24, 119, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel42.add(jButton2);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.setBorderPainted(false);
        jPanel42.add(jButton4);

        jPanel41.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel39.add(jPanel41, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel39, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel33, java.awt.BorderLayout.CENTER);

        jPanel29.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//      EmployeeManageQR EmployeeManage = new EmployeeManageQR(this, true);
//      EmployeeManage.setVisible(true);

        new EmployeeManage(this, true).show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                jTextField5.grabFocus();

        String Mobile = jTextField5.getText();
        String Name = jTextField6.getText();
          String Email = jTextField7.getText();
            String Password = jTextField8.getText();
        String Usertype = String.valueOf(jComboBox2.getSelectedItem());
       
        if (Mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Your First Name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (Email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Email Addreess", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if ( Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Your Password", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if ( Usertype.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Sellet Your User Type", "Warning", JOptionPane.WARNING_MESSAGE);
        
        } else {

            try {
                
                      ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `user` WHERE `email` = '" + Email + "' OR `employee_mobile` = '" + Mobile + "'");
          
              
              if(resultSet.next()){
                                  JOptionPane.showMessageDialog(this, "This employee already registered !", "Warning", JOptionPane.WARNING_MESSAGE);
              
              }else{


           

                mySQL.executeIUD("INSERT INTO `user`(`email`,`password`,`user_fname`,`employee_mobile`,`user_type_id`) "
                        + "VALUES('"+Email+"','"+Password+"','"+Name+"','"+Mobile+"','"+usertypemap.get(Usertype)+"')");

//                reset();

                this.dispose();
              
              }        
            } catch (Exception e) {
            e.printStackTrace();
            }
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddUser().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
