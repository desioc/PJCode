import java.sql.*;

public interface DBSerializator {
    String CONNECTION_URL = "jdbc:derby:..\\esercizio_14.8\\PhoneBook;create=false";

    default void insert(Contact c) throws SQLException {
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL);
             PreparedStatement stmt = conn.prepareStatement(
                 "INSERT INTO Contact (Name, Phone, Address) VALUES (?, ?, ?)")) {
            stmt.setString(1, c.Name());
            stmt.setString(2, c.Phone());
            stmt.setString(3, c.Address());
            stmt.executeUpdate();
        }
    }

    default void update(Contact c) throws SQLException {
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL);
             PreparedStatement stmt = conn.prepareStatement(
                 "UPDATE Contact SET Phone = ?, Address = ? WHERE Name = ?")) {
            stmt.setString(1, c.Phone());
            stmt.setString(2, c.Address());
            stmt.setString(3, c.Name());
            stmt.executeUpdate();
        }
    }

    default void delete(String name) throws SQLException {
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL);
             PreparedStatement stmt = conn.prepareStatement(
                 "DELETE FROM Contact WHERE Name = ?")) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        }
    }
}
