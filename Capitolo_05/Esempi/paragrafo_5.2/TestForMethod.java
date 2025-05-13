public class TestForMethod {
    public static void main(String args[]) {
        new TestForMethod().forMethod(5);
    }
    public void forMethod(int j) { // il parametro è visibile in tutto il metodo 
        int i; // variabile locale visibile nel metodo (non solo nel ciclo for)
        for (i = 0; i < j; ++i) {
            System.out.println(i);
        }
        System.out.println("Numero iterazioni = " + i);
    }

}