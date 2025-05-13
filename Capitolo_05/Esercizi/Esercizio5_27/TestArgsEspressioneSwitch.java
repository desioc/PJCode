public class TestArgsEspressioneSwitch {
    public static void main(String args[]) {
        System.out.println(switch (args.length) {
                               case 1 -> args[0];
                               default -> "Nessun parametro passato";
                           });
        System.out.println("Programma terminato correttamente!");
    }
}