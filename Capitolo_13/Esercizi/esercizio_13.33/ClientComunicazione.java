import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientComunicazione {
    public static void main(String[] args) {
        String host = "localhost";
        int porta = 12345;

        try (Socket socket = new Socket(host, porta);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            // riceve messaggio iniziale dal server
            String benvenuto = in.readLine();
            System.out.println("Server: " + benvenuto);

            // invia messaggio al server
            System.out.print("Scrivi un messaggio da inviare al server: ");
            String messaggio = scanner.nextLine();
            out.println(messaggio);

            // riceve risposta
            String risposta = in.readLine();
            System.out.println("Risposta Server: " + risposta);

        } catch (IOException e) {
            System.err.println("Errore nel client: " + e.getMessage());
        }
    }
}
