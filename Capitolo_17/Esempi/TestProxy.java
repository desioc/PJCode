// interfaccia comune
interface Immagine {
    void mostra();
}

// oggetto reale (ImmagineReale)
class ImmagineReale implements Immagine {
    private String nomeFile;

    public ImmagineReale(String nomeFile) {
        this.nomeFile = nomeFile;
        caricaDaDisco();
    }

    private void caricaDaDisco() {
        System.out.println("Caricamento immagine: " + nomeFile);
    }

    @Override
    public void mostra() {
        System.out.println("Visualizzazione immagine: " + nomeFile);
    }
}

// Proxy (ProxyImmagine)
class ProxyImmagine implements Immagine {
    private String nomeFile;
    private ImmagineReale immagineReale;

    public ProxyImmagine(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    @Override
    public void mostra() {
        if (immagineReale == null) {
            immagineReale = new ImmagineReale(nomeFile);
        }
        immagineReale.mostra();
    }
}

// metodo main
void main(String[] args) {
    Immagine immagine = new ProxyImmagine("foto_vacanze.jpg");

    // immagine non caricata ancora...
    println("Alcune operazioni preliminari...");

    // solo ora l'immagine viene caricata da disco
    immagine.mostra();
}