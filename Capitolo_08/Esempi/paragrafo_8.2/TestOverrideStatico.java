public class TestOverrideStatico {
  public static void main(String args[]) {
    ClasseConStatic.metodoStatico();      // chiamata metodo originale
    SottoclasseConStatic.metodoStatico(); // chiamata metodo che nasconde l'originale
 }
}

class ClasseConStatic {
  public static void metodoStatico() {      // metodo originale
    System.out.println("Questo è un metodo statico");
  }
}

class SottoclasseConStatic extends ClasseConStatic {
  // @Override // annotazione commentata (non è un vero override)
  public static void metodoStatico() { // metodo che nasconde l'originale (hiding)
    System.out.println("Questo è un metodo statico riscritto");
  }
}
