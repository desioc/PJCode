import java.util.Scanner;

void main() {
    println("Ciao, so moltiplicare due numeri interi.");
    println("Scrivi il primo valore e premi invio");
    Scanner keyboardScanner = new Scanner(System.in);
    int input1;
    input1 = keyboardScanner.nextInt();
    println("Scrivi il secondo valore e premi invio");
    int input2 = keyboardScanner.nextInt();
    int risultato = input1 * input2;
    println("Il risultato è:");
    println(risultato);
}
