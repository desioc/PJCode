void main() {
    double decimale = 26.01; 
    int intero = 74; 
    char carattere = 'C';

    stampaDecimale(decimale);
    stampaIntero(intero);
    stampaCarattere(carattere);
}

void stampaDecimale(double numero) {
    System.out.println("Il numero decimale è: " + numero);
}

void stampaIntero(int numero) {
    System.out.println("Il numero intero è: " + numero);
}

void stampaCarattere(char c) {
    System.out.println("Il carattere è: " + c);
}