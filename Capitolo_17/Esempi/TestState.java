// interfaccia Stato
interface Stato {
    void inserisciMoneta();
    void selezionaProdotto();
    void erogaProdotto();
}

// implementazioni di Stato

// stato senza moneta
class StatoSenzaMoneta implements Stato {
    private Distributore distributore;

    public StatoSenzaMoneta(Distributore distributore) {
        this.distributore = distributore;
    }

    public void inserisciMoneta() {
        System.out.println("Moneta inserita.");
        distributore.setStato(distributore.getStatoConMoneta());
    }

    public void selezionaProdotto() {
        System.out.println("Inserisci prima una moneta.");
    }

    public void erogaProdotto() {
        System.out.println("Devi selezionare un prodotto.");
    }
}

// stato con moneta
public class StatoConMoneta implements Stato {
    private Distributore distributore;

    public StatoConMoneta(Distributore distributore) {
        this.distributore = distributore;
    }

    public void inserisciMoneta() {
        System.out.println("Hai già inserito una moneta.");
    }

    public void selezionaProdotto() {
        System.out.println("Prodotto selezionato.");
        distributore.setStato(distributore.getStatoErogazione());
    }

    public void erogaProdotto() {
        System.out.println("Devi prima selezionare un prodotto.");
    }
}

// stato di erogazione
class StatoErogazione implements Stato {
    private Distributore distributore;

    public StatoErogazione(Distributore distributore) {
        this.distributore = distributore;
    }

    public void inserisciMoneta() {
        System.out.println("Attendere il completamento della transazione.");
    }

    public void selezionaProdotto() {
        System.out.println("Stiamo già erogando il prodotto.");
    }

    public void erogaProdotto() {
        System.out.println("Prodotto erogato.");
        distributore.setStato(distributore.getStatoSenzaMoneta());
    }
}

// classe Context
class Distributore {
    private Stato statoSenzaMoneta;
    private Stato statoConMoneta;
    private Stato statoErogazione;

    private Stato statoCorrente;

    public Distributore() {
        statoSenzaMoneta = new StatoSenzaMoneta(this);
        statoConMoneta = new StatoConMoneta(this);
        statoErogazione = new StatoErogazione(this);

        statoCorrente = statoSenzaMoneta; // stato iniziale
    }

    public void setStato(Stato stato) {
        this.statoCorrente = stato;
    }

    public Stato getStatoSenzaMoneta() {
        return statoSenzaMoneta;
    }

    public Stato getStatoConMoneta() {
        return statoConMoneta;
    }

    public Stato getStatoErogazione() {
        return statoErogazione;
    }

    // Metodi delegati allo stato corrente
    public void inserisciMoneta() {
        statoCorrente.inserisciMoneta();
    }

    public void selezionaProdotto() {
        statoCorrente.selezionaProdotto();
    }

    public void erogaProdotto() {
        statoCorrente.erogaProdotto();
    }
}
// metodo main
void main() {
    Distributore distributore = new Distributore();

    distributore.inserisciMoneta();
    distributore.selezionaProdotto();
    distributore.erogaProdotto();
}