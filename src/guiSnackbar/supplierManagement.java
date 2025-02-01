/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package guiSnackbar;

import javax.swing.JOptionPane;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mysql.cj.x.protobuf.Mysqlx;
import guiManager.AdminDashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.mySQL;
import model.mySQL;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Heshan Nawarathna
 */
public class supplierManagement extends javax.swing.JPanel {

   
    private static HashMap<String, String> movie_company = new HashMap<>();

    /**
     * Creates new form supplierManagement
     */
    public supplierManagement() {
//       super(parent, view);""
        initComponents();
        loardSuppliers("fname", "ASC", "");
        loadcompany();
        init();

        reload();
    }

    private void init() {

        jTextField11.putClientProperty("JComponent.roundRect", true);
        jTextField3.putClientProperty("JComponent.roundRect", true);
        jTextField6.putClientProperty("JComponent.roundRect", true);
        jTextField8.putClientProperty("JComponent.roundRect", true);
        jTextField9.putClientProperty("JComponent.roundRect", true);
        jButton3.putClientProperty("JButton.buttonType", "roundRect");
        jButton4.putClientProperty("JButton.buttonType", "roundRect");
        jButton5.putClientProperty("JButton.buttonType", "roundRect");
        jButton6.putClientProperty("JButton.buttonType", "roundRect");
        jComboBox1.putClientProperty("JComponent.roundRect", true);
        jComboBox2.putClientProperty("JComponent.roundRect", true);
    }

