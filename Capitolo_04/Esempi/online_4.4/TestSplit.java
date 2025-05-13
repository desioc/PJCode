import java.util.Arrays;

public class TestSplit {
    public static void main(String args[]) {
        String soad = "Serj\tTankian Daron\u2003Malakian\nShavo\u00A0Odadjian\r" 
            + "John Dolmayan" ;
        // "\\s+" seleziona un numero qualsiasi di whitespace come separatore 
        String[] risultato1 = soad.split("\\s+" , 2);  // Limit = 2 => solo 1 split
        String[] risultato2 = soad.split("\\s+" , 4);  // Limit = 4 => 3 split 
        String[] risultato3 = soad.split("\\s+" , -1); // Limit = 0 => nessun limite 
        System.out.println("Limit 2: " + Arrays.toString(risultato1));
        System.out.println("Limit 4: " + Arrays.toString(risultato2));
        System.out.println("Limit -1: " + Arrays.toString(risultato3));

    }
}