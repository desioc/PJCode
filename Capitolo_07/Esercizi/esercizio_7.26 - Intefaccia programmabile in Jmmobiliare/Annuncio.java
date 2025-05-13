// classe Annuncio.java
package com.jmmobiliare.dati;

import java.time.LocalDateTime;

public final class Annuncio implements Programmabile {
    private final Immobile immobile;
    private final double prezzo;
    private LocalDateTime dataProgrammata;

    public Annuncio(Immobile immobile, double prezzo) {
        if (immobile == null || prezzo < 0) {
            throw new IllegalArgumentException("Immobile non può essere null e il prezzo deve essere positivo.");
        }
        this.immobile = immobile;
        this.prezzo = prezzo;
    }

    public Immobile getImmobile() {
        return immobile;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public LocalDateTime getDataProgrammata() {
        return dataProgrammata;
    }

    @Override
    public void programma(LocalDateTime dataOra) {
        this.dataProgrammata = dataOra;
    }

    @Override
    public String toString() {
        return """
            Annuncio {
                immobile = %s,
                prezzo = %.2f,
                data programmata = %s
            }
            """.formatted(immobile.getIndirizzo(), prezzo, 
                dataProgrammata != null ? dataProgrammata.toString() : "non programmato");
    }
}
