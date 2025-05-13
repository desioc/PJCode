import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class TestDipendenteDAO {
    public static void main(String[] args) {
        DAO<Dipendente> dao = new DipendenteDAO();

        // recupero iniziale
        System.out.println("Dipendenti iniziali:");
        dao.selectAll().forEach(System.out::println);

        // inserimento
        Dipendente nuovo = new Dipendente(6, "Danny", "Carey", "HR", 32000.0, LocalDate.of(2025, 5, 10));
        dao.insert(nuovo);
        System.out.println("Inserito nuovo dipendente:");
        dao.selectAll().forEach(System.out::println);

        // aggiornamento
        Dipendente aggiornato = new Dipendente(6, "Danny", "Carey", "Formazione", 35000.0, LocalDate.of(2025, 5, 10));
        dao.update(aggiornato);
        System.out.println("Dipendente aggiornato:");
        dao.selectAll().forEach(System.out::println);

        // eliminazione
        dao.delete(aggiornato);
        System.out.println("Dipendente eliminato:");
        dao.selectAll().forEach(System.out::println);
    }
}
