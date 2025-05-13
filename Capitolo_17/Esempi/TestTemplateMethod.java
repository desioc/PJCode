// classe astratta che definisce il template
abstract class Documento {
    public final void generaDocumento() {
        apri();
        scriviContenuto();
        chiudi();
    }

    protected void apri() {
        System.out.println("Apro il documento...");
    }

    protected abstract void scriviContenuto(); // da implementare nelle sottoclassi

    protected void chiudi() {
        System.out.println("Chiudo il documento...");
    }
}

// implementazione concreta per PDF
class DocumentoPDF extends Documento {
    @Override
    protected void scriviContenuto() {
        System.out.println("Scrivo contenuto in formato PDF");
    }
}

// implementazione concreta per HTML
class DocumentoHTML extends Documento {
    @Override
    protected void scriviContenuto() {
        System.out.println("Scrivo contenuto in formato HTML");
    }
}

// metodo main
void main(String[] args) {
    Documento doc1 = new DocumentoPDF();
    doc1.generaDocumento();

    Documento doc2 = new DocumentoHTML();
    doc2.generaDocumento();
}