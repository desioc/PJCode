import java.util.Random;

public class JBet {
    public static void gioca(Scommessa scommessa) {
        Random random = new Random();
        int esito = random.nextInt(3);
        Risultato risultato = Risultato.values()[esito];
        double vincita = calcolaVincita(scommessa, risultato);
        System.out.println("Hai puntato " + scommessa.puntata().puntata() + " € su " + scommessa.puntata().quota().risultato());
        System.out.println("Risultato finale: " + risultato);
        System.out.printf("Vincita: %.2f €\n " , vincita);
    }

    public static double calcolaVincita(Scommessa scommessa, Risultato risultato) {
        if (scommessa.puntata().quota().risultato() == risultato) {
            double quota = 0;

            if (risultato == Risultato.SQUADRA1) {
                quota = scommessa.partita().quote().sq1().valore();
            } else if (risultato == Risultato.PAREGGIO) {
                quota = scommessa.partita().quote().pareggio().valore();
            } else if (risultato == Risultato.SQUADRA2) {
                quota = scommessa.partita().quote().sq2().valore();
            }

            return scommessa.puntata().puntata() * quota;
        } else {
            return 0;
        }
    }
}