import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci la base del triangolo: ");
    double base = scanner.nextDouble();
    println("Inserisci l'altezza del triangolo: ");
    double altezza = scanner.nextDouble();
    double area = (base * altezza) / 2;
    println("L'area del triangolo è: " + area);
}