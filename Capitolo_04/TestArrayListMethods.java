import java.util.*;

public class TestArrayListMethods {
    public static void main(String args[]) {
        var alfabeto = new ArrayList<String>();
        int i = 65;       // 65 corrisponde alla lettera 'A'
        while (i <= 90) { // ciclo che termina se i supera il valoreer 90 (lettera 'Z')
            alfabeto.add("" +(char)i);     // aggiunta delle 26 lettere dell’alfabeto
            i++;                           // incremento di i
        }
        System.out.println("Arraylist originale"); 
        stampaArrayList(alfabeto);
        alfabeto.add(0, "@");         // aggiunto "@" al posto 0
        int indexOfS = alfabeto.indexOf("S"); // restituisce l'indice di "S"
        alfabeto.set(indexOfS, "$");  // sovrascrive la "S" con "$"
        if (alfabeto.contains("A")) { // se alfabeto contiene "A"
            alfabeto.remove("A");     // rimuovi "A"
        }
        List<String> sublist = alfabeto.subList(0,19);  // restituisce una sotto lista
        String[] array = sublist.toArray(new String[0]); // estrazione array dalla lista
        System.out.println("\nNuovo array");
        stampaArray(array);
        alfabeto.clear();    // cancellazione elementi dell'array
        stampaArrayList(alfabeto);
    }

    // metodo che stampa una lista
    public static void stampaArrayList(List<String> alfabeto) {
        if (alfabeto.isEmpty()) {
            System.out.println("\nArraylist vuoto!");
        } else {
            int i = 0;
            while (i < alfabeto.size()) { // ciclo che termina dopo l'ultimo elemento
                System.out.print(alfabeto.get(i) + " "); // stampa lettera e uno spazio
                i++;
            }
        }
    }

    // metodo che stampa una array
    public static void stampaArray(String[] alfabeto) {
        if (alfabeto.length == 0) {
            System.out.println("\nArray vuoto!");
        } else {
            int i = 0;
            while (i < alfabeto.length) { // ciclo che termina dopo l'ultimo elemento
                System.out.print(alfabeto[i] + " "); // stampa lettera e uno spazio
                i++;
            }
        }
    }
} 
