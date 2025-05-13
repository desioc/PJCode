void main() {
    Scanner scanner = new Scanner(System.in);
    println("Inserisci il tuo anno di nascita: ");
    int annoNascita = scanner.nextInt();
    int annoCorrente = Year.now().getValue();
    int eta = annoCorrente - annoNascita;
    println("Hai " + eta + " anni.");
}
