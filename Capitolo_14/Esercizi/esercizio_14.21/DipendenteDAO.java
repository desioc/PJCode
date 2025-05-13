import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class DipendenteDAO implements DAO<Dipendente> {
    public static final String URL = "jdbc:derby:Azienda";

    @Override
    public Optional<Dipendente> selectById(int id) {
        Dipendente dipendente = null;
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM Dipendente WHERE DipendenteID = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dipendente = getDipendente(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(dipendente);
    }

    @Override
    public List<Dipendente> selectAll() {
        List<Dipendente> lista = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM Dipendente")) {
            while (rs.next()) {
                lista.add(getDipendente(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public void insert(Dipendente d) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO Dipendente VALUES (?,?,?,?,?,?)")) {
            ps.setInt(1, d.id());
            ps.setString(2, d.nome());
            ps.setString(3, d.cognome());
            ps.setString(4, d.dipartimento());
            ps.setDouble(5, d.salario());
            ps.setString(6, d.dataAssunzione().toString());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Dipendente d) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                "UPDATE Dipendente SET Dipartimento=?, Salario=? WHERE DipendenteID=?")) {
            ps.setString(1, d.dipartimento());
            ps.setDouble(2, d.salario());
            ps.setInt(3, d.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Dipendente d) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(
                "DELETE FROM Dipendente WHERE DipendenteID=?")) {
            ps.setInt(1, d.id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Dipendente getDipendente(ResultSet rs) throws SQLException {
        return new Dipendente(
            rs.getInt("DipendenteID"),
            rs.getString("Nome"),
            rs.getString("Cognome"),
            rs.getString("Dipartimento"),
            rs.getDouble("Salario"),
            LocalDate.parse(rs.getString("DataAssunzione"))
        );
    }
}
