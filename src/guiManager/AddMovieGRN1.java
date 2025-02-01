/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package guiManager;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.GrnItem;
import model.mySQL;

/**
 *
 * @author Geeth Kalhara
 */
public class AddMovieGRN1 extends javax.swing.JFrame {

    HashMap<String, GrnItem> grnItemMap = new HashMap<>();
    private static HashMap<String, String> movieMap = new HashMap<>();
  

    /**
     * Creates new form AddMovieGRN
     */
    public AddMovieGRN1() {
//        super(parent, modal);
        initComponents();
        init();
        placeHolder();
        enableFalse();
        loadGRNItem();
        generateGrnId();
        loadMovie();
        jButton3.grabFocus();
        jTextField5.setEditable(false);
        jFormattedTextField3.setEditable(false);
    }

    private void enableFalse() {

        jTextField1.setEnabled(false);

    }

    public JTextField getTextField() {

        return jTextField2;

    }

//    public JButton getJButton() {
//
////        return jButton4;
//
//    }
//
//    public JTextField getTextField2() {
//
////        return jTextField4;
//
//    }

    public JTextField getJFormattedTextField() {

        return jFormattedTextField1;

    }

    private void loadGRNItem() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        String paid_price = jFormattedTextField1.getText();

        for (GrnItem grnItem : grnItemMap.values()) {

            Vector<String> vector = new Vector<>();
            vector.add(grnItem.getMRNId());
            vector.add(grnItem.getSupplierMobile());
            vector.add(grnItem.getMovie());
            vector.add(String.valueOf(grnItem.getBuyingprice()));

            model.addRow(vector);
        }

