package com.jgarage.business;

import com.jgarage.exception.PostoNonDisponibileException;
import com.jgarage.model.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Garage {

    private static final Map<Dimensione, Integer> capacitaMassimaAuto = Map.of(
            Dimensione.PICCOLA, 5,
            Dimensione.MEDIA, 5,
            Dimensione.GRANDE, 5
    );

    private static final int CAPACITA_MAX_MOTO = 5;

    // salva oggetto su file
    private void salva(Motorizzato veicolo) {
        Path dir = Path.of("dati", tipoCartella(veicolo));
        try {
            Files.createDirectories(dir);
            Path file = dir.resolve(veicolo.targa() + ".ser");
            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))) {
                oos.writeObject(veicolo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Errore durante la serializzazione", e);
        }
    }

    // costruisce nome cartella in base al tipo e alla dimensione
    private String tipoCartella(Motorizzato veicolo) {
        if (veicolo instanceof Moto) return "MOTO";
        if (veicolo instanceof Auto auto) return "AUTO_" + auto.dimensione();
        throw new IllegalArgumentException("Tipo non gestito");
    }

    // conta i file nella cartella
    private long contaPostiOccupati(String tipoCartella) {
        Path dir = Path.of("dati", tipoCartella);
        try {
            if (!Files.exists(dir)) return 0;
            try (var files = Files.list(dir)) {
                return files.count();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void permettiAccesso(Motorizzato veicolo) {
        String cartella = tipoCartella(veicolo);
        long occupati = contaPostiOccupati(cartella);

        if (veicolo instanceof Moto && occupati >= CAPACITA_MAX_MOTO)
            throw new PostoNonDisponibileException("Posti per moto esauriti");
        if (veicolo instanceof Auto auto && occupati >= capacitaMassimaAuto.get(auto.dimensione()))
            throw new PostoNonDisponibileException("Posti per auto " + auto.dimensione() + " esauriti");

        salva(veicolo);
    }

    // restituisce lista di tutte le auto di una certa dimensione
    public List<Auto> getAuto(Dimensione d) {
        Path dir = Path.of("dati", "AUTO_" + d);
        return leggiVeicoli(dir).stream()
                .filter(Auto.class::isInstance)
                .map(Auto.class::cast)
                .collect(Collectors.toList());
    }

    // restituisce lista di tutte le moto
    public List<Moto> getMoto() {
        Path dir = Path.of("dati", "MOTO");
        return leggiVeicoli(dir).stream()
                .filter(Moto.class::isInstance)
                .map(Moto.class::cast)
                .collect(Collectors.toList());
    }

    // metodo ausiliario che legge tutti i file serializzati in una directory
    private List<Motorizzato> leggiVeicoli(Path dir) {
        if (!Files.exists(dir)) return List.of();
        try (var stream = Files.list(dir)) {
            return stream.map(this::leggiOggetto)
                         .filter(Objects::nonNull)
                         .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // legge un oggetto da file
    private Motorizzato leggiOggetto(Path file) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))) {
            return (Motorizzato) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    public int numeroVeicoliParcheggiati() {
        return Stream.of(Dimensione.values())
                .mapToInt(d -> getAuto(d).size())
                .sum() + getMoto().size();
    }

    // nuovo metodo ricerca con lettura da file serializzati
    public List<Motorizzato> ricerca(Predicate<Motorizzato> filtro) {
        List<Motorizzato> risultati = new ArrayList<>();
        for (Dimensione d : Dimensione.values()) {
            risultati.addAll(getAuto(d).stream().filter(filtro).toList());
        }
        risultati.addAll(getMoto().stream().filter(filtro).toList());
        return risultati;
    }
}
