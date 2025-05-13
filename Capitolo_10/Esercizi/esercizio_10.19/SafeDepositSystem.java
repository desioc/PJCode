// classe del main
public class SafeDepositSystem {
    public static void main(String[] args) {
        // Creiamo una cassaforte con saldo iniziale di 0
        Safe safe = new Safe();
        
        // Creiamo 5 thread che tenteranno di depositare soldi nella cassaforte
        for (int i = 0; i < 5; i++) {
            new Thread(new PersonDeposit(safe, 100)).start();  // Ogni persona deposita 100
        }
    }
}

