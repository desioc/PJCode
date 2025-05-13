import java.io.*;
import java.util.zip.*;

public class UnzipCassaforti {
    public static void main(String[] args) {
        File outputDir = new File("dezipped");
        if (!outputDir.exists()) outputDir.mkdir();

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("cassaforti.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File outFile = new File(outputDir, entry.getName());
                try (FileOutputStream fos = new FileOutputStream(outFile)) {
                    zis.transferTo(fos);
                }
                zis.closeEntry();
            }
            System.out.println("File decompressi nella cartella 'dezipped'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
