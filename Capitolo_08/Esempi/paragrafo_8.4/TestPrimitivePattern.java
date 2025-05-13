public class TestPrimitivePattern {
    record Punto(int x, int y) { }
    
    public static void main(String args[]) {
        double d = getDouble();
        if (d instanceof byte) {
            System.out.println("Potrebbe essere rappresentato da un byte");
        }
        if (d instanceof byte b) {
            System.out.println(b + " compreso tra -128 e +127");
        } else {
            System.out.println(d + " non compreso tra -128 e +127");
        }
        float f = 16_777_217F;
        System.out.println(f);
        if (f instanceof long intero) {
            System.out.println(intero);
        } else {
            System.out.println(f);
        }
        long num = getLong();
        switch (num) {
            case 0L                              -> System.out.println("Minimo");
            case 10_000_000_000L                 -> System.out.println("Massimo");
            case long x when x > 10_000_000_000L -> System.out.println("troppo alto");            
            case long x when x < 0               -> System.out.println("Non valido");
            case long x                          -> System.out.println("Valido");
        }
    }
    
 
    
    
    public static double getDouble(){
        return 30;
    }
    
    public static long getLong(){
        return 30;
    }
}