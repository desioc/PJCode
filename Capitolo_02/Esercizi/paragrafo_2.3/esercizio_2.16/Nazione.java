public class Nazione {
    public String nome;
    public String capitale;
    public int popolazione;

    public Nazione () {

    }

    void stampaInformazioni() {
        System.out.println("Nazione: " + nome + ", Capitale: " 
            + capitale + ", Popolazione: " + popolazione);
    }
}