import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
public class TestFesta {
    public static void main(String args[]) {
        CyclicBarrier luogoDellaFesta = new CyclicBarrier(3,
            new CyclicBarrierTask());
        Festa festa = new Festa(luogoDellaFesta);
        new Thread(festa, "Antonio").start();
        new Thread(festa, "Marcello").start();
        new Thread(festa, "Serena").start();
    }
    static class CyclicBarrierTask implements Runnable {
        @Override
        // metodo eseguito dalla CyclicBarrier quando partirà
        public void run() {
            System.out.println("Tutti presenti, possiamo iniziare!");
        }
    }
}