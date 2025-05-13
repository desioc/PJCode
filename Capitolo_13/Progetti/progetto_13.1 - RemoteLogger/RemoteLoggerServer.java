package com.remotelogger.server;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

public class RemoteLoggerServer {
    // porta su cui il server ascolta
    private static final int PORT = 12345;

    // dimensione massima del file di log in byte
    private static final int MAX_SIZE = 100;

    // directory dei log attivi
    private static final Path LOGS_DIR = Paths.get("logs");

    // directory dei log spostati in caso di attacco
    private static final Path SECRET_DIR = Paths.get("secretlogs");

    // riferimento al file di log corrente
    private static AtomicReference<Path> currentLogFile = new AtomicReference<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            // crea le directory logs e secretlogs se non esistono
            Files.createDirectories(LOGS_DIR);
            Files.createDirectories(SECRET_DIR);

            // crea il primo file di log
            currentLogFile.set(createNewLogFile());

            System.out.println("RemoteLoggerServer in ascolto sulla porta " + PORT);

            // ciclo infinito per accettare più client
            while (true) {
                // accetta una nuova connessione
                Socket clientSocket = serverSocket.accept();

                // gestisce ogni client su un thread separato
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // crea un nuovo file di log nella cartella logs
    private static Path createNewLogFile() throws IOException {
        // rimuove i ":" per evitare problemi nei nomi dei file
        String fileName = LocalDateTime.now().toString().replace(":", "-") + ".log";
        Path filePath = LOGS_DIR.resolve(fileName);
        Files.createFile(filePath);
        return filePath;
    }

    // gestisce la comunicazione con un singolo client
    private static void handleClient(Socket socket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String line;
            // legge ogni riga inviata dal client
            while ((line = in.readLine()) != null) {
                System.out.println("Ricevuto: " + line);

                // se rileva attacco hacker, sposta tutti i log
                if (line.equalsIgnoreCase("ATTACCO HACKER")) {
                    moveLogsToSecret();
                    continue;
                }

                // recupera il file di log corrente
                Path logFile = currentLogFile.get();

                // controlla la dimensione del file, crea uno nuovo se necessario
                if (Files.size(logFile) >= MAX_SIZE) {
                    logFile = createNewLogFile();
                    currentLogFile.set(logFile);
                }

                // scrive la stringa nel file (in append)
                try (BufferedWriter writer = Files.newBufferedWriter(logFile, StandardOpenOption.APPEND)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nella gestione del client: " + e.getMessage());
        }
    }

    // sposta tutti i file dalla cartella logs a secretlogs
    private static void moveLogsToSecret() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(LOGS_DIR, "*.log")) {
            for (Path log : stream) {
                Path dest = SECRET_DIR.resolve(log.getFileName());
                Files.move(log, dest, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Spostato: " + log.getFileName() + " in secretlogs/");
            }
            // dopo lo spostamento, crea un nuovo log vuoto
            currentLogFile.set(createNewLogFile());
        } catch (IOException e) {
            System.err.println("Errore nello spostamento dei file: " + e.getMessage());
        }
    }
}
