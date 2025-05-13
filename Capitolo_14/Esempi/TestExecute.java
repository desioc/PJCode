import java.sql.*;

public class TestExecute {
    public static void main(String args[]) throws SQLException {
        executeSQL("SELECT * FROM Album"); // query
        executeSQL("UPDATE ALBUM set Release_Year = 1972 WHERE AlbumId = 1"); //update
    }

    public static void executeSQL(String sql) throws SQLException {
        try (var conn = DriverManager.getConnection("jdbc:derby:Music"); // apertura connessione
             var stmt = conn.createStatement()) {                        // creazione Statement
            boolean isQuery = stmt.execute(sql);                   // esecuzione dell'istruzione
            if (isQuery) {                                            // controllo tipo query... 
                try(ResultSet rs = stmt.getResultSet()) {                  // ....se è una query 
                    System.out.println("Risultati della query:"); 
                    while (rs.next()) {                                         // stampa titoli
                        System.out.println("  Titolo: " + rs.getString("Title"));
                    }
                }
            } else {                                               // ...se è una istruzione DML 
                int nrm = stmt.getUpdateCount();                            // esegui istruzione
                System.out.printf("Numero righe modficate %d:", nrm);  // numero righe modificate
            }
        } 
    }
}