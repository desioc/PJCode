// classe esistente
class Quadrato {
    public void disegna() {
        System.out.println("Disegno un quadrato");
    }
}

// interfaccia attesa:
interface Forma {
    void disegnaForma();
}

// classe adapter
class QuadratoAdapter implements Forma {
    private Quadrato quadrato;

    public QuadratoAdapter(Quadrato quadrato) {
        this.quadrato = quadrato;
    }

    @Override
    public void disegnaForma() {
        quadrato.disegna(); // Adattiamo il metodo esistente
    }
}

// metodo main
void main() {
    Quadrato quadrato = new Quadrato();
    Forma forma = new QuadratoAdapter(quadrato);
    forma.disegnaForma();
}