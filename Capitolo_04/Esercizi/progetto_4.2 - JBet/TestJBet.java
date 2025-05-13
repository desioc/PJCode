import java.util.*;

public class TestJBet {
    public static void main(String args[]) {
        Campionato campionato = creaCampionato();
        Partita partita = campionato.getPartite().get(0);
        Scommessa scommessa = new Scommessa(
            partita, new Puntata(partita.quote().sq1(), 1.0));
        JBet.gioca(scommessa);
    }

    public static Campionato creaCampionato() {
        var campionato = new Campionato();
        campionato.getPartite().add(creaPartita("Toho" , "S. Francis"));
        campionato.getPartite().add(creaPartita("Muppet" , "New Team"));
        return campionato;
    }

    public static Partita creaPartita(String squadra1, String squadra2) {
        var quota1 = new Quota(Risultato.SQUADRA1, 1.2);
        var quotaX = new Quota(Risultato.PAREGGIO, 2.5);
        var quota2 = new Quota(Risultato.SQUADRA2, 2.1);
        var quote = new Quote(quota1, quotaX, quota2);
        return new Partita(squadra1, squadra2, quote);
    }

}