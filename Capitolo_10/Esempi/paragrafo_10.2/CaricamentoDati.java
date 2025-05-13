import java.util.concurrent.CountDownLatch;

public class CaricamentoDati {

    public static void main(String[] args) {
        // Creazione di un CountDownLatch con un conteggio di 3 per i 3 task da completare
        CountDownLatch latch = new CountDownLatch(3);
        String messaggio = "Caricamento dati ? in corso...";
        // Creazione e avvio dei thread per ciascun task di caricamento, passando le frasi
        new Thread(new CaricaDati(latch, messaggio.replace("?", "dal file"))).start();
        new Thread(new CaricaDati(latch, messaggio.replace("?", "dal database"))).start();
        new Thread(new CaricaDati(latch, messaggio.replace("?", "dall'API"))).start();
        try {            
            latch.await();// il thread principale attende che il conteggio arrivi a zero
            System.out.println("Tutti i dati sono stati caricati.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class CaricaDati implements Runnable { // rappresenta il thread di caricamento dei dati
    private final CountDownLatch latch;
    private final String messaggio;

    public CaricaDati(CountDownLatch latch, String messaggio) {
        this.latch = latch;
        this.messaggio = messaggio;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 3000));  // Simula un ritardo casuale
            System.out.println(messaggio); // inizio task
            Thread.sleep((long) (Math.random() * 3000));  // Simula un ritardo casuale
            System.out.println(messaggio.replace("in corso", "completato")); // fine task
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();  // Decrementa il contatore quando il task è completato
        }
    }
}
