public class TestVar {
    public static void main(String args[]) {
        //LibroSuJava ogg1 = new LibroSuJava();
        var ogg1 = new LibroSuJava();
        var ogg2 = getIstanza();
        //altri esempi
        var var = 1;    // è equivalente a int var = 1;
        // i seguenti esempi non compilano
        // var notInitialized;  
        // var nullInitialized = null;
        // var var1 = 1, var2 = 2;
    }

    public static LibroSuJava getIstanza() { 
        return new LibroSuJava(); 
    }

}

class LibroSuJava {
    /*   omesso il codice visto che questa è classe di supporto all'esempio
    (nota: è possibile creare più di una classe in un file sorgente) */
}