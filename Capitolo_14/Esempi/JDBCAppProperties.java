import java.sql.*;
import java.util.*;
import java.io.*;

public class JDBCAppProperties {
    public static void main (String args[]) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("config.properties"));
        String url = p.getProperty("jdbc.derby.music.url");
        String user = p.getProperty("jdbc.derby.music.user");
        String pass = p.getProperty("jdbc.derby.music.pass");
        try (Connection conn = DriverManager.getConnection(url, user, pass);    // passo 1
             Statement stmt = conn.createStatement();                           // passo 2
             ResultSet rs = stmt.executeQuery("SELECT * FROM Album")) {         // passo 3
            while (rs.next()) {                                                 // passo 4
                System.out.printf("%s : %s (%s)\n" , rs.getString("Artist"),
                    rs.getString("Title"), rs.getInt("Release_Year"));
            }
        } catch (SQLException e) {                                              // passo 5 (implicito)
            e.printStackTrace();
        }

    }
}