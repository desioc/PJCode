import java.sql.*;
import java.util.*;

public class MusicManager {
    private static final String URL = "jdbc:derby:..\\..\\..\\lib\\Music";

    public Map<Album, List<Song>> getAllAlbumsWithSongs() {
        Map<Album, List<Song>> result = new LinkedHashMap<>();
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rsAlbums = stmt.executeQuery("SELECT * FROM Album")) {
            while (rsAlbums.next()) {
                Album album = new Album(
                    rsAlbums.getInt("AlbumId"),
                    rsAlbums.getString("Title"),
                    rsAlbums.getString("Artist"),
                    rsAlbums.getInt("Release_Year")
                );
                List<Song> songs = getSongsByAlbumId(album.id());
                result.put(album, songs);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore in getAllAlbumsWithSongs", e);
        }
        return result;
    }

    public List<Song> getSongsByAlbumId(int albumId) {
        List<Song> songs = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Song WHERE AlbumId = ?")) {
            ps.setInt(1, albumId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    songs.add(new Song(
                        rs.getInt("SongId"),
                        rs.getString("Title"),
                        rs.getInt("AlbumId"),
                        rs.getInt("Duration")
                    ));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore in getSongsByAlbumId", e);
        }
        return songs;
    }

    public Optional<Album> getAlbumBySongId(int songId) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("""
                SELECT a.* FROM Album a
                JOIN Song s ON a.AlbumId = s.AlbumId
                WHERE s.SongId = ?
             """)) {
            ps.setInt(1, songId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new Album(
                        rs.getInt("AlbumId"),
                        rs.getString("Title"),
                        rs.getString("Artist"),
                        rs.getInt("Release_Year")
                    ));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore in getAlbumBySongId", e);
        }
        return Optional.empty();
    }

    public void insertAlbumWithSongs(Album album, List<Song> songs) {
        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);

            try (PreparedStatement psAlbum = conn.prepareStatement(
                     "INSERT INTO Album VALUES (?, ?, ?, ?)");
                 PreparedStatement psSong = conn.prepareStatement(
                     "INSERT INTO Song VALUES (?, ?, ?, ?)")) {

                psAlbum.setInt(1, album.id());
                psAlbum.setString(2, album.title());
                psAlbum.setString(3, album.artist());
                psAlbum.setInt(4, album.year());
                psAlbum.executeUpdate();

                for (Song song : songs) {
                    psSong.setInt(1, song.id());
                    psSong.setString(2, song.title());
                    psSong.setInt(3, album.id());
                    psSong.setInt(4, song.duration());
                    psSong.executeUpdate();
                }

                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                throw new RuntimeException("Errore in insertAlbumWithSongs", e);
            } finally {
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Errore nella connessione", e);
        }
    }
}
