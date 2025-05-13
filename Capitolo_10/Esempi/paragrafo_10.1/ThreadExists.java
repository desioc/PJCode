public class ThreadExists {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        t.setName("Thread principale");
        t.setPriority(10);
        System.out.println("Thread in esecuzione: " + t);
        // eseguiamo un conto alla rovescia da 5 a 1
        // con pause da un secondo
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("" + n);
                // pausa di 1000 millisecondi (un secondo)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrotto");
        }
    }
}