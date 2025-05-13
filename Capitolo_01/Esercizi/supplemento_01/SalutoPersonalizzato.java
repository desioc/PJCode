void main() {
    Scanner input = new Scanner(System.in);

    println("Inserisci il tuo nome:");
    String nome = input.nextLine();

    println("Inserisci il tuo cognome:");
    String cognome = input.nextLine();

    println("Benvenuto, " + cognome + " " + nome + "!");
}