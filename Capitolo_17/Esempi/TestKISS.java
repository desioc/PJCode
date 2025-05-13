public class Calcolatore {
    // metodo che non implementa KISS
    double calcolaPrezzoTotaleSenzaKISS(double prezzoUnitario, int quantita) {
        double totale = 0;
        if (quantita > 0) {
            totale = prezzoUnitario * quantita;
            if (totale > 100) {
            totale = totale - (totale * 0.10); // 10% di sconto
            }
        }
        return totale;
    }

    // refactoring del metodo utilizzando KISS
    double  calcolaPrezzoTotale(double prezzoUnitario, int quantita) {
        double totale = prezzoUnitario * quantita;
        if (totale > 100) {
        totale *= 0.9; // applica sconto 10%
        }
        return totale;
    }
}

// metodo main
void main() {
    var calcolatore = new Calcolatore();
    double prezzoUnitario = 25;
    int quantita = 7;
    println("Prezzo senza KISS" + calcolatore.calcolaPrezzoTotaleSenzaKISS(prezzoUnitario, quantita));
    println("Prezzo con KISS" + calcolatore.calcolaPrezzoTotale(prezzoUnitario, quantita));
}