import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
public class Festa implements Runnable {
    private CyclicBarrier luogoDellaFesta;
    public Festa(CyclicBarrier luogoDellaFesta) {
        this.luogoDellaFesta = luogoDellaFesta;
    }
    @Override
    public void run() {
        try {
            // Simula un ritardo casuale
            Thread.sleep((long) (Math.random() * 3000));
            System.out.println(Thread.currentThread().getName()
            + " è presente");
            luogoDellaFesta.await();
            System.out.println(Thread.currentThread().getName()
            + " ha iniziato a festeggiare...");
        } catch (InterruptedException | BrokenBarrierException ex) {
            ex.printStackTrace();
        }
    }
}