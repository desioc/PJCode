public class TestNullPointerException {
    public static void main(String args[]) {
        IllegalArgumentException iae = new IllegalArgumentException();
        System.out.println(getDescription(iae).toUpperCase());
    }
    static String getDescription(Throwable o) {
        return o.getMessage(); // ritorna null perché il message non è stato settato
    }
}
