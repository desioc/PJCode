public class TestEccezioni {
    public static void main(String args[]) {
        String stringa = produciStringa();
        int length = stringa.length(); // qui viene lanciata l’eccezione
        try { // inizio blocco try-catch
            System.out.println("Lunghezza stringa: "  + length); // non viene eseguita
        } catch (NullPointerException e) {// catturiamo la NullPointerException
            System.out.println("Impossibile utilizzare null"); // gestiamo l’eccezione
        }
        System.out.println("Eccezione gestita, il programma continua");
    }

    public static String produciStringa() {
        return null;
    }
}