void main() {
    Scanner input = new Scanner(System.in);

    println("Inserisci l'età del primo amico: ");
    int eta1 = input.nextInt();

    println("Inserisci l'età del secondo amico: ");
    int eta2 = input.nextInt();

    int somma = eta1 + eta2;
    int differenza = eta1 - eta2;

    println("La somma delle età è: " + somma);
    println("La differenza tra le età è: " + differenza);
}
