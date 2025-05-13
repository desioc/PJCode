public class TestRecordPatterns {
    sealed interface Disegnabile /* permits Punto, Retta (non necessario) */{}
    
    record Punto(int x, int y) implements Disegnabile {}
    
    record Retta(Punto p1, Punto p2) implements Disegnabile {}
    
    //record Poligono(Retta... p) implements Disegnabile {}
    
    public static String getCoordinate(Disegnabile disegnabile) {
        return switch(disegnabile) {
            case null -> "Null!";
            case Punto(int x, int y) -> "Punto P(" + x + ", " + y + ")";
            case Retta(Punto(int x1, int y1), Punto(int x2, int y2)) -> 
                "Retta R[P1(" + x1 + ", " + y1 + "), " + 
                "P2(" + x2 + ", " + y2 + ")]";
        } ;
    }
    
    public static int getAltezza(Disegnabile disegnabile) {
        return switch(disegnabile) {
            case null -> 0;
            case Punto _ -> 0;
            case Retta(Punto(var x1, var _), Punto(int x2, int _)) -> Math.abs(x1 - x2);
        };
    }

    public static void main(String args[]) {
        System.out.println(getCoordinate(new Punto(2,6)));
        System.out.println(getCoordinate(new Retta(new Punto(2,6), new Punto(7,4))));
        System.out.println("Altezza punto = " + getAltezza( new Punto(2,6)));
        System.out.println("Altezza retta = " + getAltezza(new Retta(new Punto(2,6), new Punto(7,4))));
    }
    
    public static String getInfo(Object object) {
        return switch (object) {
            case null -> "Null!";
            case Punto(int x, int y) -> "x = " + x + ", y = " + y;
            case Integer i when i < 0 -> "Negative integer"; // guarded pattern
            case Integer i -> "Positive integer";            // raccoglie tutti gli interi >= 0
            case String s -> "String of length " + s.length();
            default -> "Unknown";
        } ;
    }
}