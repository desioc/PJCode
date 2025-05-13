class Esterna {                                                 // classe esterna
    protected class Interna { }                                   // classe interna
}

class SottoclasseDiEsterna extends Esterna { }          // eredita classe interna

public class TestEredInnestata {
    public static void main(String args[]) {
        var sde = new SottoclasseDiEsterna();         //istanza della sottoclasse
        sde.new Interna(); // istanza della classe interna tramite la sottoclasse
    }
}

