public class TestIf {
    public static void main(String args[]) {
        int numeroLati = 0;
        // primo esempio if senza parentesi
        if (numeroLati == 3)
            System.out.println("Questo � un triangolo");
        // primo esempio if con parentesi
        if (numeroLati == 3) {
            System.out.println("Questo � un triangolo");
        }
        
        // if else:
        if (numeroLati == 3) {                                  // se il numero di lati � uguale a 3
            System.out.println("Questo � un triangolo");        // stampa "Questo � un triangolo"
        } else {                                                // altrimenti
            System.out.println("Questo non � un triangolo");    // stampa "Questo non � un triangolo"
        }
        
        // if else if else
        if (numeroLati == 3) {
            System.out.println("Questo � un triangolo");
        } else if (numeroLati == 4) {
            System.out.println("Questo � un quadrilatero");
        } else if (numeroLati == 5) {
            System.out.println("Questo � un pentagono");
        } else if (numeroLati == 6) {
            System.out.println("Questo � un esagono");
        } else {
            System.out.println("Questo � un poligono");
        }


        // codice valido ma inutile
        if(true) {}
        if(false);
        if(true) {} else if(true) {} else if(false) ; else {}
    }
}