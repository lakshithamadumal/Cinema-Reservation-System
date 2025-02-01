/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package guiCashier;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.mySQL;

/**
 *
 * @author Laky
 */
public class Hall02 extends javax.swing.JDialog {

    CashierDashboard cd;
    
    
    public Hall02(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        disableBookedButtons();
        cd = (CashierDashboard) parent;
    }

    
    private void disableBookedButtons() {
    try {
        ResultSet resultSet = mySQL.executeSearch(
            "SELECT sheet.number FROM sheet " +
            "INNER JOIN hall ON sheet.hall_id = hall.id " +
            "LEFT JOIN movie_invoiceitem ON sheet.number = movie_invoiceitem.sheet_number " +
            "WHERE movie_invoiceitem.sheet_number IS NOT NULL;"
        );

        while (resultSet.next()) {
            String bookedSheet = resultSet.getString("number"); // e.g., 1A, 2A, ...

            switch (bookedSheet) {
                case "1B":
                    NO1.setEnabled(false);
                    break;
                case "2B":
                    NO2.setEnabled(false);
                    break;
                case "3B":
                    NO3.setEnabled(false);
                    break;
                case "4B":
                    NO4.setEnabled(false);
                    break;
                case "5B":
                    NO5.setEnabled(false);
                    break;
                case "6B":
                    NO6.setEnabled(false);
                    break;
                case "7B":
                    NO7.setEnabled(false);
                    break;
                case "8B":
                    NO8.setEnabled(false);
                    break;
                case "9B":
                    NO9.setEnabled(false);
                    break;
                case "10B":
                    NO10.setEnabled(false);
                    break;
                case "11B":
                    NO11.setEnabled(false);
                    break;
                case "12B":
                    NO12.setEnabled(false);
                    break;
                case "13B":
                    NO13.setEnabled(false);
                    break;
                case "14B":
                    NO14.setEnabled(false);
                    break;
                case "15B":
                    NO15.setEnabled(false);
                    break;
                case "16B":
                    NO16.setEnabled(false);
                    break;
                case "17B":
                    NO17.setEnabled(false);
                    break;
                case "18B":
                    NO18.setEnabled(false);
                    break;
                case "19B":
                    NO19.setEnabled(false);
                    break;
                case "20B":
                    NO20.setEnabled(false);
                    break;
                case "21B":
                    NO21.setEnabled(false);
                    break;
                case "22B":
                    NO22.setEnabled(false);
                    break;
                case "23B":
                    NO23.setEnabled(false);
                    break;
                case "24B":
                    NO24.setEnabled(false);
                    break;
                case "25B":
                    NO25.setEnabled(false);
                    break;
                case "26B":
                    NO26.setEnabled(false);
                    break;
                case "27B":
                    NO27.setEnabled(false);
                    break;
                case "28B":
                    NO28.setEnabled(false);
                    break;
                case "29B":
                    NO29.setEnabled(false);
                    break;
                case "30B":
                    NO30.setEnabled(false);
                    break;
                default:
                    //System.out.println("No matching button for sheet: " + bookedSheet);
            }
        }
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
        NO1 = new javax.swing.JButton();
        NO2 = new javax.swing.JButton();
        NO3 = new javax.swing.JButton();
        NO4 = new javax.swing.JButton();
        NO5 = new javax.swing.JButton();
        NO6 = new javax.swing.JButton();
        NO7 = new javax.swing.JButton();
        NO8 = new javax.swing.JButton();
        NO9 = new javax.swing.JButton();
        NO10 = new javax.swing.JButton();
        NO11 = new javax.swing.JButton();
        NO12 = new javax.swing.JButton();
        NO13 = new javax.swing.JButton();
        NO14 = new javax.swing.JButton();
        NO15 = new javax.swing.JButton();
        NO16 = new javax.swing.JButton();
        NO17 = new javax.swing.JButton();
        NO18 = new javax.swing.JButton();
        NO19 = new javax.swing.JButton();
        NO20 = new javax.swing.JButton();
        NO21 = new javax.swing.JButton();
        NO22 = new javax.swing.JButton();
        NO23 = new javax.swing.JButton();
        NO24 = new javax.swing.JButton();
        NO25 = new javax.swing.JButton();
        NO26 = new javax.swing.JButton();
        NO27 = new javax.swing.JButton();
        NO28 = new javax.swing.JButton();
        NO29 = new javax.swing.JButton();
        NO30 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(515, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(515, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 195));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 195));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(780, 200));
        jPanel6.setLayout(new java.awt.GridLayout(5, 6, 5, 5));

        NO1.setBackground(new java.awt.Color(24, 119, 242));
        NO1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO1.setText("NO.1");
        NO1.setBorderPainted(false);
        NO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO1ActionPerformed(evt);
            }
        });
        jPanel6.add(NO1);

        NO2.setBackground(new java.awt.Color(24, 119, 242));
        NO2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO2.setText("NO.2");
        NO2.setBorderPainted(false);
        NO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO2ActionPerformed(evt);
            }
        });
        jPanel6.add(NO2);

        NO3.setBackground(new java.awt.Color(24, 119, 242));
        NO3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO3.setText("NO.3");
        NO3.setBorderPainted(false);
        NO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO3ActionPerformed(evt);
            }
        });
        jPanel6.add(NO3);

        NO4.setBackground(new java.awt.Color(24, 119, 242));
        NO4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO4.setText("NO.4");
        NO4.setBorderPainted(false);
        NO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO4ActionPerformed(evt);
            }
        });
        jPanel6.add(NO4);

        NO5.setBackground(new java.awt.Color(24, 119, 242));
        NO5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO5.setText("NO.5");
        NO5.setBorderPainted(false);
        NO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO5ActionPerformed(evt);
            }
        });
        jPanel6.add(NO5);

        NO6.setBackground(new java.awt.Color(24, 119, 242));
        NO6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO6.setText("NO.6");
        NO6.setBorderPainted(false);
        NO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO6ActionPerformed(evt);
            }
        });
        jPanel6.add(NO6);

        NO7.setBackground(new java.awt.Color(24, 119, 242));
        NO7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO7.setText("NO.7");
        NO7.setBorderPainted(false);
        NO7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO7ActionPerformed(evt);
            }
        });
        jPanel6.add(NO7);

        NO8.setBackground(new java.awt.Color(24, 119, 242));
        NO8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO8.setText("NO.8");
        NO8.setBorderPainted(false);
        NO8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO8ActionPerformed(evt);
            }
        });
        jPanel6.add(NO8);

        NO9.setBackground(new java.awt.Color(24, 119, 242));
        NO9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO9.setText("NO.9");
        NO9.setBorderPainted(false);
        NO9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO9ActionPerformed(evt);
            }
        });
        jPanel6.add(NO9);

        NO10.setBackground(new java.awt.Color(24, 119, 242));
        NO10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO10.setText("NO.10");
        NO10.setBorderPainted(false);
        NO10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO10ActionPerformed(evt);
            }
        });
        jPanel6.add(NO10);

        NO11.setBackground(new java.awt.Color(24, 119, 242));
        NO11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO11.setText("NO.11");
        NO11.setBorderPainted(false);
        NO11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO11ActionPerformed(evt);
            }
        });
        jPanel6.add(NO11);

        NO12.setBackground(new java.awt.Color(24, 119, 242));
        NO12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO12.setText("NO.12");
        NO12.setBorderPainted(false);
        NO12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO12ActionPerformed(evt);
            }
        });
        jPanel6.add(NO12);

        NO13.setBackground(new java.awt.Color(24, 119, 242));
        NO13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO13.setText("NO.13");
        NO13.setBorderPainted(false);
        NO13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO13ActionPerformed(evt);
            }
        });
        jPanel6.add(NO13);

        NO14.setBackground(new java.awt.Color(24, 119, 242));
        NO14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO14.setText("NO.14");
        NO14.setBorderPainted(false);
        NO14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO14ActionPerformed(evt);
            }
        });
        jPanel6.add(NO14);

        NO15.setBackground(new java.awt.Color(24, 119, 242));
        NO15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO15.setText("NO.15");
        NO15.setBorderPainted(false);
        NO15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO15ActionPerformed(evt);
            }
        });
        jPanel6.add(NO15);

        NO16.setBackground(new java.awt.Color(24, 119, 242));
        NO16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO16.setText("NO.16");
        NO16.setBorderPainted(false);
        NO16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO16ActionPerformed(evt);
            }
        });
        jPanel6.add(NO16);

        NO17.setBackground(new java.awt.Color(24, 119, 242));
        NO17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO17.setText("NO.17");
        NO17.setBorderPainted(false);
        NO17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO17ActionPerformed(evt);
            }
        });
        jPanel6.add(NO17);

        NO18.setBackground(new java.awt.Color(24, 119, 242));
        NO18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO18.setText("NO.18");
        NO18.setBorderPainted(false);
        NO18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO18ActionPerformed(evt);
            }
        });
        jPanel6.add(NO18);

        NO19.setBackground(new java.awt.Color(24, 119, 242));
        NO19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO19.setText("NO.19");
        NO19.setBorderPainted(false);
        NO19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO19ActionPerformed(evt);
            }
        });
        jPanel6.add(NO19);

        NO20.setBackground(new java.awt.Color(24, 119, 242));
        NO20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO20.setText("NO.20");
        NO20.setBorderPainted(false);
        NO20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO20ActionPerformed(evt);
            }
        });
        jPanel6.add(NO20);

        NO21.setBackground(new java.awt.Color(24, 119, 242));
        NO21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO21.setText("NO.21");
        NO21.setBorderPainted(false);
        NO21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO21ActionPerformed(evt);
            }
        });
        jPanel6.add(NO21);

        NO22.setBackground(new java.awt.Color(24, 119, 242));
        NO22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO22.setText("NO.22");
        NO22.setBorderPainted(false);
        NO22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO22ActionPerformed(evt);
            }
        });
        jPanel6.add(NO22);

        NO23.setBackground(new java.awt.Color(24, 119, 242));
        NO23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO23.setText("NO.23");
        NO23.setBorderPainted(false);
        NO23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO23ActionPerformed(evt);
            }
        });
        jPanel6.add(NO23);

        NO24.setBackground(new java.awt.Color(24, 119, 242));
        NO24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO24.setText("NO.24");
        NO24.setBorderPainted(false);
        NO24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO24ActionPerformed(evt);
            }
        });
        jPanel6.add(NO24);

        NO25.setBackground(new java.awt.Color(24, 119, 242));
        NO25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO25.setText("NO.25");
        NO25.setBorderPainted(false);
        NO25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO25ActionPerformed(evt);
            }
        });
        jPanel6.add(NO25);

        NO26.setBackground(new java.awt.Color(24, 119, 242));
        NO26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO26.setText("NO.26");
        NO26.setBorderPainted(false);
        NO26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO26ActionPerformed(evt);
            }
        });
        jPanel6.add(NO26);

        NO27.setBackground(new java.awt.Color(24, 119, 242));
        NO27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO27.setText("NO.27");
        NO27.setBorderPainted(false);
        NO27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO27ActionPerformed(evt);
            }
        });
        jPanel6.add(NO27);

        NO28.setBackground(new java.awt.Color(24, 119, 242));
        NO28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO28.setText("NO.28");
        NO28.setBorderPainted(false);
        NO28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO28ActionPerformed(evt);
            }
        });
        jPanel6.add(NO28);

        NO29.setBackground(new java.awt.Color(24, 119, 242));
        NO29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO29.setText("NO.29");
        NO29.setBorderPainted(false);
        NO29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO29ActionPerformed(evt);
            }
        });
        jPanel6.add(NO29);

        NO30.setBackground(new java.awt.Color(24, 119, 242));
        NO30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NO30.setText("NO.30");
        NO30.setBorderPainted(false);
        NO30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO30ActionPerformed(evt);
            }
        });
        jPanel6.add(NO30);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(780, 10));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO1ActionPerformed
        cd.getSheet().setText("1B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO1ActionPerformed

    private void NO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO2ActionPerformed
       cd.getSheet().setText("2B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO2ActionPerformed

    private void NO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO3ActionPerformed
        cd.getSheet().setText("3B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO3ActionPerformed

    private void NO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO4ActionPerformed
        cd.getSheet().setText("4B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO4ActionPerformed

    private void NO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO5ActionPerformed
        cd.getSheet().setText("5B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO5ActionPerformed

    private void NO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO6ActionPerformed
        cd.getSheet().setText("6B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO6ActionPerformed

    private void NO7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO7ActionPerformed
        cd.getSheet().setText("7B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO7ActionPerformed

    private void NO8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO8ActionPerformed
        cd.getSheet().setText("8B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO8ActionPerformed

    private void NO9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO9ActionPerformed
       cd.getSheet().setText("9B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO9ActionPerformed

    private void NO10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO10ActionPerformed
       cd.getSheet().setText("10B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO10ActionPerformed

    private void NO11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO11ActionPerformed
       cd.getSheet().setText("11B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO11ActionPerformed

    private void NO12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO12ActionPerformed
       cd.getSheet().setText("12B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO12ActionPerformed

    private void NO13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO13ActionPerformed
       cd.getSheet().setText("13B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO13ActionPerformed

    private void NO14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO14ActionPerformed
        cd.getSheet().setText("14B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO14ActionPerformed

    private void NO15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO15ActionPerformed
        cd.getSheet().setText("15B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO15ActionPerformed

    private void NO16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO16ActionPerformed
        cd.getSheet().setText("16B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO16ActionPerformed

    private void NO17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO17ActionPerformed
        cd.getSheet().setText("17B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO17ActionPerformed

    private void NO18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO18ActionPerformed
       cd.getSheet().setText("18B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO18ActionPerformed

    private void NO19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO19ActionPerformed
        cd.getSheet().setText("19B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO19ActionPerformed

    private void NO20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO20ActionPerformed
        cd.getSheet().setText("20B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO20ActionPerformed

    private void NO21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO21ActionPerformed
        cd.getSheet().setText("21B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO21ActionPerformed

    private void NO22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO22ActionPerformed
        cd.getSheet().setText("22B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO22ActionPerformed

    private void NO23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO23ActionPerformed
        cd.getSheet().setText("23B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO23ActionPerformed

    private void NO24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO24ActionPerformed
        cd.getSheet().setText("24B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO24ActionPerformed

    private void NO25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO25ActionPerformed
       cd.getSheet().setText("25B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO25ActionPerformed

    private void NO26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO26ActionPerformed
        cd.getSheet().setText("26B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO26ActionPerformed

    private void NO27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO27ActionPerformed
        cd.getSheet().setText("27B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO27ActionPerformed

    private void NO28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO28ActionPerformed
       cd.getSheet().setText("28B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO28ActionPerformed

    private void NO29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO29ActionPerformed
        cd.getSheet().setText("29B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO29ActionPerformed

    private void NO30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO30ActionPerformed
       cd.getSheet().setText("30B");
        this.dispose();
        cd.getButton4().grabFocus();
    }//GEN-LAST:event_NO30ActionPerformed

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
            java.util.logging.Logger.getLogger(Hall02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hall02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hall02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hall02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Hall02 dialog = new Hall02(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NO1;
    private javax.swing.JButton NO10;
    private javax.swing.JButton NO11;
    private javax.swing.JButton NO12;
    private javax.swing.JButton NO13;
    private javax.swing.JButton NO14;
    private javax.swing.JButton NO15;
    private javax.swing.JButton NO16;
    private javax.swing.JButton NO17;
    private javax.swing.JButton NO18;
    private javax.swing.JButton NO19;
    private javax.swing.JButton NO2;
    private javax.swing.JButton NO20;
    private javax.swing.JButton NO21;
    private javax.swing.JButton NO22;
    private javax.swing.JButton NO23;
    private javax.swing.JButton NO24;
    private javax.swing.JButton NO25;
    private javax.swing.JButton NO26;
    private javax.swing.JButton NO27;
    private javax.swing.JButton NO28;
    private javax.swing.JButton NO29;
    private javax.swing.JButton NO3;
    private javax.swing.JButton NO30;
    private javax.swing.JButton NO4;
    private javax.swing.JButton NO5;
    private javax.swing.JButton NO6;
    private javax.swing.JButton NO7;
    private javax.swing.JButton NO8;
    private javax.swing.JButton NO9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
