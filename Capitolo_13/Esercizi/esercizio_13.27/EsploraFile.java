import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class EsploraFile {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        // 1. Scrittura nel file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Questo è un esempio di testo.");
            writer.newLine();
            writer.write("Seconda riga di esempio.");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura: " + e.getMessage());
        }

        // 2. Verifica permessi
        System.out.println("Il file è leggibile?   " + Files.isReadable(path));
        System.out.println("Il file è scrivibile?  " + Files.isWritable(path));
        System.out.println("Il file è eseguibile?  " + Files.isExecutable(path));

        // 3. Lettura del contenuto se leggibile
        if (Files.isReadable(path)) {
            try {
                List<String> righe = Files.readAllLines(path);
                System.out.println("\nContenuto del file:");
                righe.forEach(System.out::println);
            } catch (IOException e) {
                System.err.println("Errore durante la lettura: " + e.getMessage());
            }
        } else {
            System.out.println("Il file non è leggibile.");
        }
    }
}
