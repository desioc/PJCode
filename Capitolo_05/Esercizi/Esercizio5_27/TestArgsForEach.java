public class TestArgsForEach {
    public static void main(String args[]) {
        for (var arg : args) {
            System.out.println(arg);
        }
        System.out.println("Programma terminato correttamente!");
    }
}