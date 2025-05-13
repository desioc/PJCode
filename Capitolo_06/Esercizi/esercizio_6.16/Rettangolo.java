public class Rettangolo {

    private double base;
    private double altezza;

    // costruttore
    public Rettangolo(double base, double altezza) {
        setBase(base);
        setAltezza(altezza);
    }

    // metodi getter e setter con controlli di validità
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Errore: la base deve essere un valore positivo.");
        }
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("Errore: l'altezza deve essere un valore positivo.");
        }
    }

    // metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    // metodo per calcolare l'area
    public double calcolaArea() {
        return base * altezza;
    }
}
