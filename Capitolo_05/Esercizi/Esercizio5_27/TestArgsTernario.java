public class TestArgsTernario {
    public static void main(String args[]) {
        System.out.println(args.length != 0 ? args[0] : "Nessun parametro passato");
        System.out.println("Programma terminato correttamente!");
    }
}