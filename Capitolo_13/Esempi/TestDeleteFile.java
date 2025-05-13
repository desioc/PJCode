import java.nio.file.*;
import java.io.IOException;

public class TestDeleteFile {
    public static void main(String[] args) {
        Path fileToDelete = Paths.get("fileToDelete.txt");

        try {
            // Creazione di un file di esempio
            Files.createFile(fileToDelete);
            System.out.println("File creato: " + fileToDelete);

            // Eliminazione del file usando delete
            Files.delete(fileToDelete);
            System.out.println("File eliminato con successo usando delete.");
        } catch (NoSuchFileException e) {
            System.err.println("Il file specificato non esiste: " + e.getMessage());
        } catch (DirectoryNotEmptyException e) {
            System.err.println("La directory specificata non è vuota: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Errore durante l'eliminazione del file: " + e.getMessage());
        }

        try {
            // Eliminazione di un file che potrebbe non esistere usando deleteIfExists
            boolean isDeleted = Files.deleteIfExists(fileToDelete);
            if (isDeleted) {
                System.out.println("File eliminato con successo usando deleteIfExists.");
            } else {
                System.out.println("Il file non esiste, nessuna azione necessaria.");
            }
        } catch (IOException e) {
            System.err.println("Errore durante l'eliminazione del file: " + e.getMessage());
        }
    }
}
