public class TestContenitore {
    public static void main(String args[]) {
        Contenitore<String> contenitoreStringa = new Contenitore<String>("Logan");
        String stringa = contenitoreStringa.getVal();
        Contenitore<Punto> contenitorePunto = new Contenitore<Punto>(new Punto(20,24));
        Punto punto = contenitorePunto.getVal();
        Contenitore<Integer> contenitoreInt = new Contenitore<Integer>(10);
        int intero = contenitoreInt.getVal();
    }
}

record Punto(int x, int y) {}