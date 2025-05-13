import java.io.*;
import java.net.*;

public class ServerComunicazione {
    public static void main(String[] args) {
        int porta = 12345;

        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Server in ascolto sulla porta " + porta);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                         new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(
                         clientSocket.getOutputStream(), true)) {

                    InetAddress indirizzoClient = clientSocket.getInetAddress();
                    System.out.println("Connessione da " + indirizzoClient);

                    // Messaggio iniziale
                    out.println("Benvenuto, client " + indirizzoClient.getHostAddress());

                    // Riceve il messaggio dal client
                    String messaggioRicevuto = in.readLine();
                    System.out.println("Messaggio dal client: " + messaggioRicevuto);

                    // Risponde al client
                    out.println("Messaggio ricevuto: \"" + messaggioRicevuto + "\"");

                } catch (IOException e) {
                    System.err.println("Errore nella comunicazione col client: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Errore nel server: " + e.getMessage());
        }
    }
}
