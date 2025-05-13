public class TestIf {
    public static void main(String args[]) {
        int numeroLati = 0;
        // primo esempio if senza parentesi
        if (numeroLati == 3)
            System.out.println("Questo è un triangolo");
        // primo esempio if con parentesi
        if (numeroLati == 3) {
            System.out.println("Questo è un triangolo");
        }
        
        // if else:
        if (numeroLati == 3) {                                  // se il numero di lati è uguale a 3
            System.out.println("Questo è un triangolo");        // stampa "Questo è un triangolo"
        } else {                                                // altrimenti
            System.out.println("Questo non è un triangolo");    // stampa "Questo non è un triangolo"
        }
        
        // if else if else
        if (numeroLati == 3) {
            System.out.println("Questo è un triangolo");
        } else if (numeroLati == 4) {
            System.out.println("Questo è un quadrilatero");
        } else if (numeroLati == 5) {
            System.out.println("Questo è un pentagono");
        } else if (numeroLati == 6) {
            System.out.println("Questo è un esagono");
        } else {
            System.out.println("Questo è un poligono");
        }


        // codice valido ma inutile
        if(true) {}
        if(false);
        if(true) {} else if(true) {} else if(false) ; else {}
    }
}