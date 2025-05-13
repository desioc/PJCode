// classe che non usa PoLA
/* class Contatore {
    private int valore = 0;

    public int getValore() {
        valore++; // effetto collaterale non previsto
        return valore;
    }
} */

// classe che usa PoLA
class Contatore {
    private int valore = 0;

    public int getValore() {
        return valore;
    }

    public void incrementa() {
        valore++;
    }
}

// metodo main
void main() {
    var contatore = new Contatore();
    contatore.incrementa();
    println(contatore.getValore());
}
