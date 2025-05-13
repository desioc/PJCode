import java.sql.*;
import java.util.*;

public class SongDAO implements DAO<Song> {

    @Override
    public Optional<Song> selectById(int id) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Song WHERE SongId = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return Optional.of(getSong(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore in selectById", e);
        }
        return Optional.empty();
    }

    @Override
    public List<Song> selectAll() {
        List<Song> songs = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Song")) {
            while (rs.next()) songs.add(getSong(rs));
        } catch (SQLException e) {
            throw new RuntimeException("Errore in selectAll", e);
        }
        return songs;
    }

    @Override
    public void insert(Song song) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO Song (SongId, Title, AlbumId, Duration) VALUES (?, ?, ?, ?)")) {
            ps.setInt(1, song.id());
            ps.setString(2, song.title());
            ps.setInt(3, song.albumId());
            ps.setInt(4, song.duration());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore in insert", e);
        }
    }

    @Override
    public void update(Song song) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                 "UPDATE Song SET Title = ?, AlbumId = ?, Duration = ? WHERE SongId = ?")) {
            ps.setString(1, song.title());
            ps.setInt(2, song.albumId());
            ps.setInt(3, song.duration());
            ps.setInt(4, song.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore in update", e);
        }
    }

    @Override
    public void delete(Song song) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("DELETE FROM Song WHERE SongId = ?")) {
            ps.setInt(1, song.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore in delete", e);
        }
    }

    private Song getSong(ResultSet rs) throws SQLException {
        return new Song(rs.getInt("SongId"), rs.getString("Title"),
                        rs.getInt("AlbumId"), rs.getInt("Duration"));
    }
}
