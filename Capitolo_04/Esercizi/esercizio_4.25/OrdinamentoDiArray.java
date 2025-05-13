void main(String[] args) {
    String [] array = new String[5];
    array[0] = ("Arriva");
    array[1] = ("la");
    array[2] = ("luce");
    array[3] = ("su");
    array[4] = ("Urano");
    println(array); // la stampa di un array non da il risultato sperato proviamo 
    // con un ciclo e stampiamo tutti gli elementi dell'array
    stampaArray(array);
    // non ci resta altro che ordinare gli elementi mediante il metodo sort di Arrays
    Arrays.sort(array);
    println(array); // la stampa di un array non da il risultato sperato proviamo 
    // con un ciclo e stampiamo tutti gli elementi dell'array
    stampaArray(array);
    // L'output e' ordinato secondo l'ordine standard delle stringhe come richiesto:
    // [Arriva, Urano, la, luce, su]
}
// metodo che stampa tutti gli elementi di un array
public static void stampaArray(String a[]) {
    int i = 0;
    while (i < a.length) {
        print(a[i] + " ");
        i++;
    }
    println();

}