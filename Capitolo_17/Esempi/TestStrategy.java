// interfaccia della strategy
interface StrategiaSpedizione {
    double calcolaCosto(double peso);
}

// classi che rappresentano concrete strategy
class SpedizioneStandard implements StrategiaSpedizione {
    public double calcolaCosto(double peso) {
        return 5.0 + peso * 1.0;
    }
}

class SpedizioneEspressa implements StrategiaSpedizione {
    public double calcolaCosto(double peso) {
        return 10.0 + peso * 2.0;
    }
}

class SpedizioneInternazionale implements StrategiaSpedizione {
    public double calcolaCosto(double peso) {
        return 20.0 + peso * 3.0;
    }
}

// contesto (classe Ordine):
class Ordine {
    private StrategiaSpedizione strategia;

    public Ordine(StrategiaSpedizione strategia) {
        this.strategia = strategia;
    }

    public void setStrategia(StrategiaSpedizione strategia) {
        this.strategia = strategia;
    }

    public double calcolaCostoSpedizione(double peso) {
        return strategia.calcolaCosto(peso);
    }
}

// metodo main:
void main(String[] args) {
    Ordine ordine = new Ordine(new SpedizioneStandard());
    System.out.println("Costo spedizione standard: " + ordine.calcolaCostoSpedizione(5.0));

    ordine.setStrategia(new SpedizioneEspressa());
    System.out.println("Costo spedizione espressa: " + ordine.calcolaCostoSpedizione(5.0));

}