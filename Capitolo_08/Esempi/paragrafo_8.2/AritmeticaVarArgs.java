public class AritmeticaVarArgs {
    //esempio Varargs
    public  double somma(double... doubles) {
        double risultato = 0.0D;
        for (int i = 0; i < doubles.length; i++) {  // variabile length come gli array
            risultato += doubles[i];
        }
        return risultato;
    }
    //esempio array
   /* public double somma(double[] doubles) {
        double risultato = 0.0D;
        for (int i = 0; i < doubles.length; i++) {  // variabile length come gli array
            risultato += doubles[i]; 
        }
        return risultato;
    }*/
    
    // esempio errore
    // public void m(String... strings, int... integers) {}   

    public static void main(String args[]) {
        var ogg = new AritmeticaVarArgs();
        // per versione varargs
        System.out.println(ogg.somma(1,2,3));			// stampa 6.0
        System.out.println(ogg.somma());			// stampa 0.0
        System.out.println(ogg.somma(1,2));			// stampa 3.0
        System.out.println(ogg.somma(1,2,3,5,6,8,2,43,4));	// stampa 74.0
        // per versione array
//      double[] doubles = {1.2D, 2, 3.14, 100.0};
//      System.out.println(ogg.somma(doubles));
    }
}