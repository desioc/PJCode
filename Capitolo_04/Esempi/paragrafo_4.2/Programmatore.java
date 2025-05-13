public class Programmatore implements Insegnante {	// implementa l’interfaccia
    public final String nome;
    public Programmatore(String n) {
        nome = n;
    }
    public int anniDiEsperienza;
    public String[] certificazioni;
    // omessi altri campi, metodi e costruttori personalizzati
    @Override 
    public void insegna() {	// ereditato astratto e ridefinito 
        // omessa implementazione personalizzata del metodo 
    }
}
