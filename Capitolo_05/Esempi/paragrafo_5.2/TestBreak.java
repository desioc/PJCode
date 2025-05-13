public class TestBreak {
    public static void main(String args[]) {
        int i = 0;
        while (true) { 			// ciclo infinito
            if (i > 10) {		// se i > 10
                break;			// esci dal ciclo
            }
            System.out.println(i);	// stampa i
            i++;			// incrementa i
        }
    }
}