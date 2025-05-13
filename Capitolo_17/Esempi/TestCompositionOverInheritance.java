// soluzione basata sull'ereditarietà
/* class ListaOrdinata extends ArrayList<String> {
    @Override
    public boolean add(String elemento) {
        boolean aggiunto = super.add(elemento);
        this.sort(String::compareTo);
        return aggiunto;
    }
} */

// soluzione basata sulla composizione
class ListaOrdinata {
    private final List<String> dati = new ArrayList<>();

    public void aggiungi(String elemento) {
        dati.add(elemento);
        dati.sort(String::compareTo);
    }

    public List<String> getDati() {
        return new ArrayList<>(dati); // restituisce una copia
    }
}

void main() {
    var listaOrdinata = new ListaOrdinata();
    listaOrdinata.aggiungi("Stevie Ray");
    listaOrdinata.aggiungi("Buddy Guy");
    listaOrdinata.aggiungi("Bobby Blue");
    println(listaOrdinata.getDati());
}
