package com.remotelogger.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RemoteLoggerClient {
    public static void main(String[] args) {
        // scanner per leggere da tastiera
        Scanner scanner = new Scanner(System.in);

        // indirizzo e porta del server
        String serverAddress = "localhost";
        int port = 12345;

        // stampa delle istruzioni
        System.out.println("==== RemoteLoggerClient ====");
        System.out.println("Scrivi un messaggio da inviare al server.");
        System.out.println("Digita 'demo' per inviare una sequenza automatica di messaggi.");
        System.out.println("Digita 'fine' per chiudere la connessione.");
        System.out.println("=============================");

        // prova a connettersi al server
        try (Socket socket = new Socket(serverAddress, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String input;
            // legge righe da tastiera e le invia al server
            while (true) {
                System.out.print("> ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("fine")) {
                    break;
                } else if (input.equalsIgnoreCase("demo")) {
                    // invia una serie predefinita di messaggi
                    out.println("Log automatico #1");
                    out.println("Log automatico #2");
                    out.println("Log automatico #3");
                    out.println("ATTACCO HACKER");
                    out.println("Log automatico #4 dopo attacco");
                    System.out.println("[Messaggi demo inviati]");
                } else {
                    // invia il messaggio inserito manualmente
                    out.println(input);
                }
            }

            System.out.println("Connessione chiusa.");
        } catch (IOException e) {
            System.err.println("Errore di connessione al server: " + e.getMessage());
        }
    }
}