public class TestArgsSwitch {
    public static void main(String args[]) {
        switch (args.length) {
            case 1:
                System.out.println(args[0]);
            break;
            default:
                System.out.println("Nessun parametro passato");
            break;
        }
        System.out.println("Programma terminato correttamente!");
    }
}
