package guiSnackbar;

import com.toedter.calendar.JDateChooser;

import guiManager.SupplierregistrationNew;
import guiManager.SupplierregistrationNew;
import java.awt.Color;
import java.awt.Frame;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.function.Supplier;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import model.GrnItem;
import model.mySQL;
import model.snackGrnitem;

/**
 *
 * @author Heshan Nawarathna
 */
public class snack_GRN extends javax.swing.JFrame {

    HashMap<String, snackGrnitem> snackGrnitemMap = new HashMap<>();

    public snack_GRN() {
        initComponents();
        init();
        generateGRNId();
        loadGRNItem();
        jLabel17.setText(SnackLogin.getuserEmail());

    }

    //Supplier_mobile
    public JTextField getjTextField2() {
        return jTextField2;
    }

    //supplier_name
    public JLabel getjLabel4() {
        return jLabel4;
    }

    //grap and product id
    public JTextField getjTextField4() {
        return jTextField4;
    }

    //brand name
    public JLabel getjLabel3() {
        return jLabel3;
    }

    //product_name
    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    private void init() {

        jTextField1.putClientProperty("JComponent.roundRect", true);
        jTextField2.putClientProperty("JComponent.roundRect", true);
        jTextField4.putClientProperty("JComponent.roundRect", true);

        jButton1.putClientProperty("JButton.buttonType", "roundRect");
        jButton2.putClientProperty("JButton.buttonType", "roundRect");

    }

    private void generateGRNId() {
        long id = System.currentTimeMillis();
        jTextField1.setText(String.valueOf(id));
        jTextField1.setEnabled(false);
    }

    private void loadGRNItem() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        double total = 0;
        for (snackGrnitem snGrnItem : snackGrnitemMap.values()) {

            Vector<String> vector = new Vector<>();
            vector.add(snGrnItem.getProductId());
            vector.add(snGrnItem.getBrand());
            vector.add(snGrnItem.getProductname());
            vector.add(String.valueOf(snGrnItem.getQty()));
            vector.add(String.valueOf(snGrnItem.getBuyingPrice()));
            vector.add(String.valueOf(snGrnItem.getSellingPrice()));
            vector.add(format.format(snGrnItem.getMfd()));
            vector.add(format.format(snGrnItem.getExp()));

            double itemTotal = snGrnItem.getQty() * snGrnItem.getBuyingPrice();
            total += itemTotal;
            vector.add(String.valueOf(itemTotal));

            model.addRow(vector);

        }

