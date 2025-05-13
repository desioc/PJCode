import java.io.IOException;
import java.nio.file.*;

public class CopiaConNio2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Specificare file sorgente e file di destinazione");
            return;
        }
        Path origine = Paths.get(args[0]);
        Path destinazione = Paths.get(args[1]);

        try {
            Files.copy(
                origine,
                destinazione,
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            );
            System.out.println("Copia completata con successo.");
        } catch (IOException e) {
            System.err.println("Errore durante la copia: " + e.getMessage());
        }
    }
}