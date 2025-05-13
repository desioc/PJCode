public class Inizializzazioni {
  public static void main(String args[]) {
    // bit i1 = 8; // Errore: bit non è un tipo valido in Java (esiste byte)
    byte i1 = 8;   // 8 rientra il range del byte che va da tra -128 e 127
    short i2 = -1024; // valore ammesso per il tipo short
    // integer i3 = 638; // Errore: integer non è un tipo valido (esiste int)
    int i3 = 638;       // int è il tipo primitivo corretto
    long i5 = 888_666_777; // valore ammesso per long (uso underscore corretto)
    float i6 = 0; // 0 può essere assegnato a float
    double i7 = 0x11B; // 0x11B è un valore esadecimale che corrisponde a 283
    }
}