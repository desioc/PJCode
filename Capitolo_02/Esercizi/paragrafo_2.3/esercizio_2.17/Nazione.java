public class Nazione {
    public String nome;
    public String capitale;
    public int popolazione;

    public Nazione (String n, String c, int p) {
        nome = n;
        capitale = c;
        popolazione = p;
    }

    void stampaInformazioni() {
        System.out.println("Nazione: " + nome + ", Capitale: " 
            + capitale + ", Popolazione: " + popolazione);
    }
}