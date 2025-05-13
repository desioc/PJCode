import java.util.*;

public class TestRicorsione {    
    public static void printList(List<String> list, int index) { // metodo ricorsivo 
        if (index == list.size()) { // se l'indice è uguale alla dimensione della lista
            return;                 // termina la ricorsione
        }        
        System.out.println(list.get(index)); // stampa dell'elemento corrente
        printList(list, index + 1); // chiamata ricorsiva con l'indice incrementato di 1
    }

    public static void main(String[] args) {
        List<String> baroque = List.of("Adagio" , "Canone" , "Air"); // lista di tre elementi
        printList(baroque, 0); // avvia la ricorsione partendo dal primo elemento della lista
    }
}