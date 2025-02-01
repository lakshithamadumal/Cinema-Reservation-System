/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiCashier;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.lowagie.text.pdf.TextField;
import com.sun.jdi.Value;
import guiLogin.LogingOption;
import guiManager.MovieManageGRN;
import guiManager.SupplierregistrationNew;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import static javax.management.Query.value;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.InvoiceItem;
import model.mySQL;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Geeth Kalhara
 */
public class CashierDashboard extends javax.swing.JFrame {

    HashMap<String, InvoiceItem> InvoiceItemMap = new HashMap<>();
    private static HashMap<String, String> paymentMethod = new HashMap<>();

    public CashierDashboard() {
        initComponents();
        hint();
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField8.setEditable(false);
        jTextField10.setEditable(false);
        jTextField6.setEditable(false);
        loadInvoiceItems();
        jTextField9.setEditable(false);
        jTextField2.grabFocus();
        generateInvoceId();
        loadPay();
    }

    public int laky;

    public int getPriceID() {
        return laky;
    }

    public void setPriceID(int tprice) {
        this.laky = tprice;
    }

    public int sheduleID;

    public int getsheduleID() {
        return sheduleID;
    }

    public void setsheduleID(int SheduleID) {
        this.sheduleID = SheduleID;
    }

    public JTextField getTextField() {
        return jTextField3;
    }

    public JTextField getPrice() {
        return jTextField6;
    }

    public int getTicketpriceID() {
        int ticketID = 0;
        return ticketID;
    }

    public JButton addMovie() {
        return jButton12;
    }

    public JTextField getTextField1() {
        return jTextField4;
    }

    public JTextField getTextField2() {
        return jTextField8;
    }

    public JTextField getTextField3() {
        return jTextField10;
    }

    //sheets
    public JTextField getSheet() {
        return jTextField5;
    }

    private void generateInvoceId() {

        Long id = System.currentTimeMillis();
        jTextField1.setText(String.valueOf(id));

    }

    public JButton getButton1() {
        return H1;
    }

    public JButton getButton2() {
        return H2;
    }

    public JButton getButton3() {
        return H3;
    }

    public JButton getButton4() {
        return jButton1;
    }