        jTextField5.setText(paid_price);

    }
    
    private void loadMovie() {
        try {

            java.sql.ResultSet resultSet = mySQL.executeSearch("SELECT* FROM `movie`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                movieMap.put(resultSet.getString("name"), resultSet.getString("movie_id"));
            }

            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(vector);
            jComboBox1.setModel(defaultComboBoxModel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {

        jTextField1.putClientProperty("JComponent.roundRect", true);
        jTextField2.putClientProperty("JComponent.roundRect", true);
        jFormattedTextField1.putClientProperty("JComponent.roundRect", true);
        jTextField5.putClientProperty("JComponent.roundRect", true);
        jFormattedTextField2.putClientProperty("JComponent.roundRect", true);
        jFormattedTextField3.putClientProperty("JComponent.roundRect", true);
        jButton1.putClientProperty("JButton.buttonType", "roundRect");
        jButton2.putClientProperty("JButton.buttonType", "roundRect");
        jButton3.putClientProperty("JButton.buttonType", "roundRect");
        jButton5.putClientProperty("JButton.buttonType", "roundRect");
        jButton6.putClientProperty("JButton.buttonType", "roundRect");

    }

    private void generateGrnId() {

        Long id = System.currentTimeMillis();
        jTextField1.setText(String.valueOf(id));

    }

    private void placeHolder() {

        if (jTextField1 != null) {
            jTextField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "MRN Number");
        }
        if (jTextField2 != null) {
            jTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Supplier");
        }
//        if (jTextField4 != null) {
//            jTextField4.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Movie");
//        }
        if (jFormattedTextField1 != null) {
            jFormattedTextField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Movie Buying Price");
        }
        if (jTextField5 != null) {
            jTextField5.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Total Amount");
        }
        if (jFormattedTextField2 != null) {
            jFormattedTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Payment");
        }
        if (jFormattedTextField3 != null) {
            jFormattedTextField3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Balance Amount");
        }
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel29 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Movie GRN");

        jPanel1.setPreferredSize(new java.awt.Dimension(917, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(917, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(20, 519));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(20, 519));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(877, 40));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movie MRN");
        jPanel6.add(jLabel1);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(877, 10));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(877, 40));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(245, 40));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel12.add(jTextField1);

        jPanel10.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setPreferredSize(new java.awt.Dimension(245, 40));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel16.add(jTextField2);

        jPanel15.add(jPanel16, java.awt.BorderLayout.LINE_START);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, java.awt.BorderLayout.LINE_START);

        jPanel28.setPreferredSize(new java.awt.Dimension(317, 40));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel30.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel30, java.awt.BorderLayout.LINE_START);

        jPanel31.setLayout(new java.awt.GridLayout(1, 0));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel31.add(jComboBox1);

        jPanel28.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel28, java.awt.BorderLayout.LINE_END);

        jPanel29.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(24, 119, 242));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton3);

        jPanel17.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel19.setPreferredSize(new java.awt.Dimension(877, 10));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setPreferredSize(new java.awt.Dimension(210, 419));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel36.setLayout(new java.awt.BorderLayout());

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setPreferredSize(new java.awt.Dimension(200, 130));
        jPanel39.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyTyped(evt);
            }
        });
        jPanel39.add(jFormattedTextField1);

        jButton1.setBackground(new java.awt.Color(24, 119, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add MRN");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel39.add(jButton1);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear All");
        jButton2.setBorderPainted(false);
        jPanel39.add(jButton2);

        jPanel38.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel41.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel43.setPreferredSize(new java.awt.Dimension(200, 130));
        jPanel43.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel43.add(jTextField5);

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyTyped(evt);
            }
        });
        jPanel43.add(jFormattedTextField2);

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        jFormattedTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField3KeyTyped(evt);
            }
        });
        jPanel43.add(jFormattedTextField3);

        jPanel42.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel45.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel44.add(jPanel45, java.awt.BorderLayout.PAGE_START);

        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel47.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancel GRN");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel47.add(jButton6);

        jPanel46.add(jPanel47, java.awt.BorderLayout.PAGE_END);

        jButton5.setBackground(new java.awt.Color(24, 119, 242));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Save GRN");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel46.add(jPanel48, java.awt.BorderLayout.CENTER);

        jPanel44.add(jPanel46, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel40.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel36.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setPreferredSize(new java.awt.Dimension(10, 419));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23, java.awt.BorderLayout.LINE_END);

        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Supplier Mobile", "Movie Name", "Buying Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel24.add(jScrollPane1);

        jPanel22.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new SupplierregistrationNew(this, true).show();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String invoice = jTextField1.getText();
        String Supplier = jTextField2.getText();
        
        String paid_price = jFormattedTextField1.getText();

        GrnItem grnItem = new GrnItem();
        grnItem.setMRNId(jTextField1.getText());
        grnItem.setSupplierMobile(jTextField2.getText());
        
        grnItem.setBuyingprice(Double.parseDouble(jFormattedTextField1.getText()));

        if (grnItemMap.get(jTextField1.getText()) == null) {
            grnItemMap.put(jTextField1.getText(), grnItem);
            loadGRNItem();

        } else {

            JOptionPane.showMessageDialog(this, "Invoice ID Already Exists", "Warning", JOptionPane.WARNING_MESSAGE);

        }

        grnItemMap.put(Supplier, grnItem);
        jFormattedTextField2.grabFocus();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyReleased

        String total = jTextField5.getText();
        String payment = jFormattedTextField2.getText();

        if (payment.isEmpty()) {
            payment = "0";
        }

        double balance = Double.parseDouble(payment) - Double.parseDouble(total);
        jFormattedTextField3.setText(String.valueOf(balance));
    }//GEN-LAST:event_jFormattedTextField2KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {

            String grnNumber = jTextField1.getText();
            String supplierName = jTextField2.getText();
            String movie = String.valueOf(jComboBox1.getSelectedItem());

            String dateTime = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
            String payment = jFormattedTextField2.getText();

            mySQL.executeIUD("INSERT INTO `movie_grn` VALUES ('" + grnNumber + "','" + dateTime + "','" + payment + "','" +movieMap.get(movie)+ "','" + supplierName + "')");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jFormattedTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextField1KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jFormattedTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextField2KeyTyped

    private void jFormattedTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField3KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextField3KeyTyped

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if (evt.getKeyCode() == 10) {
            jButton1.grabFocus();
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        jButton1.grabFocus();
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        jFormattedTextField2.grabFocus();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
      jButton5.grabFocus();
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        jButton5.grabFocus();
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
        jFormattedTextField1.setText("");
        jTextField5.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       jFormattedTextField1.grabFocus();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacDarkLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovieGRN1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel36;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void resert() {
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField1.setText("");
        

    }
}
