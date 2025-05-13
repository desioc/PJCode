public class TestContinue {
    public static void main(String args[]) {
        int i = 0;
        do {					// esegue sicuramente la prima iterazione
            i++;				// incremento di i
            if (i == 5) {			// se i == 5
                continue;			// salta alla prossima iterazione
            }
            System.out.println(i);	        // stampa i
        } while(i < 10);
    }
}