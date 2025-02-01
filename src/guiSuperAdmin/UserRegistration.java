/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package guiSuperAdmin;

import com.formdev.flatlaf.FlatClientProperties;
import guiManager.AdminDashboard;
import guiManager.EmployeeAddress;
import guiManager.EmployeeManage;
import guiManager.EmployeeManageQR;
import guiManager.SupplierregistrationNew;
import guiManager.UpdateEmployee;
import guiManager.UpdateMovie;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.mySQL;

/**
 *
 * @author user
 */
public class UserRegistration extends javax.swing.JPanel {

    EmployeeManageQR emp;
  AddUser AU;

    
 
    
    public UserRegistration() {
        initComponents();

        
        loadUserDate();
        reload();

        
   }
    
    
      private void reload(){
    
        java.lang.Runnable runnable = new java.lang.Runnable() {
            @Override
            public void run() {

                while (true) {

                   loadUserDate();

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        };

        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.start();
    
    }
private void loadUserDate(){
    
      try {
            ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `user`"
                    + "INNER JOIN `employee` ON `user`.`employee_mobile` = `employee`.`mobile`"
                    + "INNER JOIN `user_type` on `user`.`user_type_id` = `user_type`.`id`");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("email"));
                vector.add(resultSet.getString("password"));
                vector.add(resultSet.getString("user_fname"));
                vector.add(resultSet.getString("employee_mobile"));
                vector.add(resultSet.getString("user_type.type"));
            

                dtm.addRow(vector);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
//
//    private void hint() {
//        if (jTextField5 != null) {
//            jTextField5.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Employee Mobile");
//        }
//        if (jTextField6 != null) {
//            jTextField6.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Employee Name");
//        }
//        if (jTextField2 != null) {
//            jTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Employee Email");
//        }if (jTextField3 != null) {
//            jTextField3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter Password");
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1208, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(898, 10));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 423));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 423));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(898, 10));
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(1188, 50));
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Registration");
        jPanel14.add(jLabel1);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setPreferredSize(new java.awt.Dimension(1188, 5));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setPreferredSize(new java.awt.Dimension(1188, 45));
        jPanel21.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel11.setPreferredSize(new java.awt.Dimension(200, 45));
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(24, 119, 242));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Add User");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3);

        jPanel21.add(jPanel11, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setPreferredSize(new java.awt.Dimension(1188, 5));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setPreferredSize(new java.awt.Dimension(5, 473));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel27, java.awt.BorderLayout.LINE_END);

        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Password", "First Name", "Mobile", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel28.add(jScrollPane1);

        jPanel26.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          AddUser adduser = new AddUser(null,null,null);
          adduser.setVisible(true);
          

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            
              int row = jTable1.getSelectedRow();
              String email = String.valueOf(jTable1.getValueAt(row, 0));
                            String Password = String.valueOf(jTable1.getValueAt(row, 1));
                                          String firstname = String.valueOf(jTable1.getValueAt(row, 2));
                 String mobile = String.valueOf(jTable1.getValueAt(row, 3));
                   String usertype = String.valueOf(jTable1.getValueAt(row, 4));
                   
                     
                   UpdateUser updateUser = new UpdateUser(mobile, firstname, email,Password, usertype);
                   
                   updateUser.setVisible(true);
                   
                   
//            AU.getjTextField6().setText(firstname);
//            AU.getjTextField7().setText(email);
//            AU.getjTextField8().setText(Password);
//            AU.getjTextField5().setText(mobile);
            
           
              
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
