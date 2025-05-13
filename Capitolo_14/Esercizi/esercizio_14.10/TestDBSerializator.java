import java. sql.*;

public class TestDBSerializator implements DBExplorer, DBSerializator {

    public static void main(String[] args) {
        TestDBSerializator app = new TestDBSerializator();

        try {
            System.out.println("--- Tutti i contatti iniziali ---");
            app.getContacts().forEach(System.out::println);

            Contact nuovo = new Contact("Ada Lovelace", "000123", "Via Matematica 42");
            System.out.println("\n--- Inserisco: " + nuovo + " ---");
            app.insert(nuovo);

            System.out.println("\n--- Tutti i contatti dopo insert ---");
            app.getContacts().forEach(System.out::println);

            Contact aggiornato = new Contact("Ada Lovelace", "999999", "Piazza delle programmatrici, 5");
            System.out.println("\n--- Aggiorno: " + aggiornato + " ---");
            app.update(aggiornato);

            System.out.println("\n--- Tutti i contatti dopo update ---");
            app.getContacts().forEach(System.out::println);

            System.out.println("\n--- Cancello: Ada Lovelace ---");
            app.delete("Ada Lovelace");

            System.out.println("\n--- Tutti i contatti dopo delete ---");
            app.getContacts().forEach(System.out::println);

        } catch (SQLException e) {
            System.err.println("Errore durante le operazioni sul database.");
            e.printStackTrace();
        }
    }
}
