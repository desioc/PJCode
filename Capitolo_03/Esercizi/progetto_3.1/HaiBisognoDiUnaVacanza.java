void main() {
    Scanner scanner = new Scanner(System.in);

    println("Quanti giorni sono passati dall'ultima vacanza? ");
    int giorni = scanner.nextInt();

    int minuti = giorni * 24 * 60;

    println("Sono passati " + minuti + " minuti dall'ultima vacanza.");
}
