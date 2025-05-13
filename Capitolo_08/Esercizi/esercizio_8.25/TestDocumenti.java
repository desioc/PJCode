sealed abstract class Documento permits DocumentoPDF, DocumentoExcel, DocumentoWord {
    public static final String TIPO = "Documento";

    public abstract void info();
}

final class DocumentoPDF extends Documento {
    @Override
    public void info() {
        System.out.println("Documento PDF: informazione specifica.");
    }
}

final class DocumentoExcel extends Documento {
    @Override
    public void info() {
        System.out.println("Documento Excel: informazione specifica.");
    }
}

final class DocumentoWord extends Documento {
    @Override
    public void info() {
        System.out.println("Documento Word: informazione specifica.");
    }
}

class DoppioClick {
    public void apri(Documento documento) {
        if (documento == null) {
            System.out.println("Errore: Documento nullo!");
            return;
        }

        switch (documento) {
            case DocumentoPDF pdf -> System.out.println("Sto aprendo il documento con un lettore PDF.");
            case DocumentoExcel excel -> System.out.println("Sto aprendo il documento con Excel.");
            case DocumentoWord word -> System.out.println("Sto aprendo il documento con Word.");
            default -> System.out.println("Tipo di documento sconosciuto.");
        }
    }
}

public class TestDocumenti {
    public static void main(String[] args) {
        DoppioClick doppioClick = new DoppioClick();

        Documento pdf = new DocumentoPDF();
        Documento excel = new DocumentoExcel();
        Documento word = new DocumentoWord();
        Documento nullo = null;

        doppioClick.apri(pdf);
        doppioClick.apri(excel);
        doppioClick.apri(word);
        doppioClick.apri(nullo);
    }
}
