import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.net.SocketTimeoutException;

public class PingServer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'indirizzo del server: ");
        String serverAddress = scanner.nextLine();

        System.out.println("Inserisci la porta: ");
        int port = scanner.nextInt();

        int timeout = 5000; // Timeout in millisecondi (5 secondi)
        System.out.println("Timeout di connessione impostato a " + timeout + " ms.");

        System.out.println("Tentativo di connessione...");
        long startTime = System.currentTimeMillis();

        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(serverAddress, port), timeout);
            long endTime = System.currentTimeMillis();
            System.out.println("Connessione stabilita in " + (endTime - startTime) + " ms.");
        } catch (SocketTimeoutException e) {
            System.out.println("Connessione scaduta: il server non ha risposto entro " + timeout + " ms.");
        } catch (UnknownHostException e) {
            System.out.println("Indirizzo sconosciuto: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Impossibile raggiungere il server: " + e.getMessage());
        }

        scanner.close();
    }
}