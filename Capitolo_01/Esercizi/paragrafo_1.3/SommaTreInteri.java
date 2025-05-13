static void main() {
    println("Ciao, so sommare tre numeri interi.");
    println("Scrivi il primo valore e batti invio");
    Scanner keyboardScanner = new Scanner(System.in);
    int operatore1 = keyboardScanner.nextInt();
    println("Scrivi il secondo valore e batti invio");
    int operatore2 = keyboardScanner.nextInt();
    println("Scrivi il terzo valore e batti invio");
    int operatore3 = keyboardScanner.nextInt();
    int risultato = operatore1 + operatore2 + operatore3;
    println("Il risultato è:");
    println(risultato);
}