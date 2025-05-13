public class TestTryCatch {
    public static void main(String args[]) {
        String stringa = produciStringa();                         // produciStringa ritornerà null
        try {                                                      // inizio blocco try-catch
            int length = stringa.length();                         // qui viene lanciata l’eccezione
            System.out.println("Lunghezza stringa: "  + length);   // non viene eseguita
        } catch (NullPointerException e) {                         // catturiamo la NullPointerException
            System.out.println("Impossibile utilizzare null");     // gestiamo l’eccezione
        }
        System.out.println("Eccezione gestita, il programma continua");
    }
    
    public static String produciStringa() {
        return null;
    }
}