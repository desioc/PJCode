public class TestMath {
    public static void main(String args[]) {
        // potenza di 2 elevato a 4: stampa 64.0
        System.out.println(Math.pow(2, 4));
        // radice quadrata di 16: stampa 4
        System.out.println(Math.sqrt(16));
        // valore assoluto di // -128: stampa 128
        System.out.println(Math.abs(-128));
        // arrotondamento per difetto: stampa 3.0
        System.out.println(Math.floor(Math.PI));
        
        //il metodo 
        Math.multiplyExact(100,1000000000);
        //solleverà un’eccezione:
    }
}