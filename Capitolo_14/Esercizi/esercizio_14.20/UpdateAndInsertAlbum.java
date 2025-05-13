import java.sql.*;

public class UpdateAndInsertAlbum {
    public static void main(String[] args) {
        final String URL = "jdbc:derby:..\\..\\..\\lib\\Music";

        try (Connection conn = DriverManager.getConnection(URL)) {
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            // recupero del ResultSet aggiornabile
            ResultSet rs = stmt.executeQuery("SELECT * FROM Album");

            // modifica del titolo per un album esistente (es. AlbumId = 1)
            while (rs.next()) {
                if (rs.getInt("AlbumId") == 1) {
                    rs.updateString("Title", "Updated Title");
                    rs.updateRow();
                    System.out.println("Titolo aggiornato per AlbumId = 1");
                    break;
                }
            }

            // inserimento di un nuovo album
            rs.moveToInsertRow();
            rs.updateInt("AlbumId", 300);
            rs.updateString("Title", "New Album");
            rs.updateString("Artist", "New Artist");
            rs.updateInt("Release_Year", 2025);
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println("Nuovo album inserito con AlbumId = 300");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
