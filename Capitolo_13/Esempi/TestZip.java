import java.io.*;
import java.util.zip.*;

public class TestZip {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        if (args.length != 0) {
            sourceFile = args[0];
        }
        String zipFile = "archive.zip" ;
        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(sourceFile)) {
            // creaiamo una nuova entry ZIP per il file sorgente 
            zos.putNextEntry(new ZipEntry(sourceFile)); 
            // usiamo transferTo per trasferire direttamente i dati 
            fis.transferTo(zos); 
            // chiudiamo l'entry corrente zos.closeEntry(); 
            System.out.println("File compresso in: " + zipFile);         
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
