import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBCRUD implements DBExplorer, DBSerializator {

    private static final String URL = DBExplorer.CONNECTION_URL;

    public Contact findByPhone(String phone) throws SQLException {
        try (
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT * FROM Contact WHERE Phone = ?")
        ) {
            stmt.setString(1, phone);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Contact(
                        rs.getString("Name"),
                        rs.getString("Phone"),
                        rs.getString("Address")
                    );
                }
            }
        }
        return null;
    }

    public Contact findByAddress(String address) throws SQLException {
        try (
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT * FROM Contact WHERE Address = ?")
        ) {
            stmt.setString(1, address);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Contact(
                        rs.getString("Name"),
                        rs.getString("Phone"),
                        rs.getString("Address")
                    );
                }
            }
        }
        return null;
    }
}
