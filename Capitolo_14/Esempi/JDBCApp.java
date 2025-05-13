import java .sql.*;

public class JDBCApp {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Album")) {
            while (rs.next()) {
                System.out.printf("%s : %s (%s)\n", rs.getString("Artist"), 
                    rs.getString("Title"), rs.getInt("Release_Year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}