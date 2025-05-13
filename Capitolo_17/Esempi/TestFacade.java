class DecoderAudio {
    public void accendi() {
        System.out.println("Decoder audio acceso");
    }
}

class DecoderVideo {
    public void accendi() {
        System.out.println("Decoder video acceso");
    }
}

class GestoreSottotitoli {
    public void carica() {
        System.out.println("Sottotitoli caricati");
    }
}

// classe Facade
public class SistemaHomeTheater {
    private DecoderAudio audio;
    private DecoderVideo video;
    private GestoreSottotitoli sottotitoli;

    public SistemaHomeTheater() {
        this.audio = new DecoderAudio();
        this.video = new DecoderVideo();
        this.sottotitoli = new GestoreSottotitoli();
    }

    public void avviaFilm() {
        audio.accendi();
        video.accendi();
        sottotitoli.carica();
        System.out.println("Film avviato");
    }
}

// metodo main
void main() {
    SistemaHomeTheater homeTheater = new SistemaHomeTheater();
    homeTheater.avviaFilm();
}
