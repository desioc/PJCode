import java.sql.*;
import java.util.Scanner;

public class AlbumClient2 {
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

            // Recupera e stampa tutti i record
            System.out.println("Stampa dei record prima dell'input:");
            stampaRecord(stmt);

            // Attende input da parte dell'utente
            System.out.println("Premi invio per continuare...");
            scanner.nextLine();

            // Recupera e stampa tutti i record di nuovo
            System.out.println("Stampa dei record dopo l'input:");
            stampaRecord(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void stampaRecord(Statement stmt) throws SQLException {
        try (ResultSet rs = stmt.executeQuery("SELECT * FROM Album")) {
            while (rs.next()) {
                System.out.printf("AlbumId: %d, Title: %s, Artist: %s, Release_Year: %d%n",
                        rs.getInt("AlbumId"), rs.getString("Title"),
                        rs.getString("Artist"), rs.getInt("Release_Year"));
            }
        }
    }
}
