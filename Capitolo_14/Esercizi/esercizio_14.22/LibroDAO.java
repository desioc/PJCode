// classe LibroDAO
import java.sql.*;
import java.util.*;

public class LibroDAO implements DAO<Libro> {
    private static final String URL = "jdbc:derby:..\\..\\..\\lib\\Biblioteca";

    @Override
    public Optional<Libro> selectById(int id) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Libro WHERE ID = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(getLibro(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore durante selectById", e);
        }
        return Optional.empty();
    }

    @Override
    public List<Libro> selectAll() {
        List<Libro> lista = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Libro")) {
            while (rs.next()) {
                lista.add(getLibro(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Errore durante selectAll", e);
        }
        return lista;
    }

    @Override
    public void insert(Libro libro) {
        if (selectById(libro.id()).isPresent()) {
            throw new DuplicateKeyException("ID già esistente: " + libro.id());
        }
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("INSERT INTO Libro VALUES (?, ?, ?, ?)")) {
            ps.setInt(1, libro.id());
            ps.setString(2, libro.titolo());
            ps.setString(3, libro.autore());
            ps.setInt(4, libro.anno());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore durante insert", e);
        }
    }

    @Override
    public void update(Libro libro) {
        if (selectById(libro.id()).isEmpty()) {
            throw new RecordNotFoundException("Libro non trovato: ID = " + libro.id());
        }
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                 "UPDATE Libro SET Titolo = ?, Autore = ?, Anno = ? WHERE ID = ?")) {
            ps.setString(1, libro.titolo());
            ps.setString(2, libro.autore());
            ps.setInt(3, libro.anno());
            ps.setInt(4, libro.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore durante update", e);
        }
    }

    @Override
    public void delete(Libro libro) {
        if (selectById(libro.id()).isEmpty()) {
            throw new RecordNotFoundException("Libro non trovato per eliminazione: ID = " + libro.id());
        }
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("DELETE FROM Libro WHERE ID = ?")) {
            ps.setInt(1, libro.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Errore durante delete", e);
        }
    }

    private Libro getLibro(ResultSet rs) throws SQLException {
        return new Libro(
            rs.getInt("ID"),
            rs.getString("Titolo"),
            rs.getString("Autore"),
            rs.getInt("Anno")
        );
    }
}
