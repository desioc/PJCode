void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci la lunghezza del lato del quadrato: ");
    double lato = scanner.nextDouble();
    double perimetro = 4 * lato;
    println("Il perimetro del quadrato è: " + perimetro);
}