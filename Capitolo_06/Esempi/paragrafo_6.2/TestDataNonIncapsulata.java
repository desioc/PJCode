import java.util.Scanner;

public class TestDataNonIncapsulata {
    public static void main(String args[]) {
        
        // codice 6.1
     /* DataNonIncapsulata unaData = new DataNonIncapsulata();
        unaData.giorno = 14;
        unaData.mese = 4;
        unaData.anno = 2004;
        System.out.println("Data: " + unaData.giorno + "-" + unaData.mese + "-" 
            + unaData.anno); */  // stampa 14-4-2004
            
        // codice 6.2
        Scanner scanner = new Scanner(System.in);
        DataNonIncapsulata unaData = new DataNonIncapsulata();
        System.out.println("Inserire il giorno e premere invio");
     /* int valore = scanner.nextInt(); // soluzione provvisoria non corretta
        if (valore > 0 && valore < 31) {
            unaData.giorno = valore;
        } */
        unaData.giorno = scanner.nextInt();
        System.out.println("Inserire il mese e premere invio");
        unaData.mese = scanner.nextInt();
        System.out.println("Inserire l'anno e premere invio");
        unaData.anno = scanner.nextInt();
        System.out.println("Data: " + unaData.giorno + "-" + unaData.mese + "-" + unaData.anno);
        scanner.close();    // un oggetto scanner andrebbe sempre chiuso
    }
}