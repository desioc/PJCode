void main() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Arriva");
    list.add("la");
    list.add("luce");
    list.add("su");
    list.add("Urano");
    println(list); // stampando la lista vedremo che l'ordine degli elementi coincide con l'ordine di inserimento
    // non ci resta altro che ordinare gli elementi mediante il metodo sort di Collections
    Collections.sort(list);
    println(list); // l'output sarà ordinato secondo l'ordine standard delle stringhe come richiesto: 
                   // [Arriva, Urano, la, luce, su]
}