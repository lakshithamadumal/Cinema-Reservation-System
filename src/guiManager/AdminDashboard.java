/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiManager;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.raven.chart.ModelChart;
import guiLogin.LogingOption;
import guiSnackbar.snackbarDashboard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Geeth Kalhara
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public AdminDashboard() {
        initComponents();
        progressChart();
        

//        Frame();
    }

    public void progressChart() {

        progress1.start();
        progress2.start();
        progress3.start();
        progress4.start();

        chart1.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        chart1.addLegend("Expense", new Color(54, 4, 143), new Color(104, 48, 200));
        chart1.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        chart1.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        chart1.addData(new ModelChart("January", new double[]{800, 600, 500, 700}));
        chart1.addData(new ModelChart("February", new double[]{600, 750, 600, 350}));
        chart1.addData(new ModelChart("March", new double[]{400, 350, 460, 600}));
        chart1.addData(new ModelChart("April", new double[]{580, 350, 750, 700}));
        chart1.addData(new ModelChart("May", new double[]{650, 440, 570, 650}));
        chart1.addData(new ModelChart("June", new double[]{390, 480, 400, 500}));
        chart1.addData(new ModelChart("July", new double[]{500, 480, 400, 300}));

        chart1.start();

        chart2.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        chart2.addLegend("Expense", new Color(54, 4, 143), new Color(104, 48, 200));
        chart2.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        chart2.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        chart2.addData(new ModelChart("January", new double[]{800, 600, 500, 700}));
        chart2.addData(new ModelChart("February", new double[]{600, 750, 600, 350}));
        chart2.addData(new ModelChart("March", new double[]{400, 350, 460, 600}));
        chart2.addData(new ModelChart("April", new double[]{580, 350, 750, 700}));
        chart2.addData(new ModelChart("May", new double[]{650, 440, 570, 650}));
        chart2.addData(new ModelChart("June", new double[]{390, 480, 400, 500}));
        chart2.addData(new ModelChart("July", new double[]{500, 480, 400, 300}));

        chart2.start();

    }

