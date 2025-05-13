public class TestCliente {
    public static void main(String args[]) {
        Cliente cliente = new Cliente("Maura");
        Insegnante manager = new Manager("Diego");
        Insegnante programmatore = new Programmatore("Camilla");
        cliente.ingaggia(manager);
        cliente.ingaggia(programmatore);
    }
}

class Manager implements Insegnante {
    public final String nome;
    public Manager(String n) {
        nome = n;
    }
    // omessi altri campi, costruttori e metodi personalizzati
    @Override 
    public void insegna() {	// ereditato astratto e ridefinito 
        // omessa implementazione personalizzata del metodo 
    }
}