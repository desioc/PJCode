// interfaccia Espressione

public interface Espressione {
    int interpreta();
}
// espressioni terminali
public class Numero implements Espressione {
    private int valore;

    public Numero(int valore) {
        this.valore = valore;
    }

    @Override
    public int interpreta() {
        return valore;
    }
}
// espressioni non terminali
public class Somma implements Espressione {
    private Espressione sinistra;
    private Espressione destra;

    public Somma(Espressione sinistra, Espressione destra) {
        this.sinistra = sinistra;
        this.destra = destra;
    }

    @Override
    public int interpreta() {
        return sinistra.interpreta() + destra.interpreta();
    }
}

public class Sottrazione implements Espressione {
    private Espressione sinistra;
    private Espressione destra;

    public Sottrazione(Espressione sinistra, Espressione destra) {
        this.sinistra = sinistra;
        this.destra = destra;
    }

    @Override
    public int interpreta() {
        return sinistra.interpreta() - destra.interpreta();
    }
}

// metodo main 
void main() {
    // rappresenta l'espressione (5 + 3) - 2
    Espressione espressione = new Sottrazione(
        new Somma(new Numero(5), new Numero(3)),
        new Numero(2)
    );
    int risultato = espressione.interpreta();
    System.out.println("Risultato: " + risultato);
}