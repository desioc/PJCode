// implementazione di DRY
class CalcolatoreIVA {
    public static double calcolaIVA(double prezzo) {
        return prezzo * 0.22;
    }
}

// classi che utilizzano l'IVA
class Ordine {
    private double prezzoBase;

    public Ordine(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public double calcolaPrezzoTotale() {
        return prezzoBase + CalcolatoreIVA.calcolaIVA(prezzoBase);
    }
}

class Fattura {
    private double importo;

    public Fattura(double importo) {
        this.importo = importo;
    }

    public double calcolaTotaleFattura() {
        return importo + CalcolatoreIVA.calcolaIVA(importo);
    }
}

// metodo main
void main() {
    Ordine ordine = new Ordine(100.0);
    Fattura fattura = new Fattura(200.0);
    println("Prezzo totale ordine: " + ordine.calcolaPrezzoTotale() + " €");
    println("Totale fattura: " + fattura.calcolaTotaleFattura() + " €");
}