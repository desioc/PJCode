public class Cliente {
    private String nome, indirizzo, numeroDiTelefono;    // variabili d’istanza private
    public Cliente (String nome, String indirizzo) { // costruttore 1
        this(nome, "sconosciuto", "sconosciuto");
    }
    public Cliente(String nome, String indirizzo, String numeroDiTelefono) { // costruttore 2
        this.setNome(nome);
        this.setIndirizzo(indirizzo);
        this.setNumeroDiTelefono(numeroDiTelefono);
    }

    public void setNome(String nome) {
        //nome = nome; 			// niente this!
        this.nome = nome;
    }
    
    public void setIndirizzo(String indirizzo) {
        //nome = nome; 			// niente this!
        this.indirizzo = indirizzo;
    }
    
    public void setNumeroDiTelefono(String numeroDiTelefono) {
        //nome = nome; 			// niente this!
        this.numeroDiTelefono = numeroDiTelefono;
    }
    // resto del codice omesso
}
