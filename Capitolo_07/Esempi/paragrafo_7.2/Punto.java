public final class Punto { // la classe final non si pu� estendere
    private final int x, y;
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public final int getX() { // final non necessario perch� la classe � gi� final
        return x;
    }
    public final int getY() { // final non necessario perch� la la classe � gi� final
        return y;
    }
}