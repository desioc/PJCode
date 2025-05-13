public class Nuotatore implements Insegnante {  	// implementa l’interfaccia
    public final String nome;
    public Nuotatore(String n) {
        nome = n;
    }
    String premiVinti;
    String abilitazione;
    // omessi altri campi, metodi e costruttori personalizzati
    @Override 
    public void insegna() {	// ereditato astratto e ridefinito 
        // omessa implementazione personalizzata del metodo 
    }
}