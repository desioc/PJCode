import java.util.Stack;

// classe Memento (oggetto che salva lo stato)
class DocumentoMemento {
    private final String contenuto;

    public DocumentoMemento(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getContenuto() {
        return contenuto;
    }
}

// classe Originator (oggetto di cui salvare lo stato)
class Documento {
    private String contenuto = "" ;

    public void scrivi(String testo) {
        contenuto += testo;
    }

    public DocumentoMemento salva() {
        return new DocumentoMemento(contenuto);
    }

    public void ripristina(DocumentoMemento memento) {
        contenuto = memento.getContenuto();
    }

    public void mostra() {
        System.out.println(contenuto);
    }
}

// classe Caretaker (oggetto che gestisce i memento)
public class Storico {
    private Stack<DocumentoMemento> cronologia = new Stack<>();

    public void salva(Documento documento) {
        cronologia.push(documento.salva());
    }

    public void annulla(Documento documento) {
        if (!cronologia.isEmpty()) {
            documento.ripristina(cronologia.pop());
        }
    }
}

// metodo main
void main() {
    Documento documento = new Documento();
    Storico storico = new Storico();

    documento.scrivi("Ciao");
    storico.salva(documento);

    documento.scrivi(" a tutti!");
    storico.salva(documento);

    documento.scrivi(" Come va?");
    documento.mostra(); // Ciao a tutti! Come va?

    storico.annulla(documento);
    documento.mostra(); // Ciao a tutti!

    storico.annulla(documento);
    documento.mostra(); // Ciao
}