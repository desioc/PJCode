import java.io.*;
import java.util.zip.*;

public class TestUnZip {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        if (args.length != 0) {
            sourceFile = args[0];
        }
        String zipFile = "archive.zip" ;
        try (FileInputStream fis = new FileInputStream(zipFile);
             ZipInputStream zis = new ZipInputStream(fis)) {
             ZipEntry zipEntry;
             while ((zipEntry = zis.getNextEntry()) != null) { // leggiamo i file nel file ZIP
                 System.out.println("Estrazione del file: " + zipEntry.getName());
                 try (FileOutputStream fos = new FileOutputStream(zipEntry.getName() + ".unzipped")) { // ho aggiunto un sffisso solo per non sovrascrivere un eventuale file
                     zis.transferTo(fos);                      // trasferiamo i dati
                 }
                 zis.closeEntry();                             // chiudiamo l'entry corrente
             }
              System.out.println("File estratto con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}