public class TestOperatoreTernario {
    public static void main(String args[]) {
        // primo esempio
        int errori = 0;
        System.out.println(errori < 3 ? "Promosso" : "Bocciato"); 
        // secondo esempio
        String condition = "id = 1";
        String query = "select * from table " + (condition != null ? " where " + condition : "");
        // versione con if del secondo esempio":
        String query2 = "select * from table ";
        if (condition != null) {
            query2 = query2 + " where " + condition;
        }
    }
}