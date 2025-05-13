import java.sql.*;

public class TransactionManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:..\\..\\..\\lib\\Music")) {
            conn.setAutoCommit(false); // disabilita l'auto-commit
            try (Statement stmt = conn.createStatement()) {
                // inserimento di un nuovo album
                stmt.executeUpdate("""
                    INSERT INTO Album (AlbumId, Title, Artist, Release_Year)
                    VALUES (50, 'Hybrid Theory', 'Linkin Park', 2000)
                """);

                // aggiornamento di un album esistente
                stmt.executeUpdate("""
                    UPDATE Album SET Release_Year = 1978
                    WHERE AlbumId = 20
                """);

                // simulazione di errore: duplicazione chiave primaria
                stmt.executeUpdate("""
                    INSERT INTO Album (AlbumId, Title, Artist, Release_Year)
                    VALUES (50, 'Duplicate Album', 'Unknown', 2024)
                """);

                // se tutto va bene, conferma le modifiche
                conn.commit();
                System.out.println("Transazione completata con successo.");
            } catch (SQLException e) {
                System.err.println("Errore durante la transazione, rollback in corso...");
                conn.rollback();
                System.err.println("Rollback eseguito.");
                e.printStackTrace();
            } finally {
                conn.setAutoCommit(true);
            }

            // verifica dei risultati finali
            System.out.println("Contenuto corrente della tabella Album (AlbumId ≥ 50):");
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM Album WHERE AlbumId >= 50")) {
                while (rs.next()) {
                    System.out.printf("%d: %s - %s (%d)%n",
                        rs.getInt("AlbumId"),
                        rs.getString("Title"),
                        rs.getString("Artist"),
                        rs.getInt("Release_Year"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
