import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VisualizzaAlbum {

    public static void main(String[] args) {
        // stringa di connessione al database Music (embedded)
        // ho posizionato il database embedded Music (una cartella)
        // tre cartelle sopra all'interno di una cartella lib
        String url = "jdbc:derby:..\\..\\..\\lib\\Music";

        try (
            // apertura della connessione
            Connection conn = DriverManager.getConnection(url);

            // creazione dello statement
            Statement stmt = conn.createStatement();

            // esecuzione della query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Album");
        ) {
            // intestazione della tabella
            System.out.printf("%-5s | %-30s | %-25s | %-4s%n",
                    "ID", "Titolo", "Artista", "Anno");
            System.out.println("---------------------------------------------------------------");

            // stampa dei risultati
            while (rs.next()) {
                int id = rs.getInt("AlbumId");
                String titolo = rs.getString("Title");
                String artista = rs.getString("Artist");
                int anno = rs.getInt("Release_Year");

                System.out.printf("%-5d | %-30s | %-25s | %-4d%n",
                        id, titolo, artista, anno);
            }

        } catch (SQLException e) {
            // gestione degli errori
            System.err.println("Errore durante l'accesso al database:");
            e.printStackTrace();
        }
    }
}