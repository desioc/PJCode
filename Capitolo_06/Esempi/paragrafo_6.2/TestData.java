import java.util.Scanner;

public class TestData {
    public static void main(String args[]) {
        // codice 6.1bis
     /* Data unaData = new Data();
        unaData.setGiorno(14);
        unaData.setMese(4);
        unaData.setAnno(2004);
        System.out.println("Data: " + unaData.getGiorno() + "-" + unaData.getMese() + "-" 
           + unaData.getAnno()); */ 
        Scanner scanner = new Scanner(System.in);
        Data unaData = new Data();
        System.out.println("Inserire il giorno e premere invio");
        unaData.setGiorno(scanner.nextInt());
        System.out.println("Inserire il mese e premere invio");
        unaData.setMese(scanner.nextInt());
        System.out.println("Inserire l'anno e premere invio");
        unaData.setAnno(scanner.nextInt());
        System.out.println("Data: " + unaData.getGiorno() + "-" + unaData.getMese() + "-" + unaData.getAnno());
        scanner.close();    // un oggetto scanner andrebbe sempre chiuso
    }
}