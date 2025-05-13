public class CloneableClass implements Cloneable {
    private String campo;

    // metodi setter e getter omessi
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Oggetto " + super.toString() + " - " + getCampo();
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getCampo() {
        return campo;
    }
}