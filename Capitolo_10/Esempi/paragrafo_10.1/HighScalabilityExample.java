public class HighScalabilityExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            int taskId = i;
            Thread.ofVirtual().start(() -> {
                if (taskId % 100_000 == 0) { // stampiamo solo ogni 100000
                    System.out.println("Esecuzione task: " + taskId);
                }
            });
        }
    }
}