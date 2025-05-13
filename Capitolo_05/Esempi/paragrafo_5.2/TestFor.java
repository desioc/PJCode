public class TestFor {
    public static void main(String args[]) {
        for (int i = 10; i > 0; i--) { // La variabile locale i è visibile solo nel ciclo
            System.out.print(i + " "); // il metodo print non va da capo
        }
    }
}