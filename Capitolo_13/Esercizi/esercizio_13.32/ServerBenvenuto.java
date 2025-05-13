import java.io.*;
import java.net.*;

public class ServerBenvenuto {
    public static void main(String[] args) {
        int porta = 12345;

        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Server in ascolto sulla porta " + porta);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                InetAddress indirizzoClient = clientSocket.getInetAddress();
                System.out.println("Connessione da " + indirizzoClient);

                try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                    out.println("Benvenuto, client " + indirizzoClient.getHostAddress());
                }

                clientSocket.close();
            }

        } catch (IOException e) {
            System.err.println("Errore nel server: " + e.getMessage());
        }
    }
}
