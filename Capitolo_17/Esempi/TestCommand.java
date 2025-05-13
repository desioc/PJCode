// interfaccia command
public interface Comando {
    void esegui();
}

// classe receiver
public class Documento {
    public void copia() {
        System.out.println("Documento copiato.");
    }

    public void incolla() {
        System.out.println("Documento incollato.");
    }
}

// comandi concreti
public class CopiaComando implements Comando {
    private Documento documento;

    public CopiaComando(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void esegui() {
        documento.copia();
    }
}

public class IncollaComando implements Comando {
    private Documento documento;

    public IncollaComando(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void esegui() {
        documento.incolla();
    }
}

// classe invoker
public class Editor {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void eseguiComando() {
        if (comando != null) {
            comando.esegui();
        }
    }
}

// metodo main
void main() {
    Documento documento = new Documento();
    Editor editor = new Editor();

    Comando copia = new CopiaComando(documento);
    Comando incolla = new IncollaComando(documento);

    editor.setComando(copia);
    editor.eseguiComando();

    editor.setComando(incolla);
    editor.eseguiComando();
}