public abstract class Dipendente {
    private String nome;
    private int stipendio;
    private int matricola;

    public Dipendente(int matricola, String nome){
        setNome(nome);
        setMatricola(matricola);
    }
    
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public int getStipendio() {
        return stipendio;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dipendente that = (Dipendente) o;
        return matricola == that.matricola; // confronto basato sulla matricola
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(matricola); // hash basato sulla matricola
    }
}