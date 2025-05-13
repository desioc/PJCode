public class Punto {
    private int x, y;

    // costruttore senza parametri
    public Punto() {
    }

    // overload di costruttori: costruttore con due parametri interi
    public Punto(int x, int y) {
        // riutilizzo del codice (il this è facoltativo)
        this.setXY(x, y);
    }

    public void setX(int x) {
        this.x = x; // il this non è facoltativo
    }

    public void setY(int y) {
        this.y = y; // il this non è facoltativo
    }

    public void setXY(int x, int y) {
        this.setX(x); // il this è facoltativo
        this.setY(y);
    }

    public int getX() {
        return this.x; // il this è facoltativo
    }

    public int getY() {
        return this.y; // il this è facoltativo
    }

    // calcola la distanza tra due punti
    public double dammiDistanza(Punto p) {
    	// soluzione del punto 1
        if (p == null) {
            throw new IllegalArgumentException("Il punto passato non può essere null.");
        }
        // soluzione del punto 2
        if (this == p || this.x == p.x && this.y == p.y) { // stesso oggetto o stesse coordinate
            return 0.0;
        }
        // soluzione del punto 3
        if (p instanceof Punto3D) { // punto normale -> Punto3D: errore
            throw new IllegalArgumentException("Non posso calcolare la distanza tra Punto e Punto3D.");
        }
        // quadrato della differenza delle x dei 2 punti
        int tmp1 = (x - p.x) * (x - p.x);
        // quadrato della differenza della y dei 2 punti
        int tmp2 = (y - p.y) * (y - p.y);
        // radice quadrata della somma dei due quadrati
        return Math.sqrt(tmp1 + tmp2);
    }
}