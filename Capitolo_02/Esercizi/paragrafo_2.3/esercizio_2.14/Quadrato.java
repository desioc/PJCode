class Quadrato {
    int lato;

    Quadrato(int lato) {
        this.lato = lato;
    }

    public int perimetro() {
        return 4 * lato;
    }

    public int area() {
        return lato * lato;
    }
}
