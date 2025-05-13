import java.util.ArrayList;
import java.util.List;

sealed interface Appoggiabile permits Libro, Computer, Lampada, Penna, PortaPenne {
}

record Libro(String titolo, String autore) implements Appoggiabile {
}

record Computer(String marca, String modello) implements Appoggiabile {
}

record Lampada(String tipo, boolean led) implements Appoggiabile {
}

record Penna(String colore, String tipo) implements Appoggiabile {
}

record PortaPenne(int capacita) implements Appoggiabile {
}

class Scrivania {
    private List<Appoggiabile> oggetti = new ArrayList<>();

    public void appoggia(Appoggiabile oggetto) {
        oggetti.add(oggetto);
    }

    public List<Appoggiabile> getOggetti() {
        return oggetti;
    }
}

class Studente {
    public void usa(Scrivania scrivania) {
        for (Appoggiabile oggetto : scrivania.getOggetti()) {
            switch (oggetto) {
                case Libro libro -> System.out.println("Libro: " + libro.titolo() + ", autore: " + libro.autore());
                case Computer computer -> System.out.println("Computer: " + computer.marca() + ", modello: " + computer.modello());
                case Lampada lampada -> System.out.println("Lampada tipo: " + lampada.tipo() + ", LED: " + lampada.led());
                case Penna penna -> System.out.println("Penna colore: " + penna.colore() + ", tipo: " + penna.tipo());
                case PortaPenne portaPenne -> System.out.println("Portapenne capacità: " + portaPenne.capacita());
                default -> System.out.println("Oggetto sconosciuto sulla scrivania.");
            }
        }
    }
}

public class TestScrivania {
    public static void main(String[] args) {
        Scrivania scrivania = new Scrivania();
        scrivania.appoggia(new Libro("Meridiano di sangue", "Cormac McCarthy"));
        scrivania.appoggia(new Computer("MSI", "PS63"));
        scrivania.appoggia(new Lampada("Scrivania", true));
        scrivania.appoggia(new Penna("Blu", "Sfera"));
        scrivania.appoggia(new PortaPenne(10));

        Studente studente = new Studente();
        studente.usa(scrivania);
    }
}
