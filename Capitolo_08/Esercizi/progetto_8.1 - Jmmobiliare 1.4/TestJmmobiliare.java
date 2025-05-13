// classe di test TestJmmobiliare.java
package com.jmmobiliare;

import com.jmmobiliare.dati.*;

import java.util.List;

public class TestJmmobiliare {
    public static void main(String[] args) {

        Jmmobiliare j = new Jmmobiliare();

        var appartamento = new Appartamento(60, "Via Roma 10", 2);
        var garage = new Garage(25, "Via Napoli 12", 2);
        var appartamenti = List.of(
            new Appartamento(50, "Via Torino 1", 1),
            new Appartamento(70, "Via Torino 1", 2)
        );
        var palazzo = new Palazzo(appartamenti);

        j.inserisciImmobile(appartamento);
        j.inserisciImmobile(garage);
        j.inserisciImmobile(palazzo);
    }
}