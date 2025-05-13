// classe Palazzo che implementa Immobile e contiene una collezione di appartamenti
package com.jmmobiliare.dati;

import java.util.List;

public final class Palazzo extends Immobile {
    private List<Appartamento> appartamenti;
    private String indirizzo;

    public Palazzo(List<Appartamento> appartamenti) {

        if (appartamenti == null || appartamenti.isEmpty()) {
            throw new IllegalArgumentException("Un palazzo deve contenere almeno un appartamento.");
        }
        super(getPrezzo(appartamenti));
        String indirizzoComune = appartamenti.get(0).getIndirizzo();

        for (Appartamento app : appartamenti) {
            if (!indirizzoComune.equals(app.getIndirizzo())) {
                throw new IllegalArgumentException("Tutti gli appartamenti devono avere lo stesso indirizzo.");
            }
        }

        this.appartamenti = appartamenti;
        this.indirizzo = indirizzoComune;
    }

    private static double getPrezzo(List<Appartamento> appartamenti) {
        return appartamenti.stream()
                           .mapToDouble(Appartamento::getPrezzo)
                           .sum();
    }



    @Override
    public int getMetriQuadri() {
        return appartamenti.stream()
                           .mapToInt(Appartamento::getMetriQuadri)
                           .sum();
    }


    @Override
    public String getIndirizzo() {
        return indirizzo;
    }

    @Override
    public String toString() {
        return ""  "
           Palazzo {
               indirizzo = '%s',
               appartamenti = %d,
               metri quadri totali = %d
               prezzo = %s
           }
           "  "" .formatted(indirizzo, appartamenti.size(), getMetriQuadri(), getPrezzo());
    }
}