public class Esercizio2_27_OK {

    public int var1;
    public int var2;
    
    public Esercizio2_27_OK() {
        
    }
    
    public Esercizio2_27_OK(int a , int b) {
        var1 = b;
        var2 = a;
    }

    public static void main(String args[]) {
        Esercizio2_27_OK esercizio2_27 = new Esercizio2_27_OK(4,7);
        System.out.println(esercizio2_27.var1);
        System.out.println(esercizio2_27.var2);
    }
  
}
