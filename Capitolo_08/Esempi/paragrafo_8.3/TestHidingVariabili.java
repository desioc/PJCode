class Veicolo {
    public final String INFO = "Classe Veicolo";
    // resto del codice omesso
}
class Aereo extends Veicolo {
    public final String INFO = "Classe Aereo";
    // resto del codice omesso
}


public class TestHidingVariabili {
    public static void main(String args[]) {
        Veicolo veicolo = new Aereo();
        Veicolo aereo = new Aereo();
        System.out.println(veicolo.INFO); // stampa Interfaccia Veicolo
        System.out.println(aereo.INFO); // stampa Interfaccia Veicolo
    }
}
