import java.sql.*;

public class TestPreparedStatement {

    public static void main(String[] args) {
        String url = "jdbc:derby:Music" ;

        try (Connection conn = DriverManager.getConnection(url)) {
            // Creazione del PreparedStatement per una query con parametro
            String selectSQL = "SELECT * FROM Album WHERE Release_Year = ?" ;
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
                // Prima esecuzione: Album pubblicati nel 2004
                printResultSet(pstmt, 2004);
                // Riutilizzo del PreparedStatement per un altro anno
                printResultSet(pstmt, 1972);
                // Riutilizzo del PreparedStatement per un altro anno ancora
                printResultSet(pstmt, 1972);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo privato per stampare il contenuto di un ResultSet
    private static void printResultSet(PreparedStatement pstmt, int releaseYear) throws SQLException {
        pstmt.setInt(1, releaseYear);
        try (ResultSet rs = pstmt.executeQuery()) {
            System.out.println("Album pubblicati nel " + releaseYear + ":");
            while (rs.next()) {
                System.out.printf("ID: %d, Titolo: %s, Artista: %s, Anno: %d%n" ,
                    rs.getInt("AlbumId"), rs.getString("Title"),
                    rs.getString("Artist"),
                    rs.getInt("Release_Year"));
            }
        }
    }
}