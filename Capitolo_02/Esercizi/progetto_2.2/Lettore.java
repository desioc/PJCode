public class Lettore {
    public String nome;

    public Lettore(String nome) {
        this.nome = nome;
    }

    public void leggi(Libro libro) {
        System.out.println(nome + " sta leggendo:");
        System.out.println("Titolo: " + libro.titolo);
        System.out.println("Autore: " + libro.autore);
        System.out.println("Prezzo: " + libro.prezzo);
    }
}