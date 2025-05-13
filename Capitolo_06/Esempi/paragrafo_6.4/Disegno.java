import java.util.ArrayList;

public class Disegno {
    private record Punto(int x, int y) {}  // record innestato
    private ArrayList<Punto> punti;        // lista dei punti del disegno
    public Disegno () {
        punti = new ArrayList<>();         // istanza della lista
    }
    public void aggiungiPunto(int x, int y) {// aggiunge un punto alla lista
        punti.add(new Punto(x, y));
    }
    public void stampaPunti() {            // stampa la lista dei punti
        for (Punto p : punti) {
            System.out.println("Punto: x=" + p.x() + ", y=" + p.y());
        }
    }
}