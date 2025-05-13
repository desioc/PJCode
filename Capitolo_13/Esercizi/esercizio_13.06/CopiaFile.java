import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class CopiaFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Specificare file sorgente e file di destinazione");
            return;
        }
        String sorgente = args[0];
        String destinazione = args[1];

        try (InputStream in = new FileInputStream(sorgente);
            OutputStream out = new FileOutputStream(destinazione)) {
            in.transferTo(out); // da Java 9 in poi
            System.out.println("Copia completata con successo.");
        } catch (IOException e) {
            System.err.println("Errore durante la copia del file: " + e.getMessage());
        }
    }
}