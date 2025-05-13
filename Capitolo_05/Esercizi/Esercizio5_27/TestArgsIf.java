public class TestArgsIf {
    public static void main(String args[]) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Nessun parametro passato");
        }
        System.out.println("Programma terminato correttamente!");
    }
}
