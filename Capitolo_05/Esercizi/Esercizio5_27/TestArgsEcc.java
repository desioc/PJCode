public class TestArgsEcc {
    public static void main(String args[]) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Nessun parametro passato");
        }
    }
}
