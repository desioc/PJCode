class Rettangolo {
    private int larghezza;
    private int altezza;

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getAltezza() {
        return altezza;
    }


    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int calcolaArea() {
        return larghezza * altezza;
    }
}

class Quadrato extends Rettangolo { // violato il test "is a"
    @Override
    public void setLarghezza(int lato) {
        super.setLarghezza(lato);
        super.setAltezza(lato);
    }

    @Override
    public void setAltezza(int lato) {
        super.setLarghezza(lato);
        super.setAltezza(lato);
    }
}

void main() {
    Rettangolo quadrato = new Quadrato();
    quadrato.setLarghezza(10);
    quadrato.setAltezza(20);
    println(quadrato.calcolaArea()); // risultato 400
}
