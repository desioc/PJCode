public class TestForEach {
    public static void main(String args[]) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int tmp : array) {
            System.out.println(tmp);
        }
        // versione con final
        for (final int tmp : array) {
            System.out.println(tmp);
        }
        // versione con var
        for (var tmp : array) {
            System.out.println(tmp);
        }
    }
}