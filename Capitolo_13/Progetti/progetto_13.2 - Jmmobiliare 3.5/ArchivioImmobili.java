package com.jmmobiliare.archivio;

import com.jmmobiliare.dati.Immobile;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivioImmobili {
    private static final Path DIR = Paths.get("immobili");

    // carica tutti gli immobili serializzati dalla cartella
    public static List<Immobile> caricaImmobili() {
        List<Immobile> lista = new ArrayList<>();
        if (!Files.exists(DIR)) {
            return lista;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(DIR, "*.ser")) {
            for (Path file : stream) {
                try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(file))) {
                    Object obj = in.readObject();
                    if (obj instanceof Immobile immobile) {
                        lista.add(immobile);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("Errore nel caricamento di " + file.getFileName() + ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nell'accesso alla cartella immobili: " + e.getMessage());
        }

        return lista;
    }

    // salva un immobile in un file con nome basato sull'hashCode
    public static void salvaImmobile(Immobile immobile) {
        try {
            Files.createDirectories(DIR);
            Path file = DIR.resolve("immobile_" + immobile.hashCode() + ".ser");
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(file))) {
                out.writeObject(immobile);
            }
        } catch (IOException e) {
            System.err.println("Errore nel salvataggio dell'immobile: " + e.getMessage());
        }
    }

    // elimina l'immobile in base al suo hashCode
    public static void eliminaImmobile(Immobile immobile) {
        Path file = DIR.resolve("immobile_" + immobile.hashCode() + ".ser");
        try {
            Files.deleteIfExists(file);
        } catch (IOException e) {
            System.err.println("Errore nell'eliminazione dell'immobile: " + e.getMessage());
        }
    }
}
