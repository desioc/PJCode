import java.sql.*;
import java.util.Scanner;

public class AlbumClient1 {
    private static final String URL = "jdbc:derby:Music";
    private static final String USER = "myUser";
    private static final String PASSWORD = "myPassword";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             Scanner scanner = new Scanner(System.in)) {

            // Imposta il livello di isolamento per permettere le dirty read
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            conn.setAutoCommit(false);

            // Aggiorna un record
            System.out.println("Aggiorno un record...");
            stmt.executeUpdate("UPDATE Album SET Title = 'Dirty Read Example' WHERE AlbumId = 1");
            System.out.println("Record aggiornato. Attendo input per eseguire il rollback...");

            // Attende input da parte dell'utente
            scanner.nextLine();

            // Esegue il rollback
            conn.rollback();
            System.out.println("Rollback eseguito. Il record è tornato allo stato originale.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
