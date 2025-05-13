import java.sql.*;

public class TestDBCRUD {
    public static void main(String[] args) {
        DBCRUD crud = new DBCRUD();

        try {
            System.out.println("--- Tutti i contatti ---");
            crud.getContacts().forEach(System.out::println);

            System.out.println("\n--- Inserimento nuovo contatto ---");
            crud.insert(new Contact("Ada Lovelace", "5550000", "1, Algorithm St"));

            System.out.println("\n--- Tutti i contatti dopo inserimento ---");
            crud.getContacts().forEach(System.out::println);

            System.out.println("\n--- Aggiornamento contatto ---");
            crud.update(new Contact("Ada Lovelace", "9999999", "9, Updated Blvd"));

            System.out.println("\n--- Ricerca per telefono ---");
            System.out.println(crud.findByPhone("9999999"));

            System.out.println("\n--- Ricerca per indirizzo ---");
            System.out.println(crud.findByAddress("9, Updated Blvd"));

            System.out.println("\n--- Cancellazione contatto ---");
            crud.delete("Ada Lovelace");

            System.out.println("\n--- Tutti i contatti dopo cancellazione ---");
            crud.getContacts().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
