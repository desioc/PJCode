// classe Indirizzo da clonare
class Indirizzo implements Cloneable {
    private String citta;

    public Indirizzo(String citta) {
        this.citta = citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCitta() {
        return citta;
    }

    @Override
    public Indirizzo clone() throws CloneNotSupportedException {
        return (Indirizzo) super.clone();
    }
}

// classe Persona da clonare
class Persona implements Cloneable {
    private String nome;
    private Indirizzo indirizzo;

    public Persona(String nome, Indirizzo indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    @Override
    public Persona clone() throws CloneNotSupportedException {
        Persona copia = (Persona) super.clone();
        copia.indirizzo = indirizzo.clone(); // deep clone dell'oggetto interno
        return copia;
    }

    public void mostra() {
        System.out.println("Nome: " + nome + ", città: " 
        + indirizzo.getCitta());
    }
}

// classe del main
public class TestPrototype {
    public static void main(String[] args) {
        try {
            Indirizzo indirizzo = new Indirizzo("Roma");
            Persona p1 = new Persona("Fabio" , indirizzo);
            p1.mostra();
            Persona p2 = p1.clone();
            p2.mostra();

            // modifichiamo l'indirizzo dell'originale
            p1.getIndirizzo().setCitta("Torino");
            p1.mostra();
            p2.mostra(); // rimane indipendente grazie alla clonazione profonda
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}