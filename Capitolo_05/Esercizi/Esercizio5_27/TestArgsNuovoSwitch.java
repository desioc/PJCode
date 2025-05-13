public class TestArgsNuovoSwitch {
    public static void main(String args[]) {
        switch (args.length) {
            case 1 -> System.out.println(args[0]);
            default -> System.out.println("Nessun parametro passato");
        }
        System.out.println("Programma terminato correttamente!");
    }
}