public class TestLettura {
    public static void main(String[] args) {
        // Creazione di due oggetti di tipo Libro
        Libro libro1 = new Libro("Il conte di Montecristo", "Alexandre Dumas", 14.25);
        Libro libro2 = new Libro("I miserabili", "Victor hugo", 18.05);

        // Creazione di un oggetto di tipo Lettore
        Lettore lettore = new Lettore("Freddie");

        // Il lettore legge il primo libro
        lettore.leggi(libro1);

        // Il lettore legge il secondo libro
        lettore.leggi(libro2);
    }
}