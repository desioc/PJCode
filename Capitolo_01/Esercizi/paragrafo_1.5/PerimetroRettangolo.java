void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci la base del rettangolo: ");
    double base = scanner.nextDouble();
    println("Inserisci l'altezza del rettangolo: ");
    double altezza = scanner.nextDouble();
    double perimetro = 2 * (base + altezza);
    println("Il perimetro del rettangolo è: " + perimetro);
}