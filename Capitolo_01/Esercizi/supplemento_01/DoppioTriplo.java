void main() {
    Scanner input = new Scanner(System.in);

    println("Inserisci un numero intero: ");
    int numero = input.nextInt();

    int doppio = numero * 2;
    int triplo = numero * 3;

    println("Il doppio è: " + doppio);
    println("Il triplo è: " + triplo);
}