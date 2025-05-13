import java.util.Scanner;

public class InserimentoDiUnNumeroPositivo {
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
// versione con metodo main
void main() {
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