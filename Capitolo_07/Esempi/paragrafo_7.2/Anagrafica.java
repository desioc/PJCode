public class Anagrafica {
    private String nome, cognome;
    public Anagrafica (String nome, String cognome) {
        setNome(nome);
        setCognome(cognome);
    }
    public void stampaDati() {
        System.out.println(nome + " " + cognome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String toString() {
        return nome + " " + cognome;
    }
}