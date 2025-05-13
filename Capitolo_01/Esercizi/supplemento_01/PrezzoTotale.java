void main() {
    Scanner input = new Scanner(System.in);

    println("Inserisci il numero di articoli acquistati: ");
    int quantita = input.nextInt();

    println("Inserisci il prezzo (in euro) di ciascun articolo: ");
    int prezzo = input.nextInt();

    int totale = quantita * prezzo;

    println("Hai acquistato " + quantita + " articoli da " + prezzo + " euro ciascuno.");
    println("Prezzo totale in euro: " + totale + " euro");
}