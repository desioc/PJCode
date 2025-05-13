import java.util.ArrayList;
import java.util.List;

// interfaccia Observer
interface Osservatore {
    void aggiorna(String stato);
}

// classe Subject (soggetto osservato)
class ServizioMeteo {
    private List<Osservatore> osservatori = new ArrayList<>();
    private String stato;

    public void aggiungiOsservatore(Osservatore o) {
        osservatori.add(o);
    }

    public void rimuoviOsservatore(Osservatore o) {
        osservatori.remove(o);
    }

    public void setStato(String nuovoStato) {
        this.stato = nuovoStato;
        notificaOsservatori();
    }

    private void notificaOsservatori() {
        for (Osservatore o : osservatori) {
            o.aggiorna(stato);
        }
    }
}

// implementazioni di Observer

// display console
public class DisplayConsole implements Osservatore {
    public void aggiorna(String stato) {
        System.out.println("Display Console: nuovo stato -> " + stato);
    }
}

// display mobile
public class DisplayMobile implements Osservatore {
    public void aggiorna(String stato) {
        System.out.println("App Mobile: nuovo stato -> " + stato);
    }
}

// metodo main
void main() {
    ServizioMeteo servizio = new ServizioMeteo();

    Osservatore console = new DisplayConsole();
    Osservatore mobile = new DisplayMobile();

    servizio.aggiungiOsservatore(console);
    servizio.aggiungiOsservatore(mobile);

    servizio.setStato("Sole");
    servizio.setStato("Pioggia");
}