import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InserisciEVisualizzaAlbum {

    public static void main(String[] args) {
         // verifica dei parametri passati da riga di comando
        if (args.length != 4) {
            System.out.println("Uso: java InserisciEVisualizzaAlbum <id> <titolo> <artista> <anno>");
            return;
        }

        int albumId = Integer.parseInt(args[0]);
        String title = args[1];
        String artist = args[2];
        int releaseYear = Integer.parseInt(args[3]);

        // stringa di connessione al database Music (embedded)
        // ho posizionato il database embedded Music (una cartella)
        // tre cartelle sopra all'interno di una cartella lib
        String url = "jdbc:derby:..\\..\\..\\lib\\Music";

        // istruzione SQL parametrizzata
        String sql = "INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (?, ?, ?, ?)";
        try (
            // apertura della connessione
            Connection conn = DriverManager.getConnection(url);
            
            // creazione del prepared statement (insert)
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // creazione dello statement (select)
            Statement stmt = conn.createStatement();

            // esecuzione della query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Album");
        ) {
            
            // assegnazione dei parametri
            pstmt.setInt(1, albumId);
            pstmt.setString(2, title);
            pstmt.setString(3, artist);
            pstmt.setInt(4, releaseYear);

            // esecuzione dell'INSERT
            int righeInserite = pstmt.executeUpdate();
            System.out.println("Righe inserite: " + righeInserite);
            
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