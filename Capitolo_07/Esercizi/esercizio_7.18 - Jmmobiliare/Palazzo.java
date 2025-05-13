// classe Palazzo che implementa Immobile e contiene una collezione di appartamenti
package com.jmmobiliare.dati;
import java.util.List;

public final class Palazzo implements Immobile {
    private List<Appartamento> appartamenti;
    private String indirizzo;

    public Palazzo(List<Appartamento> appartamenti) {
        if (appartamenti == null || appartamenti.isEmpty()) {
            throw new IllegalArgumentException("Un palazzo deve contenere almeno un appartamento.");
        }

        String indirizzoComune = appartamenti.get(0).getIndirizzo();

        for (Appartamento app : appartamenti) {
            if (!indirizzoComune.equals(app.getIndirizzo())) {
                throw new IllegalArgumentException("Tutti gli appartamenti devono avere lo stesso indirizzo.");
            }
        }

        this.appartamenti = appartamenti;
        this.indirizzo = indirizzoComune;
    }


    @Override
    public int getMetriQuadri() {
        int somma = 0;
        for (int i = 0; i < appartamenti.size(); i++) {
            somma += appartamenti.get(i).getMetriQuadri();
        }
        return somma;
    }

    @Override
    public String getIndirizzo() {
        return indirizzo;
    }

    @Override
    public String toString() {
        return """
           Palazzo {
               indirizzo = '%s',
               appartamenti = %d,
               metri quadri totali = %d
           }
           """ .formatted(indirizzo, appartamenti.size(), getMetriQuadri());
    }
}