//     public void Frame() {
//        setUndecorated(true);
//        setAlwaysOnTop(true);
//        setResizable(false);
//        setVisible(true);
//        Toolkit tk = Toolkit.getDefaultToolkit();
//
//        int x = (int) tk.getScreenSize().getWidth();
//        int y = (int) tk.getScreenSize().getHeight();
//        setSize(x, y);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        roundPanel4 = new com.raven.swing.RoundPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        progress1 = new com.raven.swing.progress.Progress();
        jPanel60 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        progress2 = new com.raven.swing.progress.Progress();
        jPanel72 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        roundPanel5 = new com.raven.swing.RoundPanel();
        chart1 = new com.raven.chart.Chart();
        jPanel8 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        roundPanel6 = new com.raven.swing.RoundPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        progress3 = new com.raven.swing.progress.Progress();
        jPanel58 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        progress4 = new com.raven.swing.progress.Progress();
        jPanel28 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        roundPanel7 = new com.raven.swing.RoundPanel();
        chart2 = new com.raven.chart.LineChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");

        jPanel1.setBackground(new java.awt.Color(0, 34, 68));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(31, 35, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(215, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cinema (2).png"))); // NOI18N
        jPanel4.add(jLabel1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(31, 35, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(215, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(31, 35, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(205, 100));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(31, 35, 51));
        jPanel12.setPreferredSize(new java.awt.Dimension(205, 60));

        jLabel5.setText("    ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/contacts-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(44, 44, 44))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(31, 35, 51));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2024/05/09   10.00 PM");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(31, 35, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(20, 22, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(215, 700));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(20, 22, 32));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(215, 100));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/logout-24.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel2.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(20, 22, 32));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(20, 22, 32));
        jPanel15.setPreferredSize(new java.awt.Dimension(215, 80));

        jButton2.setBackground(new java.awt.Color(31, 35, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/pin.png"))); // NOI18N
        jButton2.setBorderPainted(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(20, 22, 32));
        jPanel16.setPreferredSize(new java.awt.Dimension(215, 500));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setPreferredSize(new java.awt.Dimension(215, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel18.setPreferredSize(new java.awt.Dimension(215, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jPanel19.setBackground(new java.awt.Color(20, 22, 32));
        jPanel19.setPreferredSize(new java.awt.Dimension(5, 470));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel19, java.awt.BorderLayout.LINE_END);

        jPanel20.setBackground(new java.awt.Color(20, 22, 32));
        jPanel20.setPreferredSize(new java.awt.Dimension(5, 470));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel21.setBackground(new java.awt.Color(20, 22, 32));
        jPanel21.setLayout(new java.awt.GridLayout(8, 1, 0, 8));

        jButton9.setBackground(new java.awt.Color(31, 35, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/132301_list_clien_icon.png"))); // NOI18N
        jButton9.setText("Manage Employee");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton9);

        jButton10.setBackground(new java.awt.Color(31, 35, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/male_female_users.png"))); // NOI18N
        jButton10.setText("View All Customer");
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton10);

        jButton11.setBackground(new java.awt.Color(31, 35, 51));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/video-player.png"))); // NOI18N
        jButton11.setText("Movie Manage");
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton11);

        jButton12.setBackground(new java.awt.Color(31, 35, 51));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/schedule.png"))); // NOI18N
        jButton12.setText("Schedule Manage");
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton12);

        jButton14.setBackground(new java.awt.Color(31, 35, 51));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons8-note-24.png"))); // NOI18N
        jButton14.setText("View All MRN");
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton14);

        jButton4.setBackground(new java.awt.Color(31, 35, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ticket.png"))); // NOI18N
        jButton4.setText("Ticket Prices");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton4);

        jButton15.setBackground(new java.awt.Color(31, 35, 51));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/report.png"))); // NOI18N
        jButton15.setText("Report");
        jButton15.setBorderPainted(false);
        jPanel21.add(jButton15);

        jButton3.setBackground(new java.awt.Color(31, 35, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons8-settings-24.png"))); // NOI18N
        jButton3.setText("Settings");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton3);

        jPanel16.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(809, 342));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(200, 342));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel30, java.awt.BorderLayout.PAGE_END);

        jPanel31.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(new java.awt.Color(51, 51, 51));
        jPanel32.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jPanel31.add(jPanel32, java.awt.BorderLayout.LINE_START);

        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel34.setBackground(new java.awt.Color(51, 51, 51));
        jPanel34.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel34, java.awt.BorderLayout.LINE_END);

        jPanel35.setBackground(new java.awt.Color(51, 51, 51));
        jPanel35.setLayout(new java.awt.GridLayout(1, 0));

        roundPanel4.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel4.setLayout(new java.awt.BorderLayout());

        jPanel59.setOpaque(false);
        jPanel59.setPreferredSize(new java.awt.Dimension(190, 166));
        jPanel59.setLayout(new java.awt.BorderLayout());

        jPanel61.setOpaque(false);
        jPanel61.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel61.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Monthly Total Income");
        jPanel61.add(jLabel2);

        jPanel59.add(jPanel61, java.awt.BorderLayout.PAGE_START);

        jPanel62.setOpaque(false);
        jPanel62.setLayout(new java.awt.BorderLayout());

        jPanel63.setOpaque(false);
        jPanel63.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel62.add(jPanel63, java.awt.BorderLayout.PAGE_START);

        jPanel64.setLayout(new java.awt.BorderLayout());

        jPanel65.setBackground(new java.awt.Color(51, 51, 51));
        jPanel65.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel64.add(jPanel65, java.awt.BorderLayout.PAGE_END);

        jPanel66.setBackground(new java.awt.Color(51, 51, 51));
        jPanel66.setLayout(new java.awt.GridLayout(1, 0));

        progress1.setBackground(new java.awt.Color(30, 159, 224));
        progress1.setValue(94);
        jPanel66.add(progress1);

        jPanel64.add(jPanel66, java.awt.BorderLayout.CENTER);

        jPanel62.add(jPanel64, java.awt.BorderLayout.CENTER);

        jPanel59.add(jPanel62, java.awt.BorderLayout.CENTER);

        roundPanel4.add(jPanel59, java.awt.BorderLayout.PAGE_START);

        jPanel60.setOpaque(false);
        jPanel60.setLayout(new java.awt.BorderLayout());

        jPanel67.setOpaque(false);
        jPanel67.setLayout(new java.awt.BorderLayout());

        jPanel68.setOpaque(false);
        jPanel68.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel67.add(jPanel68, java.awt.BorderLayout.PAGE_START);

        jPanel69.setLayout(new java.awt.BorderLayout());

        jPanel71.setBackground(new java.awt.Color(51, 51, 51));
        jPanel71.setLayout(new java.awt.BorderLayout());

        jPanel53.setOpaque(false);
        jPanel53.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel71.add(jPanel53, java.awt.BorderLayout.PAGE_START);

        jPanel54.setLayout(new java.awt.BorderLayout());

        jPanel56.setBackground(new java.awt.Color(51, 51, 51));
        jPanel56.setLayout(new java.awt.GridLayout(1, 0));

        progress2.setBackground(new java.awt.Color(25, 189, 68));
        progress2.setForeground(new java.awt.Color(66, 246, 59));
        progress2.setValue(80);
        jPanel56.add(progress2);

        jPanel54.add(jPanel56, java.awt.BorderLayout.CENTER);

        jPanel71.add(jPanel54, java.awt.BorderLayout.CENTER);

        jPanel69.add(jPanel71, java.awt.BorderLayout.CENTER);

        jPanel67.add(jPanel69, java.awt.BorderLayout.CENTER);

        jPanel60.add(jPanel67, java.awt.BorderLayout.CENTER);

        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel72.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Monthly Total Expensess");
        jPanel72.add(jLabel6);

        jPanel60.add(jPanel72, java.awt.BorderLayout.PAGE_START);

        roundPanel4.add(jPanel60, java.awt.BorderLayout.CENTER);

        jPanel35.add(roundPanel4);

        jPanel33.add(jPanel35, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel33, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel36.setBackground(new java.awt.Color(51, 51, 51));
        jPanel36.setPreferredSize(new java.awt.Dimension(609, 5));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel36, java.awt.BorderLayout.PAGE_START);

        jPanel37.setBackground(new java.awt.Color(51, 51, 51));
        jPanel37.setPreferredSize(new java.awt.Dimension(609, 5));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel37, java.awt.BorderLayout.PAGE_END);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setBackground(new java.awt.Color(51, 51, 51));
        jPanel39.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel39, java.awt.BorderLayout.LINE_END);

        jPanel40.setBackground(new java.awt.Color(51, 51, 51));
        jPanel40.setLayout(new java.awt.GridLayout(1, 0));

        roundPanel5.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel5.setLayout(new java.awt.GridLayout(1, 0));

        chart1.setForeground(new java.awt.Color(255, 255, 255));
        roundPanel5.add(chart1);

        jPanel40.add(roundPanel5);

        jPanel38.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel27.setPreferredSize(new java.awt.Dimension(200, 342));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel41.setBackground(new java.awt.Color(51, 51, 51));
        jPanel41.setPreferredSize(new java.awt.Dimension(200, 2));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel42.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel42, java.awt.BorderLayout.PAGE_END);

        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel44.setBackground(new java.awt.Color(51, 51, 51));
        jPanel44.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel44, java.awt.BorderLayout.LINE_START);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel46.setBackground(new java.awt.Color(51, 51, 51));
        jPanel46.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jPanel45.add(jPanel46, java.awt.BorderLayout.LINE_END);

        jPanel47.setBackground(new java.awt.Color(51, 51, 51));
        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        roundPanel6.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel6.setLayout(new java.awt.BorderLayout());

        jPanel57.setOpaque(false);
        jPanel57.setPreferredSize(new java.awt.Dimension(190, 166));
        jPanel57.setLayout(new java.awt.BorderLayout());

        jPanel73.setOpaque(false);
        jPanel73.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel73.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Monthly Total Profit");
        jPanel73.add(jLabel7);

        jPanel57.add(jPanel73, java.awt.BorderLayout.PAGE_START);

        jPanel70.setOpaque(false);
        jPanel70.setLayout(new java.awt.BorderLayout());

        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel70.add(jPanel74, java.awt.BorderLayout.PAGE_START);

        jPanel75.setLayout(new java.awt.BorderLayout());

        jPanel76.setBackground(new java.awt.Color(51, 51, 51));
        jPanel76.setLayout(new java.awt.BorderLayout());

        jPanel77.setOpaque(false);
        jPanel77.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel76.add(jPanel77, java.awt.BorderLayout.PAGE_START);

        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel79.setBackground(new java.awt.Color(51, 51, 51));
        jPanel79.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel79, java.awt.BorderLayout.PAGE_END);

        jPanel80.setBackground(new java.awt.Color(51, 51, 51));
        jPanel80.setLayout(new java.awt.GridLayout(1, 0));

        progress3.setBackground(new java.awt.Color(227, 181, 9));
        progress3.setForeground(new java.awt.Color(227, 181, 9));
        progress3.setValue(65);
        jPanel80.add(progress3);

        jPanel78.add(jPanel80, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel78, java.awt.BorderLayout.CENTER);

        jPanel75.add(jPanel76, java.awt.BorderLayout.CENTER);

        jPanel70.add(jPanel75, java.awt.BorderLayout.CENTER);

        jPanel57.add(jPanel70, java.awt.BorderLayout.CENTER);

        roundPanel6.add(jPanel57, java.awt.BorderLayout.PAGE_START);

        jPanel58.setOpaque(false);
        jPanel58.setLayout(new java.awt.BorderLayout());

        jPanel81.setOpaque(false);
        jPanel81.setPreferredSize(new java.awt.Dimension(190, 30));
        jPanel81.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Yearly Total Profit");
        jPanel81.add(jLabel10);

        jPanel58.add(jPanel81, java.awt.BorderLayout.PAGE_START);

        jPanel82.setOpaque(false);
        jPanel82.setLayout(new java.awt.BorderLayout());

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel82.add(jPanel83, java.awt.BorderLayout.PAGE_START);

        jPanel84.setLayout(new java.awt.BorderLayout());

        jPanel85.setBackground(new java.awt.Color(51, 51, 51));
        jPanel85.setLayout(new java.awt.BorderLayout());

        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel85.add(jPanel86, java.awt.BorderLayout.PAGE_START);

        jPanel87.setLayout(new java.awt.BorderLayout());

        jPanel88.setBackground(new java.awt.Color(51, 51, 51));
        jPanel88.setPreferredSize(new java.awt.Dimension(190, 4));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel87.add(jPanel88, java.awt.BorderLayout.PAGE_END);

        jPanel89.setBackground(new java.awt.Color(51, 51, 51));
        jPanel89.setLayout(new java.awt.GridLayout(1, 0));

        progress4.setBackground(new java.awt.Color(44, 217, 255));
        progress4.setForeground(new java.awt.Color(44, 217, 255));
        progress4.setValue(71);
        jPanel89.add(progress4);

        jPanel87.add(jPanel89, java.awt.BorderLayout.CENTER);

        jPanel85.add(jPanel87, java.awt.BorderLayout.CENTER);

        jPanel84.add(jPanel85, java.awt.BorderLayout.CENTER);

        jPanel82.add(jPanel84, java.awt.BorderLayout.CENTER);

        jPanel58.add(jPanel82, java.awt.BorderLayout.CENTER);

        roundPanel6.add(jPanel58, java.awt.BorderLayout.CENTER);

        jPanel47.add(roundPanel6);

        jPanel45.add(jPanel47, java.awt.BorderLayout.CENTER);

        jPanel43.add(jPanel45, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel43, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel27, java.awt.BorderLayout.LINE_START);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel48.setBackground(new java.awt.Color(51, 51, 51));
        jPanel48.setPreferredSize(new java.awt.Dimension(609, 2));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel48, java.awt.BorderLayout.PAGE_START);

        jPanel49.setPreferredSize(new java.awt.Dimension(609, 5));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel49, java.awt.BorderLayout.PAGE_END);

        jPanel50.setLayout(new java.awt.BorderLayout());

        jPanel51.setBackground(new java.awt.Color(51, 51, 51));
        jPanel51.setPreferredSize(new java.awt.Dimension(5, 332));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jPanel50.add(jPanel51, java.awt.BorderLayout.LINE_END);

        jPanel52.setBackground(new java.awt.Color(51, 51, 51));
        jPanel52.setLayout(new java.awt.GridLayout(1, 0));

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel7.setLayout(new java.awt.GridLayout(1, 0));

        chart2.setForeground(new java.awt.Color(255, 255, 255));
        roundPanel7.add(chart2);

        jPanel52.add(roundPanel7);

        jPanel50.add(jPanel52, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel50, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel24, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jPanel24.removeAll();

        EmployeeManage employeeManage = new EmployeeManage();
        jPanel24.add(employeeManage, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

//         ManageMovie manageMovie = new ManageMovie();
//         manageMovie.setVisible(true);
        jPanel24.removeAll();

        MovieManage movieManage = new MovieManage();
        jPanel24.add(movieManage, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jPanel24.removeAll();

        CustomersView customersView = new CustomersView();
        jPanel24.add(customersView, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
//        SheduleManagement sheduleManagement = new SheduleManagement();
//        sheduleManagement.setVisible(true);

        jPanel24.removeAll();

        MovieScheduleTime movieScheduleTime = new MovieScheduleTime();
        jPanel24.add(movieScheduleTime, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        jPanel24.removeAll();

        ViewAllMRN viewAll = new ViewAllMRN();
        jPanel24.add(viewAll, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jPanel24.removeAll();

        TicketsPrice ticketsPrice = new TicketsPrice();
        jPanel24.add(ticketsPrice, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jPanel24.removeAll();

        settings Setting = new settings();
        jPanel24.add(Setting, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel24);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LogingOption loginoption = new LogingOption();
        loginoption.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart1;
    private com.raven.chart.LineChart chart2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private com.raven.swing.progress.Progress progress1;
    private com.raven.swing.progress.Progress progress2;
    private com.raven.swing.progress.Progress progress3;
    private com.raven.swing.progress.Progress progress4;
    private com.raven.swing.RoundPanel roundPanel4;
    private com.raven.swing.RoundPanel roundPanel5;
    private com.raven.swing.RoundPanel roundPanel6;
    private com.raven.swing.RoundPanel roundPanel7;
    // End of variables declaration//GEN-END:variables

}
