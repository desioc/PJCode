// classe che astra il concetto di cassaforte
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Safe {
    private int balance = 0;  // Saldo iniziale
    private final Lock lock = new ReentrantLock();  // Creiamo un lock per sincronizzare l'accesso

    // Metodo per depositare soldi nella cassaforte
    public void deposit(int amount) {
        lock.lock();  // Acquisiamo il lock per accedere alla risorsa condivisa
        try {
            int newBalance = balance + amount;
            System.out.println("Deposito di " + amount + ". Saldo attuale: " + newBalance);
            balance = newBalance;  // Aggiorniamo il saldo
        } finally {
            lock.unlock();  // Rilasciamo il lock per permettere ad altri thread di accedere
        }
    }

    // Metodo per ottenere il saldo corrente
    public int getBalance() {
        return balance;
    }
}
