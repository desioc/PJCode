public final class Punto { // la classe final non si può estendere
    private final int x, y;
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public final int getX() { // final non necessario perché la classe è già final
        return x;
    }
    public final int getY() { // final non necessario perché la la classe è già final
        return y;
    }
}