import java.sql.*;

public class TestPreparedStatement {
    Album [] albums = {
        new Album(5, "Kind of Blue", "Miles Davis", 1959),
        new Album(6, "News of The World", "Queen",1977),
        new Album(7, "Beneath the Mask", "Chick Corea", 1991),
        new Album(8, "Black Sabbath", "Black Sabbath", 1970),
        new Album(9, "Fragile", "Yes", 1971),
        new Album(10, "Rage Against the Machine", "Rage Against The Machine", 1992),
        new Album(11, "Innervisions", "Stevie Wonder", 1973),
        new Album(12, "Led Zeppelin IV", "Led Zeppelin", 1971),
        new Album(13, "Secret Story", "Pat Metheny", 1992),
        new Album(14, "A Rush of Blood to the Head", "Coldplay", 1959),
        new Album(15, "Master of Puppets", "Metallica", 1986),
        new Album(16, "Californication", "Red Hot Chili Peppers", 1999),
        new Album(17, "Still Got the Blues",  "Gary Moore", 1990),
        new Album(18, "Surfing with the Alien", "Joe Satriani", 1987),
        new Album(19, "Breezin'", "George Benson", 1976),
        new Album(20, "My Song", "Keith Jarret", 1978),
        new Album(21, "The Road of Bones", "IQ", 2014),
        new Album(22, "Misplaced Childhood", "Marillion", 1985),
        new Album(23, "Rising Force", "Yngwie Malmesteen",1984),
        new Album(24, "Night Walker", "Gino Vannelli", 1981),
        new Album(25, "Selling England by the Pound", "Genesis", 1973),
        new Album(26, "Brothers in Arms", "Dire Straits", 1985),
        new Album(27, "Live", "James Taylor", 1993),
        new Album(28, "Passion and Warfare", "Steve Vai", 1990),
        new Album(29, "Smokin' in the Pit", "Steps Ahead", 1980),
        new Album(30, "Live after Death", "Iron Maiden", 1985),
    } ;

    public static void main(String args[]) {
        new TestPreparedStatement().prepareDB();
    }
    
    public void prepareDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
        PreparedStatement  stmt = conn.prepareStatement("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (?, ?,?,?)");) {
            int i = 0;
            for (Album album : albums) {
                stmt.setInt(1, album.getAlbumId());
                stmt.setString(2, album.getArtist());
                stmt.setString(3, album.getTitle());
                stmt.setInt(4, album.getReleaseYear());
                i+=stmt.executeUpdate();
            }
            System.out.println(i +" rows inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}