// Refactoring JBet con pattern matching
package com.jbet.business;
import java.util.Random;

import com.jbet.model.Risultato;
import com.jbet.model.Scommessa;

public class JBet {

    public static void gioca(Scommessa scommessa) {
        Risultato esito = esitoCasuale();
        double vincita = calcolaVincita(scommessa, esito);

        System.out.println("Hai puntato " + scommessa.puntata().puntata() + " € su " + scommessa.puntata().quota().risultato());
        System.out.println("Risultato finale: " + esito);
        System.out.printf("Vincita: %.2f €\n ", vincita);
    }

    public static double calcolaVincita(Scommessa scommessa, Risultato esitoFinale) {
        if (scommessa.puntata().quota().risultato() == esitoFinale) {
            double quota = switch (esitoFinale) {
                case SQUADRA1 -> scommessa.partita().quote().sq1().valore();
                case PAREGGIO -> scommessa.partita().quote().pareggio().valore();
                case SQUADRA2 -> scommessa.partita().quote().sq2().valore();
            };
            return scommessa.puntata().puntata() * quota;
        } else {
            return 0;
        }
    }

    private static Risultato esitoCasuale() {
        int esito = new Random().nextInt(3);
        return Risultato.values()[esito];
    }
}