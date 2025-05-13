public class Film {
    String titolo;
    String genere;
    int durata;

    public Film(String titolo, String genere, int durata) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
    }

    public void stampaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Genere: " + genere);
        System.out.println("Durata: " + durata + " minuti");
        System.out.println();
    }
}