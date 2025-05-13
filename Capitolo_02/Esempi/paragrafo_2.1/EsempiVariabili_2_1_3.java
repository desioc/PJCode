void main() {
    int numero = 1;

    numero = 7; // la variabile ora vale 7
    numero = 29; // la variabile ora vale 29

    int a = 1;
    int b = 2;
    a = b;

    String nome = "Daniele";
    double chilometri = 10.08;
    boolean luceAccesa = true;

    char letteraA = 'A';
    char primoElemento1 = letteraA;

    // inserendo queste variabili in questo blocco non saranno visibili
    // all'esterno, permettendoci di dichiararle nuovamente dopo
    {
        double prezzo = 3.2;
        int numeroArticoli = 12;
        double risultato = prezzo * numeroArticoli;
        println(risultato);
    }
    int numeroStudenti = 25;
    println(numeroStudenti);

    int anni;               // valori interi assegnabili: 7, -1, 999999, ecc.
    char carattere;         // valori carattere assegnabili: 'd', '@', '9', '?', '+', '0', '~' ecc.
    double prezzo;          // valori decimali assegnabili: 3.14, -2000.12, 50.0, 99,99 ecc.
    String messaggio;       // valori stringa assegnabili: "Ciao!", "(x-1)/2", " " ecc.

    //int anni;
    int mesi;
    char lettera;
    boolean finito;

    //int anni, mesi;

    anni = 16;
    mesi = 2;
    lettera = 'A';
    prezzo = 10.2;
    messaggio = "Ciao mondo!";
    finito = true;
    
    char variabileNonInizializzata;
   //println(variabileNonInizializzata); (non compila)

}