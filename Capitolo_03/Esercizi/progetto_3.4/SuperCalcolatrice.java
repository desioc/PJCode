import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class SuperCalcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona un'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");

        int codiceOperazione = scanner.nextInt();

        System.out.println("Inserisci il primo numero:");
        String num1 = scanner.next();
        if (codiceOperazione != 5 && codiceOperazione != 6) {
            System.out.println("Inserisci il secondo numero:");
        }
        String num2 = scanner.next();

        if (codiceOperazione == 1) {
            System.out.println("Risultato: " + somma(num1, num2));
        } else if (codiceOperazione == 2) {
            System.out.println("Risultato: " + sottrai(num1, num2));
        } else if (codiceOperazione == 3) {
            System.out.println("Risultato: " + moltiplica(num1, num2));
        } else if (codiceOperazione == 4) {
            if (num2.compareTo("0") == 0) { // controllo divisore = 0
                System.out.println("Errore: divisione per zero non consentita.");
            } else {
                System.out.println("Risultato: " + dividi(num1, num2));
            }
        } else {
            System.out.println("Scelta non valida.");
        }
    }

    private static BigInteger somma(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.add(n2);
    }

    private static BigInteger sottrai(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.subtract(n2);
    }

    private static BigInteger moltiplica(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2);
    }

    private static BigDecimal dividi(String num1, String num2) {
        BigDecimal n1 = new BigDecimal(num1);
        BigDecimal n2 = new BigDecimal(num2);
        return n1.divide(n2, 10, RoundingMode.HALF_UP);
    }
}