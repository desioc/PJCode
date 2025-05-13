public class CounterThread extends Thread {
    public static void main(String args[]) {
        new CounterThread().start();
    }

    public void run() {
        for (int i = 0; i<1000000; ++i) {
            int taskId = i;
            if (taskId % 100_000 == 0) {
                System.out.println("Esecuzione task: " + taskId);
            }
        }
    }
}