    private void loadcompany() {
        try {
            ResultSet result = mySQL.executeSearch("SELECT * FROM `company`");

            Vector<String> v = new Vector<>();
            v.add("Select");

            while (result.next()) {

                v.add(result.getString("name"));
                movie_company.put(result.getString("name"), result.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(v);
            jComboBox2.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loardSuppliers(String column, String orderby, String fname) {
        try {

            ResultSet resultset = mySQL.executeSearch("SELECT * FROM `snack_supplier` INNER JOIN `company` ON `snack_supplier`.`company_id`=`company`.`id` WHERE `fname` LIKE '" + fname + "%' ORDER BY `" + column + "` " + orderby + "");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (resultset.next()) {
                Vector<String> v = new Vector<>();
                v.add(resultset.getString("mobile"));
                v.add(resultset.getString("fname"));
                v.add(resultset.getString("lname"));
                v.add(resultset.getString("email"));
                v.add(resultset.getString("company.name"));

                dtm.addRow(v);
//                this.repaint();
            }
            Vector<String> v = new Vector();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reload() {

        java.lang.Runnable runnable = new java.lang.Runnable() {
            @Override
            public void run() {

                while (true) {

                    loardSuppliers("fname", "ASC", "");

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel67 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(957, 60));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Management");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(957, 30));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel25.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel27.setPreferredSize(new java.awt.Dimension(816, 20));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel32.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel57.setPreferredSize(new java.awt.Dimension(10, 30));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel57, java.awt.BorderLayout.LINE_END);

        jPanel58.setPreferredSize(new java.awt.Dimension(10, 30));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel58, java.awt.BorderLayout.LINE_START);

        jPanel59.setLayout(new java.awt.BorderLayout());
        jPanel32.add(jPanel59, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel32, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel27, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(20, 459));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(20, 459));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(917, 30));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel11.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.BorderLayout());
        jPanel12.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel15.setPreferredSize(new java.awt.Dimension(160, 50));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel17.setPreferredSize(new java.awt.Dimension(155, 50));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name ASC", "Name DESC", " " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel17.add(jComboBox1, java.awt.BorderLayout.PAGE_END);

        jPanel15.add(jPanel17, java.awt.BorderLayout.LINE_END);

        jPanel12.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sort By :");
        jPanel16.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel20.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jTextField6.setPreferredSize(new java.awt.Dimension(76, 26));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel20.add(jTextField6, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel6.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel22.setPreferredSize(new java.awt.Dimension(796, 5));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setPreferredSize(new java.awt.Dimension(796, 310));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mobile", "First Name", "Last Name", "Email", "Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel23.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel31.setPreferredSize(new java.awt.Dimension(350, 408));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(10, 398));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel39.setPreferredSize(new java.awt.Dimension(350, 70));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel49.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel49, java.awt.BorderLayout.LINE_START);

        jPanel50.setLayout(new java.awt.GridLayout(2, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile :");
        jPanel50.add(jLabel4);
        jPanel50.add(jTextField3);

        jPanel39.add(jPanel50, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel41.setPreferredSize(new java.awt.Dimension(340, 5));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel43.setPreferredSize(new java.awt.Dimension(340, 70));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel51.setPreferredSize(new java.awt.Dimension(166, 70));
        jPanel51.setLayout(new java.awt.GridLayout(2, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name :");
        jPanel51.add(jLabel5);
        jPanel51.add(jTextField8);

        jPanel43.add(jPanel51, java.awt.BorderLayout.LINE_START);

        jPanel52.setLayout(new java.awt.BorderLayout());

        jPanel53.setPreferredSize(new java.awt.Dimension(166, 70));
        jPanel53.setLayout(new java.awt.GridLayout(2, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name :");
        jPanel53.add(jLabel6);
        jPanel53.add(jTextField9);

        jPanel52.add(jPanel53, java.awt.BorderLayout.LINE_END);

        jPanel43.add(jPanel52, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel45.setPreferredSize(new java.awt.Dimension(340, 5));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel44.add(jPanel45, java.awt.BorderLayout.PAGE_START);

        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel48.setPreferredSize(new java.awt.Dimension(340, 70));
        jPanel48.setLayout(new java.awt.GridLayout(2, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email :");
        jPanel48.add(jLabel10);
        jPanel48.add(jTextField11);

        jPanel46.add(jPanel48, java.awt.BorderLayout.PAGE_START);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel29.setPreferredSize(new java.awt.Dimension(340, 5));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        jPanel34.setLayout(new java.awt.BorderLayout());

        jPanel35.setPreferredSize(new java.awt.Dimension(340, 70));
        jPanel35.setLayout(new java.awt.GridLayout(2, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Company :");
        jPanel35.add(jLabel7);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel35.add(jComboBox2);

        jPanel34.add(jPanel35, java.awt.BorderLayout.PAGE_START);

        jPanel37.setLayout(new java.awt.BorderLayout());
        jPanel34.add(jPanel37, java.awt.BorderLayout.PAGE_END);

        jPanel38.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel54, java.awt.BorderLayout.PAGE_START);

        jPanel55.setLayout(new java.awt.BorderLayout());

        jPanel56.setPreferredSize(new java.awt.Dimension(340, 40));
        jPanel56.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setBackground(new java.awt.Color(24, 119, 242));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton4);

        jButton5.setBackground(new java.awt.Color(24, 119, 242));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton5);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton6);

        jPanel55.add(jPanel56, java.awt.BorderLayout.PAGE_START);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel66.setPreferredSize(new java.awt.Dimension(340, 45));
        jPanel66.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(0, 65, 112));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/printt.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton3);

        jPanel28.add(jPanel66, java.awt.BorderLayout.PAGE_END);

        jPanel67.setPreferredSize(new java.awt.Dimension(340, 100));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel67, java.awt.BorderLayout.CENTER);

        jPanel55.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel55, java.awt.BorderLayout.CENTER);

        jPanel34.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel46.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel44.add(jPanel46, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel40.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel33, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel7.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        search();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        search();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        if (evt.getClickCount() == 1) {

            String mobile = String.valueOf(jTable1.getValueAt(row, 0));
            String fname = String.valueOf(jTable1.getValueAt(row, 1));
            String lname = String.valueOf(jTable1.getValueAt(row, 2));
            String email = String.valueOf(jTable1.getValueAt(row, 3));
            String company = String.valueOf(jTable1.getValueAt(row, 4));

            jTextField3.setText(mobile);
            jTextField3.setEnabled(false);
            jTextField8.setText(fname);
            jTextField9.setText(lname);
            jTextField11.setText(email);
            jButton4.setEnabled(false);
            jComboBox2.setSelectedItem(company);

        }

      

        if (evt.getClickCount() == 2) {

            String supName = String.valueOf(jTable1.getValueAt(row, 1));

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String mobile = jTextField3.getText();
        String fname = jTextField8.getText();
        String lname = jTextField9.getText();
        String company = String.valueOf(jComboBox2.getSelectedItem());
        String email = jTextField11.getText();

        if (mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter mobile number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!mobile.matches("^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter first name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter last name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+"
                + "(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {

            JOptionPane.showMessageDialog(this, "Please enter valid email", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (company.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select a company", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            try {

                ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `snack_supplier` WHERE `mobile` = '" + mobile + "' OR `email` = '" + email + "'");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Supplier already registered", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {

                    mySQL.executeIUD("INSERT INTO `snack_supplier`(`mobile`,`fname`,`lname`,`email`,`company_id`)"
                            + "VALUES ('" + mobile + "','" + fname + "','" + lname + "','" + email + "','" + movie_company.get(company) + "')");
                    //                    ____
                    //                    JOptionPane.showMessageDialog(this, "Successfull", "Inform", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    search();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String mobile = jTextField3.getText();
        String fname = jTextField8.getText();
        String lname = jTextField9.getText();
        String company = String.valueOf(jComboBox2.getSelectedItem());
        String email = jTextField11.getText();
        jButton4.setEnabled(false);
        if (mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter mobile number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!mobile.matches("^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter first name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter last name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+"
                + "(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {

            JOptionPane.showMessageDialog(this, "Please enter valid email", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (company.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select a company", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            try {

                ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `snack_supplier` WHERE `email` = '" + email + "' AND `mobile` !='" + mobile + "'");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Email already used", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {

                    mySQL.executeIUD("UPDATE `snack_supplier` SET `fname`='" + fname + "',`lname`='" + lname + "',`email`='" + email + "'"
                            + ",`company_id`='" + movie_company.get(company) + "' WHERE `mobile`='" + mobile + "'");
                    search();
                    reset();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        reset();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            //            JREmptyDataSource ds = new JREmptyDataSource();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zgencrms_db", "root", "Geeth@200104");

            JasperPrint report = JasperFillManager.fillReport("src/reports/suppliertest_Landscape.jasper", null, connection);
            JasperViewer.viewReport(report, false);

            connection.close();

            JasperExportManager.exportReportToPdfFile(report, "suppliertest_Landscape.pdf");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
private void search() {

        if (jComboBox1.getSelectedIndex() == 0) {
            loardSuppliers("fname", "ASC", jTextField6.getText());
        } else if (jComboBox1.getSelectedIndex() == 1) {
            loardSuppliers("fname", "DESC", jTextField6.getText());
        }
    }

    private void reset() {

        jTextField3.setText("");
        jTextField3.grabFocus();
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField11.setText("");
        jComboBox2.setSelectedIndex(0);
        jButton4.setEnabled(true);
        jTextField3.setEditable(true);

    }

}
