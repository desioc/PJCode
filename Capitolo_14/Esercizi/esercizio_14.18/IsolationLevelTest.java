import java.sql.*;

public class IsolationLevelTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:..\\..\\..\\lib\\Music")) {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            int isolation = conn.getTransactionIsolation();
            System.out.println("Livello di isolamento corrente: "
                + isolationLevelToString(isolation));

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM Album")) {
                while (rs.next()) {
                    System.out.printf("%d: %s - %s (%d)%n",
                        rs.getInt("AlbumId"),
                        rs.getString("Title"),
                        rs.getString("Artist"),
                        rs.getInt("Release_Year"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String isolationLevelToString(int level) {
        return switch (level) {
            case Connection.TRANSACTION_NONE -> "TRANSACTION_NONE";
            case Connection.TRANSACTION_READ_UNCOMMITTED -> "TRANSACTION_READ_UNCOMMITTED";
            case Connection.TRANSACTION_READ_COMMITTED -> "TRANSACTION_READ_COMMITTED";
            case Connection.TRANSACTION_REPEATABLE_READ -> "TRANSACTION_REPEATABLE_READ";
            case Connection.TRANSACTION_SERIALIZABLE -> "TRANSACTION_SERIALIZABLE";
            default -> "LIVELLO SCONOSCIUTO";
        };
    }
}
