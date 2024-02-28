package engtelecom.poo;

import barcode.CodigoDeBarra;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.QRCode;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException, WriterException {
//        CodigoDeBarra.gerarCodigoDeBarra("129.403.619-08", "cpf.png");

        String valor = "Daniel";

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(valor, BarcodeFormat.QR_CODE, 600, 600);

        Path caminho = FileSystems.getDefault().getPath("qrcode.png");
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", caminho);

    }
}