        jLabel11.setText(String.valueOf(total));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel162 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel57 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel60 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel134 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jPanel124 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jPanel126 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jPanel108 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel109 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel144 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel149 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel118 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel155 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jPanel161 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel65 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1129, 45));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("        SnackBar GRN");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel162.setPreferredSize(new java.awt.Dimension(400, 45));
        jPanel162.setLayout(new java.awt.BorderLayout());

        jPanel163.setPreferredSize(new java.awt.Dimension(101, 45));
        jPanel163.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("User Email :");
        jPanel163.add(jLabel16, java.awt.BorderLayout.PAGE_END);

        jPanel162.add(jPanel163, java.awt.BorderLayout.LINE_START);

        jPanel164.setLayout(new java.awt.BorderLayout());

        jPanel165.setPreferredSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout jPanel165Layout = new javax.swing.GroupLayout(jPanel165);
        jPanel165.setLayout(jPanel165Layout);
        jPanel165Layout.setHorizontalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel165Layout.setVerticalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel164.add(jPanel165, java.awt.BorderLayout.LINE_START);

        jPanel166.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("user.one@example.com");
        jPanel166.add(jLabel17, java.awt.BorderLayout.PAGE_END);

        jPanel164.add(jPanel166, java.awt.BorderLayout.CENTER);

        jPanel162.add(jPanel164, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel162, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(5, 423));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(10, 423));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(1279, 150));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(380, 150));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel27.setPreferredSize(new java.awt.Dimension(380, 10));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel68.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel68.setLayout(new java.awt.BorderLayout());

        jPanel77.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel68.add(jPanel77, java.awt.BorderLayout.LINE_START);

        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel83.setPreferredSize(new java.awt.Dimension(101, 40));
        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name : ");
        jPanel83.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel78.add(jPanel83, java.awt.BorderLayout.LINE_START);

        jPanel84.setLayout(new java.awt.BorderLayout());

        jPanel85.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel84.add(jPanel85, java.awt.BorderLayout.LINE_START);

        jPanel86.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Peoduct Name");
        jPanel86.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel84.add(jPanel86, java.awt.BorderLayout.CENTER);

        jPanel78.add(jPanel84, java.awt.BorderLayout.CENTER);

        jPanel68.add(jPanel78, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel68, java.awt.BorderLayout.PAGE_START);

        jPanel69.setLayout(new java.awt.BorderLayout());

        jPanel70.setPreferredSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel69.add(jPanel70, java.awt.BorderLayout.PAGE_START);

        jPanel71.setLayout(new java.awt.BorderLayout());

        jPanel72.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel72.setLayout(new java.awt.BorderLayout());

        jPanel79.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel72.add(jPanel79, java.awt.BorderLayout.LINE_START);

        jPanel81.setLayout(new java.awt.BorderLayout());

        jPanel87.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel81.add(jPanel87, java.awt.BorderLayout.LINE_START);

        jPanel89.setLayout(new java.awt.BorderLayout());

        jPanel93.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel93.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MFD");
        jPanel93.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel93, java.awt.BorderLayout.LINE_START);

        jPanel94.setLayout(new java.awt.BorderLayout());

        jPanel95.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel94.add(jPanel95, java.awt.BorderLayout.LINE_START);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel94.add(jDateChooser1, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel94, java.awt.BorderLayout.CENTER);

        jPanel81.add(jPanel89, java.awt.BorderLayout.CENTER);

        jPanel72.add(jPanel81, java.awt.BorderLayout.CENTER);

        jPanel71.add(jPanel72, java.awt.BorderLayout.PAGE_START);

        jPanel73.setLayout(new java.awt.BorderLayout());

        jPanel74.setPreferredSize(new java.awt.Dimension(380, 5));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel74, java.awt.BorderLayout.PAGE_START);

        jPanel75.setLayout(new java.awt.BorderLayout());

        jPanel76.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel76.setLayout(new java.awt.BorderLayout());

        jPanel80.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel76.add(jPanel80, java.awt.BorderLayout.LINE_START);

        jPanel82.setLayout(new java.awt.BorderLayout());

        jPanel90.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel82.add(jPanel90, java.awt.BorderLayout.LINE_START);

        jPanel92.setLayout(new java.awt.BorderLayout());

        jPanel96.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel96.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EXP");
        jPanel96.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel92.add(jPanel96, java.awt.BorderLayout.LINE_START);

        jPanel97.setLayout(new java.awt.BorderLayout());

        jPanel98.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel97.add(jPanel98, java.awt.BorderLayout.LINE_START);

        jPanel99.setLayout(new java.awt.BorderLayout());

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel99.add(jDateChooser2, java.awt.BorderLayout.CENTER);

        jPanel97.add(jPanel99, java.awt.BorderLayout.CENTER);

        jPanel92.add(jPanel97, java.awt.BorderLayout.CENTER);

        jPanel82.add(jPanel92, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel82, java.awt.BorderLayout.CENTER);

        jPanel75.add(jPanel76, java.awt.BorderLayout.PAGE_START);

        jPanel73.add(jPanel75, java.awt.BorderLayout.CENTER);

        jPanel71.add(jPanel73, java.awt.BorderLayout.CENTER);

        jPanel69.add(jPanel71, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel69, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel12.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(760, 40));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel29.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel29, java.awt.BorderLayout.LINE_START);

        jPanel30.setLayout(new java.awt.BorderLayout());

        jPanel31.setPreferredSize(new java.awt.Dimension(370, 40));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jTextField1.setText("GRN Number");
        jPanel31.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel30.add(jPanel31, java.awt.BorderLayout.LINE_START);

        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel33.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setLayout(new java.awt.BorderLayout());

        jPanel35.setPreferredSize(new java.awt.Dimension(101, 40));
        jPanel35.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Brand :  ");
        jPanel35.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel34.add(jPanel35, java.awt.BorderLayout.LINE_START);

        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    Brand ");
        jPanel36.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel34.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel32.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel30.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel30, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setPreferredSize(new java.awt.Dimension(760, 5));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setPreferredSize(new java.awt.Dimension(760, 40));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel37.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel37, java.awt.BorderLayout.LINE_START);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel39.setLayout(new java.awt.BorderLayout());
        jPanel39.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel39, java.awt.BorderLayout.LINE_START);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel41.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel41, java.awt.BorderLayout.LINE_START);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel43.setPreferredSize(new java.awt.Dimension(115, 40));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(24, 119, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel43.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel43, java.awt.BorderLayout.LINE_START);

        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel45.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel44.add(jPanel45, java.awt.BorderLayout.LINE_START);

        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel47.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel47.setLayout(new java.awt.BorderLayout());
        jPanel47.add(jTextField4, java.awt.BorderLayout.CENTER);

        jPanel46.add(jPanel47, java.awt.BorderLayout.LINE_START);

        jPanel48.setLayout(new java.awt.BorderLayout());

        jPanel49.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel48.add(jPanel49, java.awt.BorderLayout.LINE_START);

        jPanel50.setLayout(new java.awt.BorderLayout());
        jPanel48.add(jPanel50, java.awt.BorderLayout.CENTER);

        jPanel46.add(jPanel48, java.awt.BorderLayout.CENTER);

        jPanel44.add(jPanel46, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel40.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setPreferredSize(new java.awt.Dimension(760, 5));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel26.setPreferredSize(new java.awt.Dimension(760, 40));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel51.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel51, java.awt.BorderLayout.LINE_START);

        jPanel52.setLayout(new java.awt.BorderLayout());

        jPanel53.setPreferredSize(new java.awt.Dimension(270, 40));
        jPanel53.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Supplier NAME");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel53.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel52.add(jPanel53, java.awt.BorderLayout.LINE_START);

        jPanel54.setLayout(new java.awt.BorderLayout());

        jPanel55.setPreferredSize(new java.awt.Dimension(55, 40));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel54.add(jPanel55, java.awt.BorderLayout.LINE_START);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel13.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel56.setLayout(new java.awt.BorderLayout());

        jPanel58.setPreferredSize(new java.awt.Dimension(273, 40));
        jPanel58.setLayout(new java.awt.BorderLayout());

        jPanel15.setPreferredSize(new java.awt.Dimension(80, 40));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField3.setText("00");
        jPanel15.add(jFormattedTextField3, java.awt.BorderLayout.CENTER);

        jPanel58.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel57.setLayout(new java.awt.BorderLayout());

        jPanel59.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel59.setLayout(new java.awt.BorderLayout());

        jPanel61.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel59.add(jPanel61, java.awt.BorderLayout.LINE_START);

        jPanel62.setLayout(new java.awt.BorderLayout());

        jPanel63.setPreferredSize(new java.awt.Dimension(60, 40));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel62.add(jPanel63, java.awt.BorderLayout.LINE_END);

        jPanel66.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(24, 119, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel62.add(jPanel66, java.awt.BorderLayout.CENTER);

        jPanel59.add(jPanel62, java.awt.BorderLayout.CENTER);

        jPanel57.add(jPanel59, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel60, java.awt.BorderLayout.CENTER);

        jPanel58.add(jPanel57, java.awt.BorderLayout.CENTER);

        jPanel56.add(jPanel58, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel56, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel54.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel52.add(jPanel54, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel52, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        jPanel23.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel11.setPreferredSize(new java.awt.Dimension(330, 567));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel64.setPreferredSize(new java.awt.Dimension(10, 567));
        jPanel64.setLayout(new java.awt.BorderLayout());
        jPanel11.add(jPanel64, java.awt.BorderLayout.LINE_START);

        jPanel67.setLayout(new java.awt.BorderLayout());

        jPanel100.setPreferredSize(new java.awt.Dimension(180, 217));
        jPanel100.setLayout(new java.awt.BorderLayout());

        jPanel114.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel100.add(jPanel114, java.awt.BorderLayout.PAGE_START);

        jPanel120.setLayout(new java.awt.BorderLayout());

        jPanel121.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel121.setLayout(new java.awt.BorderLayout());

        jPanel134.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel134.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buing Price :");
        jPanel134.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel121.add(jPanel134, java.awt.BorderLayout.LINE_START);

        jPanel135.setLayout(new java.awt.BorderLayout());

        jPanel88.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel135.add(jPanel88, java.awt.BorderLayout.LINE_END);

        jPanel101.setLayout(new java.awt.BorderLayout());

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel101.add(jFormattedTextField2, java.awt.BorderLayout.CENTER);

        jPanel135.add(jPanel101, java.awt.BorderLayout.CENTER);

        jPanel121.add(jPanel135, java.awt.BorderLayout.CENTER);

        jPanel120.add(jPanel121, java.awt.BorderLayout.PAGE_START);

        jPanel122.setLayout(new java.awt.BorderLayout());

        jPanel123.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel122.add(jPanel123, java.awt.BorderLayout.PAGE_START);

        jPanel124.setLayout(new java.awt.BorderLayout());

        jPanel125.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel125.setLayout(new java.awt.BorderLayout());

        jPanel136.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel136.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buing Price :");
        jPanel136.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel125.add(jPanel136, java.awt.BorderLayout.LINE_START);

        jPanel137.setLayout(new java.awt.BorderLayout());

        jPanel91.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel137.add(jPanel91, java.awt.BorderLayout.LINE_END);

        jPanel102.setLayout(new java.awt.BorderLayout());

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel102.add(jFormattedTextField4, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel102, java.awt.BorderLayout.CENTER);

        jPanel125.add(jPanel137, java.awt.BorderLayout.CENTER);

        jPanel124.add(jPanel125, java.awt.BorderLayout.PAGE_START);

        jPanel126.setLayout(new java.awt.BorderLayout());

        jPanel127.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel126.add(jPanel127, java.awt.BorderLayout.PAGE_START);

        jPanel128.setLayout(new java.awt.BorderLayout());

        jPanel129.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel129.setLayout(new java.awt.BorderLayout());

        jPanel103.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel129.add(jPanel103, java.awt.BorderLayout.LINE_END);

        jPanel105.setLayout(new java.awt.BorderLayout());

        jPanel138.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel138.setLayout(new java.awt.BorderLayout());
        jPanel105.add(jPanel138, java.awt.BorderLayout.LINE_START);

        jPanel107.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(31, 117, 254));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add GRN");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel107.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel105.add(jPanel107, java.awt.BorderLayout.CENTER);

        jPanel129.add(jPanel105, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel129, java.awt.BorderLayout.PAGE_START);

        jPanel130.setLayout(new java.awt.BorderLayout());

        jPanel131.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel130.add(jPanel131, java.awt.BorderLayout.PAGE_START);

        jPanel132.setLayout(new java.awt.BorderLayout());

        jPanel133.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel133.setLayout(new java.awt.BorderLayout());

        jPanel104.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel133.add(jPanel104, java.awt.BorderLayout.LINE_END);

        jPanel106.setLayout(new java.awt.BorderLayout());

        jPanel139.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel139.setLayout(new java.awt.BorderLayout());
        jPanel106.add(jPanel139, java.awt.BorderLayout.LINE_START);

        jPanel108.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel108.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel106.add(jPanel108, java.awt.BorderLayout.CENTER);

        jPanel133.add(jPanel106, java.awt.BorderLayout.CENTER);

        jPanel132.add(jPanel133, java.awt.BorderLayout.PAGE_START);

        jPanel130.add(jPanel132, java.awt.BorderLayout.CENTER);

        jPanel128.add(jPanel130, java.awt.BorderLayout.CENTER);

        jPanel126.add(jPanel128, java.awt.BorderLayout.CENTER);

        jPanel124.add(jPanel126, java.awt.BorderLayout.CENTER);

        jPanel122.add(jPanel124, java.awt.BorderLayout.CENTER);

        jPanel120.add(jPanel122, java.awt.BorderLayout.CENTER);

        jPanel100.add(jPanel120, java.awt.BorderLayout.CENTER);

        jPanel67.add(jPanel100, java.awt.BorderLayout.PAGE_START);

        jPanel109.setPreferredSize(new java.awt.Dimension(180, 217));
        jPanel109.setLayout(new java.awt.BorderLayout());

        jPanel115.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel109.add(jPanel115, java.awt.BorderLayout.PAGE_START);

        jPanel140.setLayout(new java.awt.BorderLayout());

        jPanel141.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel141.setLayout(new java.awt.BorderLayout());

        jPanel142.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel142.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total");
        jPanel142.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel141.add(jPanel142, java.awt.BorderLayout.LINE_START);

        jPanel143.setLayout(new java.awt.BorderLayout());

        jPanel110.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel143.add(jPanel110, java.awt.BorderLayout.LINE_END);

        jPanel111.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("00");
        jPanel111.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel143.add(jPanel111, java.awt.BorderLayout.CENTER);

        jPanel141.add(jPanel143, java.awt.BorderLayout.CENTER);

        jPanel140.add(jPanel141, java.awt.BorderLayout.PAGE_START);

        jPanel144.setLayout(new java.awt.BorderLayout());

        jPanel145.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel144.add(jPanel145, java.awt.BorderLayout.PAGE_START);

        jPanel146.setLayout(new java.awt.BorderLayout());

        jPanel147.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel147.setLayout(new java.awt.BorderLayout());

        jPanel148.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel148.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Payment");
        jPanel148.add(jLabel13, java.awt.BorderLayout.CENTER);

        jPanel147.add(jPanel148, java.awt.BorderLayout.LINE_START);

        jPanel149.setLayout(new java.awt.BorderLayout());

        jPanel112.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel149.add(jPanel112, java.awt.BorderLayout.LINE_END);

        jPanel113.setLayout(new java.awt.BorderLayout());

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jFormattedTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField5KeyReleased(evt);
            }
        });
        jPanel113.add(jFormattedTextField5, java.awt.BorderLayout.CENTER);

        jPanel149.add(jPanel113, java.awt.BorderLayout.CENTER);

        jPanel147.add(jPanel149, java.awt.BorderLayout.CENTER);

        jPanel146.add(jPanel147, java.awt.BorderLayout.PAGE_START);

        jPanel150.setLayout(new java.awt.BorderLayout());

        jPanel151.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel151Layout = new javax.swing.GroupLayout(jPanel151);
        jPanel151.setLayout(jPanel151Layout);
        jPanel151Layout.setHorizontalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel151Layout.setVerticalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel150.add(jPanel151, java.awt.BorderLayout.PAGE_START);

        jPanel152.setLayout(new java.awt.BorderLayout());

        jPanel153.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel153.setLayout(new java.awt.BorderLayout());

        jPanel116.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel116Layout = new javax.swing.GroupLayout(jPanel116);
        jPanel116.setLayout(jPanel116Layout);
        jPanel116Layout.setHorizontalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel116Layout.setVerticalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel153.add(jPanel116, java.awt.BorderLayout.LINE_END);

        jPanel117.setLayout(new java.awt.BorderLayout());

        jPanel154.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel154.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Balance");
        jPanel154.add(jLabel14, java.awt.BorderLayout.CENTER);

        jPanel117.add(jPanel154, java.awt.BorderLayout.LINE_START);

        jPanel118.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("00");
        jPanel118.add(jLabel15, java.awt.BorderLayout.CENTER);

        jPanel117.add(jPanel118, java.awt.BorderLayout.CENTER);

        jPanel153.add(jPanel117, java.awt.BorderLayout.CENTER);

        jPanel152.add(jPanel153, java.awt.BorderLayout.PAGE_START);

        jPanel155.setLayout(new java.awt.BorderLayout());

        jPanel156.setPreferredSize(new java.awt.Dimension(320, 5));

        javax.swing.GroupLayout jPanel156Layout = new javax.swing.GroupLayout(jPanel156);
        jPanel156.setLayout(jPanel156Layout);
        jPanel156Layout.setHorizontalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel156Layout.setVerticalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel155.add(jPanel156, java.awt.BorderLayout.PAGE_START);

        jPanel157.setLayout(new java.awt.BorderLayout());

        jPanel158.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel158.setLayout(new java.awt.BorderLayout());

        jPanel119.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel119Layout = new javax.swing.GroupLayout(jPanel119);
        jPanel119.setLayout(jPanel119Layout);
        jPanel119Layout.setHorizontalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel119Layout.setVerticalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel158.add(jPanel119, java.awt.BorderLayout.LINE_END);

        jPanel159.setLayout(new java.awt.BorderLayout());

        jPanel160.setPreferredSize(new java.awt.Dimension(99, 40));
        jPanel160.setLayout(new java.awt.BorderLayout());
        jPanel159.add(jPanel160, java.awt.BorderLayout.LINE_START);

        jPanel161.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(24, 119, 242));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Save GRN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel161.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel159.add(jPanel161, java.awt.BorderLayout.CENTER);

        jPanel158.add(jPanel159, java.awt.BorderLayout.CENTER);

        jPanel157.add(jPanel158, java.awt.BorderLayout.PAGE_START);

        jPanel155.add(jPanel157, java.awt.BorderLayout.CENTER);

        jPanel152.add(jPanel155, java.awt.BorderLayout.CENTER);

        jPanel150.add(jPanel152, java.awt.BorderLayout.CENTER);

        jPanel146.add(jPanel150, java.awt.BorderLayout.CENTER);

        jPanel144.add(jPanel146, java.awt.BorderLayout.CENTER);

        jPanel140.add(jPanel144, java.awt.BorderLayout.CENTER);

        jPanel109.add(jPanel140, java.awt.BorderLayout.CENTER);

        jPanel67.add(jPanel109, java.awt.BorderLayout.PAGE_END);

        jPanel11.add(jPanel67, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel65.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Brand", "Name", "Quantity", "Buying Price", "Selling Price", "MFD", "EXP", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Selling Price");
        }

        jPanel65.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(1129, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel65.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(jPanel65, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new snackSupplier_view(this, true).show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new manageStockGrn(this, true).show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String suppmobile = jTextField2.getText();
        String brancId = jTextField4.getText();
        String qty = jFormattedTextField3.getText();
        Date mfd = jDateChooser1.getDate();
        Date exp = jDateChooser2.getDate();
        String buying_price = jFormattedTextField2.getText();
        String selling_price = jFormattedTextField4.getText();

        if (suppmobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Supplier", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (brancId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Brand", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (brancId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Brand", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if ("00".equals(qty)) {
            JOptionPane.showMessageDialog(this, "Please Type a Quentity", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (mfd == null) {
            JOptionPane.showMessageDialog(this, "Please Select a Manufacture Date ", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (exp == null) {
            JOptionPane.showMessageDialog(this, "Please Select a Expire date", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (buying_price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Byuing Price", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (selling_price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Selling Price", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            snackGrnitem grnItem = new snackGrnitem();
            grnItem.setProductId(jTextField4.getText());
            grnItem.setBrand(jLabel3.getText());
            grnItem.setProductname(jLabel6.getText());
            grnItem.setQty(Double.parseDouble(qty));
            grnItem.setBuyingPrice(Double.parseDouble(buying_price));
            grnItem.setSellingPrice(Double.parseDouble(selling_price));
            grnItem.setMfd(mfd);
            grnItem.setExp(exp);
            //reset();

            if (snackGrnitemMap.get(jTextField1.getText()) == null) {
                snackGrnitemMap.put(jTextField1.getText(), grnItem);
                loadGRNItem();

            } else {

                snackGrnitem found = snackGrnitemMap.get(jTextField4.getText());

                if (found.getExp().compareTo(exp) == 0
                        && found.getMfd().compareTo(mfd) == 0
                        && found.getBuyingPrice() == Double.parseDouble(buying_price)
                        && found.getSellingPrice() == Double.parseDouble(selling_price)) {

                    found.setQty(found.getQty() + Double.parseDouble(qty));
                    loadGRNItem();

                } else {

                    JOptionPane.showMessageDialog(this, "GRN item already exists with diffrent dates and prices", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFormattedTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField5KeyReleased
        String total = jLabel11.getText();
        String payment = jFormattedTextField5.getText();

        if (payment.isEmpty()) {
            payment = "0";
        } else if (!payment.matches("^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$")) {

            jLabel15.setText("Warning");
            jLabel15.setForeground(Color.RED);
        } else {

            double balance = Double.parseDouble(payment) - Double.parseDouble(total);
            jLabel15.setText(String.valueOf(balance));
            jLabel15.setForeground(Color.WHITE);
        }

    }//GEN-LAST:event_jFormattedTextField5KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String pay = jFormattedTextField5.getText();

        if (pay.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please Type a Payid Amount", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String grnNumber = jTextField1.getText();
                String supplierMobile = jTextField2.getText();
                String employeeEmail = jLabel17.getText();
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                String payidAmount = jFormattedTextField5.getText();

                SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

                mySQL.executeIUD("INSERT INTO `snack_grn` VALUES('" + grnNumber + "','" + date + "','" + payidAmount + "','" + supplierMobile + "','" + employeeEmail + "')");

                for (snackGrnitem grnItem : snackGrnitemMap.values()) {

                    ResultSet resultSet = mySQL.executeSearch("SELECT * FROM `snack_stock` WHERE "
                            + "`snack_product_id`= '" + grnItem.getProductId() + "' AND "
                            + "`selling_price`='" + grnItem.getSellingPrice() + "' AND"
                            + "`mfd` = '" + sim.format(grnItem.getMfd()) + "' AND "
                            + "`exp` = '" + sim.format(grnItem.getExp()) + "'");

                    String stockId = "";
                    if (resultSet.next()) {

                        stockId = resultSet.getString("id");

                        //chech the current qty and update qty
                        String currentqty = resultSet.getString("qty");
                        String updatedQty = String.valueOf(Double.parseDouble(currentqty) + grnItem.getQty());

                        //same id set updateqty
                        mySQL.executeIUD("UPDATE `snack_stock` SET `qty`='" + updatedQty + "' WHERE `id` ='" + stockId + "'");

                    } else {

                        //brand new stock
                        mySQL.executeIUD("INSERT INTO `snack_stock`(`snack_product_id`,`qty`,`selling_price`,`mfd`,`exp`) "
                                + "VALUES('" + grnItem.getProductId() + "','" + grnItem.getQty() + "','" + grnItem.getSellingPrice() + "', "
                                + "'" + sim.format(grnItem.getMfd()) + "','" + sim.format(grnItem.getExp()) + "')");

                        ResultSet resultSet2 = mySQL.executeSearch("SELECT * FROM `snack_stock` WHERE "
                                + "`snack_product_id`= '" + grnItem.getProductId() + "' AND "
                                + "`selling_price`='" + grnItem.getSellingPrice() + "' AND"
                                + "`mfd` = '" + sim.format(grnItem.getMfd()) + "' AND "
                                + "`exp` = '" + sim.format(grnItem.getExp()) + "'");

                        if (resultSet2.next()) {

                            stockId = resultSet2.getString("id");

                        }
                    }
//insert

                    mySQL.executeIUD("INSERT INTO `grn_item`(`snack_stock_id`,`qty`,`buying_price`,`snack_grn_id`) "
                            + "VALUES('" + stockId + "','" + grnItem.getQty() + "','" + grnItem.getBuyingPrice() + "','" + grnNumber + "')");

                    JOptionPane.showMessageDialog(this, "Please Select a Supplier", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments //
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
            java.util.logging.Logger.getLogger(snack_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(snack_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(snack_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(snack_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new snack_GRN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
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
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void reset() {

        generateGRNId();
        jTextField2.setText("");
        jTextField2.setEnabled(true);
        jTextField4.setText("");
        jTextField4.setEnabled(true);

        jFormattedTextField2.setText("");
        jFormattedTextField4.setText("");
        jFormattedTextField3.setText("");

        jLabel4.setText("");
        jLabel4.setText("");
        jLabel6.setText("");
    }

}
