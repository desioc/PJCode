public class TestNullPointerException {
    public static void main(String args[]) {
        IllegalArgumentException iae = new IllegalArgumentException();
        System.out.println(getDescription(iae).toUpperCase());
    }
    static String getDescription(Throwable o) {
        return o.getMessage(); // ritorna null perch� il message non � stato settato
    }
}
