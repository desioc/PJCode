import java.util.Scanner;

public class Esercizio5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Inserisci un numero positivo: ");
            numero = scanner.nextInt();            
            if (numero < 0) {
                System.out.println("Il numero inserito non è positivo. Riprova.");
            }
        } while (numero < 0);
        System.out.println("Hai inserito un numero positivo: " + numero);
        scanner.close();
    }
}