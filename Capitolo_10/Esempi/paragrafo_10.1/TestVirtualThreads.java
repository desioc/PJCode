public class TestVirtualThreads {
    public static void main(String[] args) {
    long start = System.currentTimeMillis(); //
        for (int i = 0; i < 1_000_000; i++) {
      int taskId = i; // con ofPlatform il programma viene eseguito in 155 secondi
            Thread.ofVirtual().start(new MyTask(taskId));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
class MyTask implements Runnable {
    private final int taskId;
    public MyTask(int taskId) {
        this.taskId = taskId;
    }
    public void run() {
        if (taskId % 100_000 == 0) { // stampa ogni 100000
            System.out.println("Esecuzione task: " + taskId);
        }
    }
}