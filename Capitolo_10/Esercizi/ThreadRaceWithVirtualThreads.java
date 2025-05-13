class Clicker implements Runnable {
    private long click = 0L;
    private int priority;
    private volatile boolean running = true;
    
    public Clicker(int priority) {
       /* t = new Thread(this); */
       this.priority = priority; 
    }

    public long getClick() {
        return click;
    }

    public void run() {
        while (running) {
            click++;
        }
        System.out.println("Fine " + Thread.currentThread());
    }

    public void stopThread() {
        running = false;
    }

    public void startThread() {
        Thread.ofVirtual().start(this);
    }
}

public class ThreadRaceWithVirtualThreads {
    public static void main(String args[]) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        lo.startThread();
        hi.startThread();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        lo.stopThread();
        hi.stopThread();
        System.out.println(lo.getClick() +" vs "+ hi.getClick());
    }
}