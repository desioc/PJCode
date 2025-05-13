import java .sql.*;
public class IsolationLevelExample {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");) {
            System.out.println("Current Transaction Isolation Level is " + conn.getTransactionIsolation());
            DatabaseMetaData dmd = conn.getMetaData();
            System.out.println("This database supports TRANSACTION_NONE Level = " + dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_NONE));
            System.out.println("This database supports TTRANSACTION_READ_COMMITTED Level = " + dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED));
            System.out.println("This database supports TRANSACTION_READ_UNCOMMITTED Level = " + dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_UNCOMMITTED));
            System.out.println("This database supports TRANSACTION_REPEATABLE_READ Level = " + dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ));
            System.out.println("This database supports TRANSACTION_SERIALIZABLE Level = " + dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));
            System.out.println("Setting Transaction Isolation Level to Connection.TRANSACTION_SERIALIZABLE");  
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            System.out.println("Current Transaction Isolation Level is " + conn.getTransactionIsolation());          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}