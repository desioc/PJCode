import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class EsploraDirectory {
    public static void main(String[] args) {
        Path directoryCorrente = Paths.get(".");

        try (Stream<Path> stream = Files.list(directoryCorrente)) {
            stream.forEach(path -> {
                if (Files.isDirectory(path)) {
                    System.out.println("[DIR]  " + path.getFileName());
                } else {
                    System.out.println("[FILE] " + path.getFileName());
                }
            });
        } catch (IOException e) {
            System.err.println("Errore durante la lettura della directory: " + e.getMessage());
        }
    }
}
