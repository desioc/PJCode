public class Cliente {
    public final String nome;
    public Cliente(String n) {
        nome = n;
    }
    // omessi altri campi, costruttori e metodi personalizzati
    public void ingaggia(Insegnante insegnante) {
        insegnante.insegna();
    }
}