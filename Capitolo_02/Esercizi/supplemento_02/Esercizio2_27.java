public class Esercizio2_27 {

    public int var1;
    public int var2;

    System.out.println("Esercizio 2.27"); // deve essere all'interno di un metodo

    public Esercizio2R() {
        
    }

    public Esercizio2R(int a , int b) {
        var1 = b;
        var2 = a;
    }

    public static void main(String args[]) {
        Esercizio2_27 esercizio2_27 = new Esercizio2_27 (4,7);
        System.out.println(esercizio2_27.var1);
        System.out.println(esercizio2_27.var2);
    }
}
