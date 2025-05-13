public record Punto(int x, int y) {
    public String toString() { // il metodo ritorna un tipo String
        return "Punto[x=" + x + ", y=" + y + "]" ; // concatenazione di stringhe e variabili
    }
}

/* public class Punto {
    public final int x;			// il modificatore final rende x costante
    public final int y;			// il modificatore final rende y costante
    public Punto(int a, int b) {	// costruttore che setta le costanti x e y
        x = a;
        y = b;
    }
}*/