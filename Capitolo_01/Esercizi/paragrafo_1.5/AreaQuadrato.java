void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci la lunghezza del lato del quadrato: ");
    double lato = scanner.nextDouble();
    double area = lato * lato;
    println("L'area del quadrato è: " + area);
}
