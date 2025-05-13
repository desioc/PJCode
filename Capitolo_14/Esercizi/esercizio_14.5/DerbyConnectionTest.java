import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnectionTest {

    public static void main(String[] args) {
        // definizione della stringa di connessione (schema "Library")
        String url = "jdbc:derby:Library;create=true";

        try (
            // apertura della connessione al database
            Connection conn = DriverManager.getConnection(url)
        ) {
            // stampa messaggio di successo se la connessione va a buon fine
            System.out.println("Connessione al database 'Library' riuscita.");
        } catch (SQLException e) {
            // gestione dell'eccezione in caso di errore
            System.err.println("Errore durante la connessione al database:");
            e.printStackTrace();
        }
    }
}