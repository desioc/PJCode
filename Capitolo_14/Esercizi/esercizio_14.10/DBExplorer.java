import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface DBExplorer {
    String CONNECTION_URL = "jdbc:derby:..\\esercizio_14.8\\PhoneBook;create=false";

    // metodo di default per recuperare tutti i contatti
    default List<Contact> getContacts() {
        List<Contact> lista = new ArrayList<>();
        try (
            Connection conn = DriverManager.getConnection(CONNECTION_URL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Contact")
        ) {
            while (rs.next()) {
                String name = rs.getString("Name");
                String phone = rs.getString("Phone");
                String address = rs.getString("Address");
                lista.add(new Contact(name, phone, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // metodo di default per trovare un contatto per nome
    default Contact findByName(String nameToFind) {
        try (
            Connection conn = DriverManager.getConnection(CONNECTION_URL);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Contact WHERE Name = ?")
        ) {
            stmt.setString(1, nameToFind);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Contact(
                        rs.getString("Name"),
                        rs.getString("Phone"),
                        rs.getString("Address")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}