public class Piatto  {
    private int codice;
    private String nome;
    private double prezzo;

    public Piatto(int codice, String nome, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return codice + ". " + nome + " - " + prezzo + " €";
    }
}