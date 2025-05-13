import java.util.Scanner;

public class ProgrammaInterattivoConModeratore {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita qualcosa e batti enter, oppure scrivi "
          + "\"fine\" per terminare il programma");
        while (!(stringa = scanner.next()).equals("fine")) {
            stringa = moderaStringa(stringa.toLowerCase());
            System.out.println("Hai digitato " + stringa + "!");
        }
        System.out.println("Fine programma!");
    }

    private static String moderaStringa(String stringa) {
        return switch (stringa) {
                   case "perbacco", "stupidino", 
                        "giulivo", "giocondo" -> "Beeeep!";
                   case "accipicchiolina", "perdindirindina" -> "Beeeeeeeep!";
                   default -> stringa;
               };                
        
    }
}