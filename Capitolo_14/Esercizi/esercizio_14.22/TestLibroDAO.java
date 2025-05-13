// classe di test
import java.util.Optional;

public class TestLibroDAO {
    public static void main(String[] args) {
        DAO<Libro> dao = new LibroDAO();

        System.out.println("Elenco iniziale:");
        dao.selectAll().forEach(System.out::println);

        System.out.println("\nInserimento di un nuovo libro...");
        Libro nuovo = new Libro(100, "Sostiene Pereira", "Antonio Tabucchi", 1993);
        try {
            dao.insert(nuovo);
        } catch (DuplicateKeyException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        System.out.println("\nDopo inserimento:");
        dao.selectAll().forEach(System.out::println);

        System.out.println("\nAggiornamento del libro...");
        Libro aggiornato = new Libro(100, "Sostiene Pereira", "Antonio Tabucchi", 1994);
        try {
            dao.update(aggiornato);
        } catch (RecordNotFoundException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        System.out.println("\nDopo aggiornamento:");
        dao.selectAll().forEach(System.out::println);

        System.out.println("\nEliminazione del libro...");
        try {
            dao.delete(aggiornato);
        } catch (RecordNotFoundException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        System.out.println("\nDopo eliminazione:");
        dao.selectAll().forEach(System.out::println);
    }
}
