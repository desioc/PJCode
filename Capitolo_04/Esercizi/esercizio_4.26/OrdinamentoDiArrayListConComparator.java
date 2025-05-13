void main(String[] args) {
    var list = new ArrayList<String>(); // mischiamo le parole
    list.add("la");
    list.add("Urano");    
    list.add("su");
    list.add("luce");
    list.add("Arriva");
    System.out.println("ArrayList ordinato secondo l'ordine di aggiunta degli elementi\n" + list);
    // per ordinare la collezione possiamo sfruttare il metodo sort di Collections
    Collections.sort(list, new StringComparator());
    System.out.println("ArrayList ordinato secondo il nostro StringComparator\n"  + list); 
    // l'output sarà ordinato come richiesto:
    // [Arriva, la, luce, su, Urano]
}