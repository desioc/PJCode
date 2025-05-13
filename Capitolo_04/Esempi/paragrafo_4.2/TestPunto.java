public class TestPunto {
    public static void main(String args[]) {
        Punto p = new Punto(5,9);
        // p.x = 10; // non compila!
        var p1 = new Punto(12,8);
        System.out.println(p1);	// println chiama automaticamente su p1 il metodo toString
    }
}