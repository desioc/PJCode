import java.io.*;
import java.net.*;

public class ClientBenvenuto {
    public static void main(String[] args) {
        String host = "localhost"; // o IP del server
        int porta = 12345;

        try (Socket socket = new Socket(host, porta);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()))) {

            String messaggio = in.readLine();
            System.out.println("Messaggio ricevuto dal server: " + messaggio);

        } catch (IOException e) {
            System.err.println("Errore nel client: " + e.getMessage());
        }
    }
}