public class Cliente extends Anagrafica {
    private String indirizzo, telefono;
    public Cliente (String nome, String cognome, String indirizzo,
            String telefono){
        super(nome, cognome);
        setIndirizzo(indirizzo);
        setTelefono(telefono);
    }
    @Override                    // annotazione (cfr. paragrafo 4.2.5)
    public void stampaDati () {  // facciamo override (riscriviamo) del metodo
        super.stampaDati();      // richiamiamo il metodo della superclasse
        System.out.println(indirizzo + "\nTel: " + telefono);
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // metodi mutator omessi
    @Override public String toString() {
      return super.toString() + "\n" + indirizzo + "\nTel: " + telefono;
    }
}