    private void hint() {

        if (jTextField2 != null) {
            jTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cutomer Number");
        }
        if (jTextField3 != null) {
            jTextField3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Movie Name");
        }
        if (jTextField4 != null) {
            jTextField4.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Hall No");
        }

        if (jTextField9 != null) {
            jTextField9.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Given Amount");
        }
        if (jTextField8 != null) {
            jTextField8.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Start Time");
        }
        if (jTextField10 != null) {
            jTextField10.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "End Time");
        }
        if (jTextField5 != null) {
            jTextField5.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Sheet No");
        }
        if (jTextField6 != null) {
            jTextField6.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ticket Price");
        }
        if (jTextField7 != null) {
            jTextField7.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Payid Amount");
        }

    }

    private void loadInvoiceItems() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        double total = 0;

        for (InvoiceItem invoiceItem : InvoiceItemMap.values()) {
            Vector<String> vector = new Vector<>();
            vector.add(invoiceItem.getTicketID());
            vector.add(invoiceItem.getCustomerNum());
            vector.add(invoiceItem.getMoviename());
            vector.add(String.valueOf(invoiceItem.getTicketPrice()));
            vector.add(invoiceItem.getHallNo());
            vector.add(invoiceItem.getsheetNo());
            vector.add(invoiceItem.getStartTime());

            double itemTotal = invoiceItem.getTicketPrice();
            total += itemTotal;
            vector.add(String.valueOf(itemTotal));

            model.addRow(vector);
        }

        jLabel7.setText(String.valueOf(total));

    }

    private void loadPay() {
        try {

            ResultSet resultSet = mySQL.executeSearch("SELECT * FROM payment_method");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                paymentMethod.put(resultSet.getString("name"), resultSet.getString("id"));
            }

            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(vector);
            jComboBox1.setModel(defaultComboBoxModel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void calculationMethod() {
        // Get the values
        double labelValue;
        double inputValue;

        try {
            labelValue = Double.parseDouble(jLabel7.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid value", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            inputValue = Double.parseDouble(jTextField7.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // comparison
        if (labelValue < inputValue) {
            double newValue = inputValue - labelValue;
            jTextField9.setText(String.valueOf(newValue));
            jTextField9.setForeground(Color.WHITE);
        } else if (labelValue == inputValue) {
            jTextField9.setText("0");
            jTextField9.setForeground(Color.WHITE);
        } else {
            double newmValue = labelValue - inputValue;
            jTextField9.setForeground(Color.RED);
            jTextField9.setText(String.valueOf(newmValue));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        H1 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jPanel56 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel62 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier Dashboard");

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(31, 35, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(215, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cinema (2).png"))); // NOI18N
        jPanel4.add(jLabel1);

        jPanel10.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(31, 35, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(215, 100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(31, 35, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(205, 100));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(31, 35, 51));
        jPanel12.setPreferredSize(new java.awt.Dimension(205, 60));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel5.setText("    ");
        jPanel12.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(31, 35, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(60, 44));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/contacts-32.png"))); // NOI18N
        jPanel7.add(jLabel4);

        jPanel12.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel9.setBackground(new java.awt.Color(31, 35, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("amali@gmail.com");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );

        jPanel12.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(31, 35, 51));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2024/05/09   10.00 PM");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 24));

        jButton4.setBackground(new java.awt.Color(31, 35, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/shut_down.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 43, 38));

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(31, 35, 51));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cashier Dashboard");
        jPanel6.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel23.setPreferredSize(new java.awt.Dimension(200, 700));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel25.setLayout(new java.awt.BorderLayout());
        jPanel23.add(jPanel25, java.awt.BorderLayout.PAGE_END);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(10, 531));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel16.setPreferredSize(new java.awt.Dimension(10, 531));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(180, 90));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel21.setPreferredSize(new java.awt.Dimension(180, 85));
        jPanel21.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField1);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel21.add(jTextField2);

        jPanel18.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel27.setLayout(new java.awt.BorderLayout());
        jPanel20.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel29.setPreferredSize(new java.awt.Dimension(180, 135));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel31.setPreferredSize(new java.awt.Dimension(180, 5));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel31, java.awt.BorderLayout.PAGE_END);

        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel33.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel35.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel35.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(24, 119, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search-13-16.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel35.add(jButton3);

        jPanel33.add(jPanel35, java.awt.BorderLayout.LINE_END);

        jPanel36.setLayout(new java.awt.GridLayout(1, 0));
        jPanel36.add(jTextField3);

        jPanel33.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel32.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel34.setLayout(new java.awt.BorderLayout());

        jPanel37.setPreferredSize(new java.awt.Dimension(180, 5));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel34.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        jTextField4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTextField4ComponentResized(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel42.add(jTextField4);

        jPanel39.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel43.setPreferredSize(new java.awt.Dimension(180, 5));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jPanel44.setLayout(new java.awt.GridLayout(1, 0, 4, 0));
        jPanel44.add(jTextField8);
        jPanel44.add(jTextField10);

        jPanel40.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel34.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel32.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel29.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        jPanel30.setLayout(new java.awt.BorderLayout());

        jPanel45.setLayout(new java.awt.BorderLayout());
        jPanel30.add(jPanel45, java.awt.BorderLayout.PAGE_START);

        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel47.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jPanel50.setLayout(new java.awt.BorderLayout());

        jPanel51.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        H1.setBackground(new java.awt.Color(24, 119, 242));
        H1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        H1.setForeground(new java.awt.Color(255, 255, 255));
        H1.setText("H1");
        H1.setBorderPainted(false);
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });
        jPanel51.add(H1);

        H2.setBackground(new java.awt.Color(24, 119, 242));
        H2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        H2.setForeground(new java.awt.Color(255, 255, 255));
        H2.setText("H2");
        H2.setBorderPainted(false);
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });
        jPanel51.add(H2);

        H3.setBackground(new java.awt.Color(24, 119, 242));
        H3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        H3.setForeground(new java.awt.Color(255, 255, 255));
        H3.setText("H3");
        H3.setBorderPainted(false);
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });
        jPanel51.add(H3);

        jPanel50.add(jPanel51, java.awt.BorderLayout.CENTER);

        jPanel47.add(jPanel50, java.awt.BorderLayout.CENTER);

        jPanel46.add(jPanel47, java.awt.BorderLayout.PAGE_START);

        jPanel48.setLayout(new java.awt.BorderLayout());

        jPanel53.setLayout(new java.awt.BorderLayout());

        jPanel55.setLayout(new java.awt.BorderLayout());

        jPanel58.setPreferredSize(new java.awt.Dimension(180, 5));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel55.add(jPanel58, java.awt.BorderLayout.PAGE_START);

        jPanel59.setLayout(new java.awt.BorderLayout());

        jPanel70.setLayout(new java.awt.BorderLayout());

        jPanel60.setLayout(new java.awt.BorderLayout());

        jPanel64.setLayout(new java.awt.BorderLayout());

        jPanel54.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel54.setLayout(new java.awt.GridLayout(1, 0));
        jPanel54.add(jTextField5);

        jPanel64.add(jPanel54, java.awt.BorderLayout.PAGE_START);

        jPanel56.setLayout(new java.awt.BorderLayout());

        jPanel41.setPreferredSize(new java.awt.Dimension(180, 5));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel56.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel49.setLayout(new java.awt.BorderLayout());

        jPanel52.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel52.setLayout(new java.awt.BorderLayout());

        jPanel61.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel61.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(24, 119, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons8-search-20.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel61.add(jButton1);

        jPanel52.add(jPanel61, java.awt.BorderLayout.LINE_END);

        jPanel62.setLayout(new java.awt.GridLayout(1, 0));
        jPanel62.add(jTextField6);

        jPanel52.add(jPanel62, java.awt.BorderLayout.CENTER);

        jPanel49.add(jPanel52, java.awt.BorderLayout.PAGE_START);

        jPanel57.setLayout(new java.awt.BorderLayout());

        jPanel63.setPreferredSize(new java.awt.Dimension(180, 10));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel63, java.awt.BorderLayout.PAGE_START);

        jPanel65.setLayout(new java.awt.BorderLayout());

        jPanel66.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel66.setLayout(new java.awt.GridLayout(1, 0));

        jButton12.setBackground(new java.awt.Color(24, 119, 242));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add Movie");
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton12);

        jPanel65.add(jPanel66, java.awt.BorderLayout.PAGE_START);

        jPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 119, 242));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");
        jPanel75.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 90));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total");
        jPanel75.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 180, 120));

        jPanel65.add(jPanel75, java.awt.BorderLayout.CENTER);

        jPanel57.add(jPanel65, java.awt.BorderLayout.CENTER);

        jPanel49.add(jPanel57, java.awt.BorderLayout.CENTER);

        jPanel56.add(jPanel49, java.awt.BorderLayout.CENTER);

        jPanel64.add(jPanel56, java.awt.BorderLayout.CENTER);

        jPanel60.add(jPanel64, java.awt.BorderLayout.CENTER);

        jPanel70.add(jPanel60, java.awt.BorderLayout.CENTER);

        jPanel59.add(jPanel70, java.awt.BorderLayout.CENTER);

        jPanel55.add(jPanel59, java.awt.BorderLayout.CENTER);

        jPanel53.add(jPanel55, java.awt.BorderLayout.CENTER);

        jPanel48.add(jPanel53, java.awt.BorderLayout.CENTER);

        jPanel46.add(jPanel48, java.awt.BorderLayout.CENTER);

        jPanel30.add(jPanel46, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel30, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23, java.awt.BorderLayout.LINE_START);

        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel67.setPreferredSize(new java.awt.Dimension(128, 100));

        jButton7.setBackground(new java.awt.Color(0, 153, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/printt.png"))); // NOI18N
        jButton7.setText("Print Invoice");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cancel-.png"))); // NOI18N
        jButton9.setText("Cancel Invoice");
        jButton9.setBorderPainted(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", " " }));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jTextField9))
                .addGap(18, 18, 18)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel24.add(jPanel67, java.awt.BorderLayout.PAGE_END);

        jPanel68.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket ID", "Customer", "Movie", "Ticket Price", "Hall No", "Sheet No", "Start Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel68.add(jScrollPane1);

        jPanel24.add(jPanel68, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel15, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jButton3.grabFocus();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MovieManageGRN(this, true).show();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LogingOption login = new LogingOption();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextField4ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ComponentResized

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        new Hall01(this, true).show();
    }//GEN-LAST:event_H1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        new Hall02(this, true).show();
    }//GEN-LAST:event_H2ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        new Hall03(this, true).show();
    }//GEN-LAST:event_H3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TicketsPricesCashier(this, true).show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String TicketID = jTextField1.getText();
        String CustomerNum = jTextField2.getText();
        String Moviename = jTextField3.getText();
        String HallNo = jTextField4.getText();
        String StartTime = jTextField8.getText();
        String EndTime = jTextField10.getText();
        String sheetNo = jTextField5.getText();
        String TicketPrice = jTextField6.getText();

        // Validate empty fields
        if (CustomerNum.isEmpty() || Moviename.isEmpty() || HallNo.isEmpty()
                || StartTime.isEmpty() || EndTime.isEmpty()
                || sheetNo.isEmpty() || TicketPrice.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!CustomerNum.matches("^07[01245678]{1}[0-9]{7}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double ticketPriceValue;
        try {
            ticketPriceValue = Double.parseDouble(TicketPrice); // Parse TicketPrice to a double
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid ticket price", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Check same movie
        for (int i = 0; i < model.getRowCount(); i++) {
            String existingMoviename = model.getValueAt(i, 2).toString(); // Assuming column 2 is movie name
            String existingSheetNo = model.getValueAt(i, 5).toString(); // Assuming column 6 is sheet no
            if (!existingMoviename.equalsIgnoreCase(Moviename)) {
                JOptionPane.showMessageDialog(this, "This movie is not the same Movie", "Duplicate Movie", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (existingMoviename.equalsIgnoreCase(Moviename) && existingSheetNo.equals(sheetNo)) {
                JOptionPane.showMessageDialog(this, "The sheet number already Book", "Duplicate Sheet Number", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        // Add ticket data to table
        model.addRow(new Object[]{TicketID, CustomerNum, Moviename, ticketPriceValue, HallNo, sheetNo, StartTime});

        // Clear 
        jTextField5.setText("");

        // Update total 
        double currentTotal = Double.parseDouble(jLabel7.getText());
        currentTotal += ticketPriceValue;
        jLabel7.setText(String.valueOf(currentTotal));

        // Add ticket to InvoiceItemMap
        InvoiceItem invoiceItem = new InvoiceItem();
        invoiceItem.setTicketID(TicketID);
        invoiceItem.setCustomerNum(CustomerNum);
        invoiceItem.setMoviename(Moviename);
        invoiceItem.setHallNo(HallNo);
        invoiceItem.setStartTime(StartTime);
        invoiceItem.setsheetNo(sheetNo);
        invoiceItem.setTicketPrice(ticketPriceValue);

        InvoiceItemMap.put(TicketID, invoiceItem);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        calculationMethod();
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            String customerMobile = jTextField2.getText();
            String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String paymentMethodID = paymentMethod.get(String.valueOf(jComboBox1.getSelectedItem()));
            String priceT = jLabel7.getText();
            int rowCount = jTable1.getRowCount();
            String user = jLabel2.getText();

            // Customer Register or not register
            ResultSet rs = mySQL.executeSearch("SELECT * FROM `customer` WHERE `mobile` = '" + customerMobile + "'");
            if (!rs.next()) {
                // new customer register
                mySQL.executeIUD("INSERT INTO `customer` (`mobile`, `customer_type_id`) VALUES('" + customerMobile + "', '1')");
            }

            for (InvoiceItem invoiceItem : InvoiceItemMap.values()) {
                String invoiceID = invoiceItem.getTicketID();

                // Insert to invoice
                mySQL.executeIUD("INSERT INTO `invoice` VALUES('" + invoiceID + "','" + dateTime + "','" + priceT + "',"
                        + "'" + rowCount + "','1','" + user + "')");

            }

            // Insert to invoice itam
            for (InvoiceItem invoiceItem : InvoiceItemMap.values()) {
                try {
                    String sheetNumber = invoiceItem.getsheetNo();

                    mySQL.executeIUD("INSERT INTO `movie_invoiceitem` (`sheet_number`, `invoice_id`, `ticket_id`, `customer_mobile`,"
                            + "`schedule_id`)"
                            + "VALUES ('" + sheetNumber + "', '" + invoiceItem.getTicketID() + "','" + laky + "',"
                            + "'" + invoiceItem.getCustomerNum() + "','" + sheduleID + "')");

//                    for (int i = 0; i < rowCount; i++) {
//
//                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
