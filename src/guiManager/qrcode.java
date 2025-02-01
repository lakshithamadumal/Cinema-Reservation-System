package guiManager;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.mySQL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author wajir
 */
public class qrcode {

    private static final String outputQr = "C:\\QRCode\\outputqrcode.png";

    private static void generateQRcode(String text, int width, int height, String filePath) throws WriterException, IOException {
        QRCodeWriter qc = new QRCodeWriter();
        BitMatrix bm = qc.encode(text, BarcodeFormat.QR_CODE, width, height);
        Path pobj = FileSystems.getDefault().getPath(filePath);
        try {
            MatrixToImageWriter.writeToPath(bm, "PNG", pobj);
        } catch (IOException ex) {
            Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws WriterException, IOException {

        generateQRcode("103", 1250, 1250, outputQr);
    }
}
