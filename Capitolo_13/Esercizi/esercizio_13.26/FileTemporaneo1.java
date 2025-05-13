import java.io.IOException;
import java.nio.file.*;

public class FileTemporaneo1 {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("temp_", ".txt");
            System.out.println("File temporaneo creato: " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Errore nella creazione del file temporaneo: " + e.getMessage());
        }
    }
}
