/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiLogin;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.mySQL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.mySQL;

/**
 *
 * @author wajir
 */
public class ReadQRCode extends javax.swing.JFrame implements Runnable,ThreadFactory{
    private Webcam webcam = null;
    private WebcamPanel panel = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    
    public ReadQRCode() {
        initComponents();
        initWebcam();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Read QR Code");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Result");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "qrnumber", "date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(470, 470, 470)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try{
        
         String Qrcode = jTextField1.getText();
         //System.out.println(Qrcode);
//         java.util.Date date = new java.util.Date();
//                    java.sql.Date sqldate = new java.sql.Date (date.getTime());
//                    java.sql.Timestamp sqltime = new java.sql.Timestamp (date.getTime());

                  Date date = new Date();
                   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ResultSet resultSet1 = mySQL.executeSearch("SELECT * FROM `employee` WHERE `qrnumber`='" + Qrcode  + "' ");

                   
        if(resultSet1.next()){
            
             mySQL.executeIUD("INSERT INTO `employye_attendce`( `qrnumber`,`date`)"
                            + "VALUES('" + Qrcode  + "','" + sdf.format(date) + "')");
            
          JOptionPane.showMessageDialog(this, "MARKED", "Warning", JOptionPane.WARNING_MESSAGE);

          
          
        }else{
            
      
                        JOptionPane.showMessageDialog(this, "UUUUNNNNNNNNNNNNNNNNNMARKED", "Warning", JOptionPane.WARNING_MESSAGE);


                   
                    

                    
                
        }
        
        
        }catch (Exception e) {
            e.printStackTrace();
        }
        
       
        
        
        
        
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
//        String QRcode = jTextField1.getText();
        //Resultset resultset = 
//if (evt.getKeyCode () == KeyEvent.VK_ENTER) {
//JOptionPane.showMessageDialog(this, "Your QRcode number is :" + QRcode);
//java.util.Date date = new java.util.Date();
//java.sql.Date sqldate = new java.sql.Date (date.getTime());
//java.sql.Timestamp sqltime = new java.sql.Timestamp (date.getTime());
////pst = con.prepareStatement("SELECT * FROM employye_attendce WHERE barcodenumber = ?");
//pst = con.
//pst.setString(1,QRcode);
//}
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadQRCode().setVisible(true);
            }
        });
    }
    private void initWebcam(){
Dimension size = WebcamResolution.QVGA.getSize();
webcam = Webcam.getWebcams().get(0);
webcam.setViewSize(size);

panel = new WebcamPanel(webcam);
panel.setPreferredSize(size);
panel.setFPSDisplayed(true);

jPanel2.add(panel,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,200,100));
executor.execute(this);
}
    
    @Override
    
    public void run(){
    do{
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReadQRCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        Result result = null;
        BufferedImage image = null;
        
        if(webcam.isOpen()){
        if((image = webcam.getImage()) == null){
        continue;
        }
        }
        
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        
        try {
            result = new MultiFormatReader().decode(bitmap);
        } catch (NotFoundException ex) {
            Logger.getLogger(ReadQRCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(result !=null){
        jTextField1.setText(result.getText());
        }
        
    }while(true);
    }
//@Override
public Thread newThread(Runnable r){
Thread t = new Thread(r,"My Thread");
t.setDaemon(true);
return t;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
