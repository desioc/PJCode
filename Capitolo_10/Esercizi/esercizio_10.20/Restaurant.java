// classe che astrae un ristorante
import java.util.concurrent.Semaphore;

public class Restaurant {
    private final Semaphore availableTables; // Semaforo per gestire l'accesso ai tavoli

    public Restaurant(int numberOfTables) {
        this.availableTables = new Semaphore(numberOfTables); // Numero massimo di tavoli disponibili
    }

    public void reserveTable(String customerName) {
        try {
            // Il cliente cerca di occupare un tavolo (acquisisce il permesso dal semaforo)
            availableTables.acquire();
            System.out.println(customerName + " ha prenotato un tavolo.");

            // Simula il tempo di permanenza del cliente al tavolo
            Thread.sleep(2000); // Soggiorno del cliente di 2 secondi (simulazione)

            System.out.println(customerName + " ha lasciato il tavolo.");
        } catch (InterruptedException e) {
            System.out.println(customerName + " è stato interrotto.");
        } finally {
            // Rilascia il tavolo (semaforo)
            availableTables.release();
        }
    }
}