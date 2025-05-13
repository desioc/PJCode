import java.sql.*;

public class TestTransaction {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music")) {
            conn.setAutoCommit(false); // Disabilita l'auto-commit

            try (Statement stmt = conn.createStatement()) {
                // Inserimento del primo record
                stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) " +
                        "VALUES (31, 'Ella in Berlin: Mack the Knife', 'Ella Fitzgerald', 1960)");
                System.out.println("Before commit:");

                // Visualizzazione di tutti i record presenti
                try (ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
                    while (res.next()) {
                        System.out.printf("%s : %s (%d)%n",
                                res.getString("Artist"),
                                res.getString("Title"),
                                res.getInt("Release_Year"));
                    }
                }

                // Inserimento di altri record
                stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) " +
                        "VALUES (31, 'The Real Thing', 'Faith No More', 1989)"); // Genererà un'eccezione
                stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) " +
                        "VALUES (32, 'Radiohead', 'Ok Computer', 1997)");

                // Commit della transazione
                conn.commit();
                System.out.println("Commit Executed!");
            } catch (SQLException e) {
                System.err.println("Error during transaction. Rolling back.");
                conn.rollback();
                e.printStackTrace();
            } finally {
                // Ripristino dell'auto-commit
                conn.setAutoCommit(true);
            }

            // Visualizzazione finale dei record per verificare lo stato del database
            try (Statement statement = conn.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM Album")) {
                while (resultSet.next()) {
                    System.out.printf("%s : %s (%d)%n",
                            resultSet.getString("Artist"),
                            resultSet.getString("Title"),
                            resultSet.getInt("Release_Year"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}