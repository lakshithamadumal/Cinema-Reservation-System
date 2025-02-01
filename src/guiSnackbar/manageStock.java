/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package guiSnackbar;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.mySQL;

/**
 *
 * @author Heshan Nawarathne
 */
public class manageStock extends javax.swing.JPanel {

    private static HashMap<String, String> brandMap = new HashMap<>();

    public manageStock() {
        initComponents();
        loadProduct();
        loadStock();
        loadBrand();
        hint();
        jTextField1.setEditable(false);
    }

    private void loadProduct() {
        try {
            ResultSet resultSet = mySQL.executeSearch("SELECT * FROM snack_product "
                    + "INNER JOIN brand ON snack_product.brand_id=brand.id "
                    + "ORDER BY snack_product.id ASC");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("product"));
                vector.add(resultSet.getString("brand.name"));

                model.addRow(vector);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadStock() {
        try {

            String query = "SELECT * FROM `snack_stock` INNER JOIN `snack_product` "
                    + "ON `snack_stock`.`snack_product_id` = `snack_product`.`id` INNER JOIN `brand` ON `brand`.`id` = `snack_product`.`brand_id` ";

            int row = jTable1.getSelectedRow();

            if (row != -1) {
                String pid = String.valueOf(jTable1.getValueAt(row, 0));
                query += "WHERE `snack_stock`.`snack_product_id` = '" + pid + "'";
            }

            if (query.contains("WHERE")) {
                query += "AND ";
            } else {
                query += "WHERE ";
            }

            
            //Exp Date
            Date start = null;
            Date end = null;

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            if (jDateChooser2.getDate() != null) {
                start = jDateChooser2.getDate();
                query += "`snack_stock`.`exp` > '" + format.format(start) + "' AND ";
            }

            if (jDateChooser1.getDate() != null) {
                end = jDateChooser1.getDate();
                query += "`snack_stock`.`exp` < '" + format.format(end) + "' ";
            }

            String sort = String.valueOf(jComboBox2.getSelectedItem());

            query += "ORDER BY ";

            query = query.replace("WHERE ORDER BY ", "ORDER BY ");
            query = query.replace("AND ORDER BY ", "ORDER BY ");

            if (sort.equals("Stock ID ASC")) {
                query += "`snack_stock`.`id` ASC ";
            } else if (sort.equals("Stock ID DESC")) {
                query += "`snack_stock`.`id` DESC ";
            } else if (sort.equals("Product ID ASC")) {
                query += "`snack_product`.`id` ASC ";
            } else if (sort.equals("Product ID DESC")) {
                query += "`snack_product`.`id` DESC ";
            } else if (sort.equals("Brand ASC")) {
                query += "`brand`.`id` ASC ";
            } else if (sort.equals("Brand DESC")) {
                query += "`brand`.`id` DESC ";
            } else if (sort.equals("Name ASC")) {
                query += "`brand`.`name` ASC ";
            } else if (sort.equals("Name DESC")) {
                query += "`brand`.`name` DESC ";
            } else if (sort.equals("Selling Price ASC")) {
                query += "`snack_stock`.`buying_price` ASC ";
            } else if (sort.equals("Selling Price DESC")) {
                query += "`snack_stock`.`buying_price` DESC ";
            } else if (sort.equals("Quantity ASC")) {
                query += "`snack_stock`.`qty` ASC ";
            } else if (sort.equals("Quantity DESC")) {
                query += "`snack_stock`.`qty` DESC ";
            }

            ResultSet resultSet = mySQL.executeSearch(query);

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("snack_stock.id"));
                vector.add(resultSet.getString("snack_product.id"));
                vector.add(resultSet.getString("snack_product.product"));
                vector.add(resultSet.getString("snack_stock.selling_price"));
                vector.add(resultSet.getString("qty"));
                vector.add(resultSet.getString("mfd"));
                vector.add(resultSet.getString("exp"));
                model.addRow(vector);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadBrand() {
        try {
            ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `brand`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                brandMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }

            jComboBox1.setModel(new DefaultComboBoxModel<>(vector));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void hint() {
        if (jTextField1 != null) {
            jTextField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Product ID");
        }
        if (jTextField2 != null) {
            jTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Product Name");
        }
        if (jTextField3 != null) {
            jTextField3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Add New Brand");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel29 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel30 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 70));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product & Stock Manage");
        jPanel1.add(jLabel1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1129, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(30, 516));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(30, 516));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(771, 35));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(310, 35));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButton1.setBackground(new java.awt.Color(24, 119, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1);

        jButton2.setBackground(new java.awt.Color(24, 119, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3);

        jPanel6.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setPreferredSize(new java.awt.Dimension(305, 35));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));
        jPanel12.add(jTextField1);

        jPanel10.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));
        jPanel13.add(jTextField2);

        jPanel10.add(jPanel13, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel15.setPreferredSize(new java.awt.Dimension(50, 35));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Brand");
        jPanel15.add(jLabel2);

        jPanel11.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel16.setPreferredSize(new java.awt.Dimension(5, 35));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel18.add(jComboBox1);

        jPanel17.add(jPanel18, java.awt.BorderLayout.LINE_START);

        jPanel19.setPreferredSize(new java.awt.Dimension(240, 35));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel21.setLayout(new java.awt.GridLayout(1, 0));
        jPanel19.add(jPanel21, java.awt.BorderLayout.LINE_START);

        jPanel23.setLayout(new java.awt.GridLayout(1, 0));
        jPanel19.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setLayout(new java.awt.BorderLayout());
        jPanel19.add(jPanel24, java.awt.BorderLayout.LINE_END);

        jPanel25.setLayout(new java.awt.GridLayout(1, 0));
        jPanel25.add(jTextField3);

        jButton5.setBackground(new java.awt.Color(24, 119, 242));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons8-plus-20.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel25.add(jPanel22);

        jPanel19.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel19, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel26.setPreferredSize(new java.awt.Dimension(1069, 10));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setPreferredSize(new java.awt.Dimension(1069, 200));
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Brand Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel28.add(jScrollPane1);

        jPanel27.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel39.setPreferredSize(new java.awt.Dimension(1069, 10));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel41.setPreferredSize(new java.awt.Dimension(1069, 35));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel31.setPreferredSize(new java.awt.Dimension(60, 35));
        jPanel31.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Short By");
        jPanel31.add(jLabel3);

        jPanel7.add(jPanel31, java.awt.BorderLayout.LINE_START);

        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock ID ASC", "Stock ID DESC", "Product ID ASC", "Product ID DESC", "Brand  ASC", "Brand DESC", "Name ASC", "Name DESC", "Selling Price ASC", "Selling Price DESC", "Quantity ASC", "Quantity DESC", " " }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel32.add(jComboBox2);

        jPanel7.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel41.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel30.setLayout(new java.awt.BorderLayout());

        jPanel33.setPreferredSize(new java.awt.Dimension(50, 35));
        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EXP");
        jPanel33.add(jLabel4);

        jPanel30.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setPreferredSize(new java.awt.Dimension(105, 35));
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel34.add(jButton4);

        jPanel30.add(jPanel34, java.awt.BorderLayout.LINE_END);

        jPanel35.setLayout(new java.awt.BorderLayout());

        jPanel36.setPreferredSize(new java.awt.Dimension(100, 0));
        jPanel36.setLayout(new java.awt.GridLayout(1, 0));
        jPanel36.add(jDateChooser1);

        jPanel35.add(jPanel36, java.awt.BorderLayout.LINE_START);

        jPanel37.setLayout(new java.awt.BorderLayout());

        jPanel38.setPreferredSize(new java.awt.Dimension(30, 35));
        jPanel38.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To");
        jPanel38.add(jLabel5);

        jPanel37.add(jPanel38, java.awt.BorderLayout.LINE_START);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel46.setPreferredSize(new java.awt.Dimension(100, 0));
        jPanel46.setLayout(new java.awt.GridLayout(1, 0));
        jPanel46.add(jDateChooser2);

        jPanel45.add(jPanel46, java.awt.BorderLayout.LINE_START);

        jPanel47.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(24, 119, 242));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons8-search-20.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel48, java.awt.BorderLayout.CENTER);

        jPanel45.add(jPanel47, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel45, java.awt.BorderLayout.CENTER);

        jPanel35.add(jPanel37, java.awt.BorderLayout.CENTER);

        jPanel30.add(jPanel35, java.awt.BorderLayout.CENTER);

        jPanel41.add(jPanel30, java.awt.BorderLayout.CENTER);

        jPanel40.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel43.setPreferredSize(new java.awt.Dimension(1069, 10));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel42.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jPanel44.setLayout(new java.awt.GridLayout(1, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Product ID", "Product Name", "Selling Price", "QTY", "MFD", "EXP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel44.add(jScrollPane2);

        jPanel42.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel40.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel29.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jTextField1.setEditable(false);
        jButton1.setEnabled(false);

        String pid = String.valueOf(jTable1.getValueAt(row, 0));
        jTextField1.setText(pid);

        String pname = String.valueOf(jTable1.getValueAt(row, 1));
        jTextField2.setText(pname);

        String pb = String.valueOf(jTable1.getValueAt(row, 2));
        jComboBox1.setSelectedItem(pb);

        loadStock();
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String brand = jTextField3.getText();

        if (brand.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter brand name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            try {

                ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `brand` WHERE `name` ='" + brand + "'");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Brand already added", "Warning", JOptionPane.WARNING_MESSAGE);

                } else {

                    if (jComboBox1.getSelectedIndex() == 0) {
                        //Select
                        mySQL.executeIUD("INSERT INTO `brand`(`name`) VALUES('" + brand + "')");
                        JOptionPane.showMessageDialog(this, "New brand added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {

                        int showConfirm = JOptionPane.showConfirmDialog(this, "Do you want to update brand?", "Update", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                        if (showConfirm == JOptionPane.YES_OPTION) {
                            mySQL.executeIUD("UPDATE `brand` SET `name`='" + brand + "' WHERE `name` = '" + String.valueOf(jComboBox1.getSelectedItem()) + "'");
                            JOptionPane.showMessageDialog(this, "Brand update", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

                    loadBrand();
                    jTextField3.setText("");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadProduct();
        loadStock();
        resetProduct();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String pid = jTextField1.getText();
        String pname = jTextField2.getText();
        String pb = String.valueOf(jComboBox1.getSelectedItem());
        
        if (pname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter product name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (pb.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select product brand", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            try {
                
                ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `snack_product` WHERE `id` = '" + pid + "' OR (`product` = '" + pname + "' AND `brand_id` = '" + brandMap.get(pb) + "')");
                
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Product already added", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    mySQL.executeIUD("INSERT INTO `snack_product`(`product`,`brand_id`) VALUES('" + pname + "','" + brandMap.get(pb) + "')");
                    loadProduct();
                    resetProduct();
                    JOptionPane.showMessageDialog(this, "New product added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String brand = String.valueOf(jComboBox1.getSelectedItem());

        if (brand.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select a Brand", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Product Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `snack_product` WHERE `product` = '" + name + "' "
                        + "AND `brand_id` = '" + brandMap.get(brand) + "'");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Change Name or Brand or Update", "Warning", JOptionPane.WARNING_MESSAGE);

                } else {

                    mySQL.executeIUD("UPDATE `snack_product` SET `brand_id` = '" + brandMap.get(brand) + "' , `product` = '" + name + "'"
                            + "WHERE `id` = '" + id + "'");

                    loadProduct();
                    resetProduct();
                    JOptionPane.showMessageDialog(this, "Product Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);

        jComboBox2.setSelectedIndex(0);

        jTable1.clearSelection();
        jTable2.clearSelection();
        loadStock();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        loadStock();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        loadStock();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
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
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void resetProduct() {
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField1.setEditable(true);
        jButton1.setEnabled(true);
    }
}
