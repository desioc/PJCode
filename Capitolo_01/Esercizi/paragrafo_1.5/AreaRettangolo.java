void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci la base del rettangolo: ");
    double base = scanner.nextDouble();
    println("Inserisci l'altezza del rettangolo: ");
    double altezza = scanner.nextDouble();
    double area = base * altezza;
    println("L'area del rettangolo è: " + area);
}