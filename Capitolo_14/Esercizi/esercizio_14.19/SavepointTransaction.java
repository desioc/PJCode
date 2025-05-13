import java.sql.*;

public class SavepointTransaction {
    public static void main(String[] args) {
        final String URL = "jdbc:derby:..\\..\\..\\lib\\Music";

        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);

            try (Statement stmt = conn.createStatement()) {

                // Operazione DML prima del savepoint
                stmt.executeUpdate("""
                    INSERT INTO Album (AlbumId, Title, Artist, Release_Year)
                    VALUES (200, 'Before Savepoint', 'Test Artist', 2000)
                """);

                // Creazione savepoint
                Savepoint sp = conn.setSavepoint("MY_SAVEPOINT");
                System.out.println("Savepoint creato.");

                // Operazioni DML dopo il savepoint
                stmt.executeUpdate("""
                    INSERT INTO Album (AlbumId, Title, Artist, Release_Year)
                    VALUES (201, 'After Savepoint', 'Test Artist', 2001)
                """);
                stmt.executeUpdate("""
                    INSERT INTO Album (AlbumId, Title, Artist, Release_Year)
                    VALUES (202, 'Another After Savepoint', 'Test Artist', 2002)
                """);

                // Rollback fino al savepoint
                conn.rollback(sp);
                System.out.println("Rollback eseguito fino al savepoint.");

                // Commit delle operazioni precedenti al savepoint
                conn.commit();
                System.out.println("Commit eseguito.");

            } catch (SQLException e) {
                System.err.println("Errore nella transazione.");
                conn.rollback();
                e.printStackTrace();
            } finally {
                conn.setAutoCommit(true);
            }

            // Verifica finale
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(
                     "SELECT * FROM Album WHERE AlbumId >= 200")) {
                System.out.println("Contenuto della tabella dopo la transazione:");
                while (rs.next()) {
                    System.out.printf("%d - %s (%s, %d)%n",
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
