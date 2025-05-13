import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.*;

public class ScaricaPaginaWeb {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Specificare la pagina web da scaricare");
            return;
        }

        String url = args[0];

        // Aggiunge https:// se manca
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create(url))
                                         .build();

        try {
            HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

            // Rimozione "https://www." o "http://www." per il nome del file
            String nomeFile = url.replaceFirst("https?://(www\\.)?", "")
                                 .replaceAll("[^a-zA-Z0-9\\.\\-]", "_") + ".html";

            Files.writeString(Paths.get(nomeFile), response.body());
            System.out.println("Contenuto salvato in: " + nomeFile);

        } catch (IOException | InterruptedException e) {
            System.err.println("Errore durante il download: " + e.getMessage());
        }
    }
}
