// interfaccia component
interface ComponenteTesto {
    String stampa();
}

// concrete component (TestoSemplice):
class TestoSemplice implements ComponenteTesto {
    private String testo;

    public TestoSemplice(String testo) {
        this.testo = testo;
    }

    @Override
    public String stampa() {
        return testo;
    }
}

// classe astratta Decorator:
abstract class DecoratoreTesto implements ComponenteTesto {
    protected ComponenteTesto componente;

    protected DecoratoreTesto(ComponenteTesto componente) {
        this.componente = componente;
    }
}

// concrete decorator (TestoGrassetto):
class TestoGrassetto extends DecoratoreTesto {

    public TestoGrassetto(ComponenteTesto componente) {
        super(componente);
    }

    @Override
    public String stampa() {
        return "<b>" + componente.stampa() + "</b>";
    }
}

// concrete decorator (TestoCorsivo):
class TestoCorsivo extends DecoratoreTesto {

    public TestoCorsivo(ComponenteTesto componente) {
        super(componente);
    }

    @Override
    public String stampa() {
        return "<i>" + componente.stampa() + "</i>";
    }
}

// metodo main
void main() {
    ComponenteTesto testo = new TestoSemplice("Ciao mondo");
    // Applichiamo decorazioni dinamicamente
    ComponenteTesto testoDecorato = new TestoGrassetto(
        new TestoCorsivo(testo)
    );

    System.out.println(testoDecorato.stampa());
}