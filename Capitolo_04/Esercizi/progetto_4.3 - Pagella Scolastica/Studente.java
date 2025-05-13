public record Studente(String nome, String cognome, String classe) {
    public String toString() {
        return "Studente: "+ nome +" "+ cognome +"\nClasse "+ classe;
    }
}
