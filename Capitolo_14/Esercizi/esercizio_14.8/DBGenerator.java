import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.stream.Stream;

public class DBGenerator {

    public static void main(String[] args) {
        try {
            generateDB();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void generateDB() throws IOException, SQLException {
        // Legge la configurazione dal file .properties
        Properties props = new Properties();
        props.load(Files.newBufferedReader(Path.of("DBConfig.properties")));

        String url = props.getProperty("db.url");

        try (
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            Stream<String> lines = Files.lines(Path.of("DBScript.txt"))
        ) {
            StringBuilder query = new StringBuilder();

            lines.map(String::trim)
                 .filter(line -> !line.isEmpty() && !line.startsWith("--")).peek(System.out::println)
                 .forEach(line -> {
                     query.append(line).append(" ");
                     if (line.endsWith(";")) {
                         String sql = query.toString().replace(";", "").trim();
                         System.out.println("Eseguo: " + sql);
                         try {
                             stmt.executeUpdate(sql);
                         } catch (SQLException e) {
                             System.err.println("Errore nell'esecuzione: " + sql);
                             e.printStackTrace();
                         }
                         query.setLength(0); // svuota il buffer
                     }
                 });

            System.out.println("Database creato correttamente.");
        }
    }
}
