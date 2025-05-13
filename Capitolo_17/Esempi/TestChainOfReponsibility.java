// handler astratto
abstract class SupportoHandler {
    protected SupportoHandler prossimo;

    public void setProssimo(SupportoHandler prossimo) {
        this.prossimo = prossimo;
    }

    public abstract void gestisciRichiesta(String richiesta);
}

// handler concreti
class OperatoreBase extends SupportoHandler {
    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equalsIgnoreCase("problema semplice")) {
            System.out.println("Operatore base ha gestito la richiesta.");
        } else if (prossimo != null) {
            prossimo.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Nessun handler disponibile per la richiesta.");
        }
    }
}

class OperatoreAvanzato extends SupportoHandler {
    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equalsIgnoreCase("problema complesso")) {
            System.out.println("Operatore avanzato ha gestito la richiesta.");
        } else if (prossimo != null) {
            prossimo.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Nessun handler disponibile per la richiesta.");
        }
    }
}

class Supervisore extends SupportoHandler {
    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equalsIgnoreCase("problema critico")) {
            System.out.println("Supervisore ha gestito la richiesta.");
        } else if (prossimo != null) {
            prossimo.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Nessun handler disponibile per la richiesta.");
        }
    }
}

// classe client
class CentroAssistenza {
    public void gestisciAssistenza() {
        SupportoHandler operatoreBase = new OperatoreBase();
        SupportoHandler operatoreAvanzato = new OperatoreAvanzato();
        SupportoHandler supervisore = new Supervisore();

        operatoreBase.setProssimo(operatoreAvanzato);
        operatoreAvanzato.setProssimo(supervisore);

        operatoreBase.gestisciRichiesta("problema semplice");
        operatoreBase.gestisciRichiesta("problema complesso");
        operatoreBase.gestisciRichiesta("problema critico");
        operatoreBase.gestisciRichiesta("problema ignoto");
    }
}

// classe del main
public class TestChainOfReponsibility {
    public static void main(String args[]) {
        new CentroAssistenza().gestisciAssistenza();
    }
}