// abstract product
interface Paragrafo {
    void mostra();
}
// abstract product
interface Tabella {
    void mostra();
}

// concrete product - PDF
class ParagrafoPDF implements Paragrafo {
    public void mostra() {
        System.out.println("Paragrafo in PDF");
    }
}


// concrete product - PDF
class TabellaPDF implements Tabella {
    public void mostra() {
        System.out.println("Tabella in PDF");
    }
}

// concrete product - HTML
class ParagrafoHTML implements Paragrafo {
    public void mostra() {
        System.out.println("Paragrafo in HTML");
    }
}

// concrete product - HTML
class TabellaHTML implements Tabella {
    public void mostra() {
        System.out.println("Tabella in HTML");
    }
}

// abstract factory
interface DocumentFactory {
    Paragrafo creaParagrafo();
    Tabella creaTabella();
}

// concrete factory - PDF
class PDFDocumentFactory implements DocumentFactory {
    public Paragrafo creaParagrafo() {
        return new ParagrafoPDF();
    }

    public Tabella creaTabella() {
        return new TabellaPDF();
    }
}

// concrete factory - HTML
class HTMLDocumentFactory implements DocumentFactory {
    public Paragrafo creaParagrafo() {
        return new ParagrafoHTML();
    }

    public Tabella creaTabella() {
        return new TabellaHTML();
    }
}

// classe che fa da client
class Documento {
    private Paragrafo paragrafo;
    private Tabella tabella;

    public Documento(DocumentFactory factory) {
        this.paragrafo = factory.creaParagrafo();
        this.tabella = factory.creaTabella();
    }

    public void mostra() {
        paragrafo.mostra();
        tabella.mostra();
    }
}

// metodo main
void main() {
    DocumentFactory factory = new PDFDocumentFactory(); // oppure new 
                                                        // HTMLDocumentFactory
    Documento documento = new Documento(factory);
    documento.mostra();

}
