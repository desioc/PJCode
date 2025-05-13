import java.io.*;
import java.util.zip.*;

public class ZipCassaforti {
    public static void main(String[] args) {
        String[] files = { "Cassaforte.base64", "CassaforteSer.ser", "CassaforteExt.ser" };

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("cassaforti.zip"))) {
            for (String file : files) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    zos.putNextEntry(new ZipEntry(file));
                    fis.transferTo(zos);
                    zos.closeEntry();
                }
            }
            System.out.println("File zippati con successo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
