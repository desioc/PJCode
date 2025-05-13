public class TestContoBancario {
    public static void main(String[] args) {
        
        // Scenario 1: creazione conto con saldo predefinito
        ContoBancario conto1 = new ContoBancario("IT123456789");
        System.out.println("Conto 1 - Saldo iniziale: " + conto1.getSaldo());

        // Deposito e prelievo
        conto1.deposita(1000);
        System.out.println("Conto 1 - Saldo dopo deposito: " + conto1.getSaldo());
        conto1.preleva(300);
        System.out.println("Conto 1 - Saldo dopo prelievo: " + conto1.getSaldo());
        conto1.preleva(800); // dovrebbe mostrare errore

        // Scenario 2: creazione conto con saldo iniziale
        ContoBancario conto2 = new ContoBancario("IT987654321", 500);
        System.out.println("\nConto 2 - Saldo iniziale: " + conto2.getSaldo());
        conto2.preleva(100);
        System.out.println("Conto 2 - Saldo dopo prelievo: " + conto2.getSaldo());

        // Scenario 3: creazione con saldo negativo
        ContoBancario conto3 = new ContoBancario("IT000000001", -200);
        System.out.println("\nConto 3 - Saldo iniziale: " + conto3.getSaldo());

        // Test deposito negativo
        conto3.deposita(-50);

        // Test prelievo negativo
        conto3.preleva(-10);
    }
}