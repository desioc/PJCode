import java.util.*;

public class TestArrayListMethods {
  public static void main(String args[]) {
    var alfabeto = new ArrayList<String>();
    // 65 corrisponde alla lettera 'A'
    int i = 65;                   		
    // ciclo termina se si supera il valore 90 (lettera 'Z')
    while (i <= 90) { 	
      // aggiungiamo le 26 lettere dell'alfabeto americano
      alfabeto.add("" +(char)i);
      i++; // incrementiamo la variabile i      		
    }
    System.out.println("Arraylist originale"); 
    stampaArrayList(alfabeto);
    // aggiungiamo "@" alposto 0
    alfabeto.add(0, "@");         		
    // recuperiamo l'indice di "S"
    int indexOfS = alfabeto.indexOf("S"); 	
    // sovrascriviamo la "S" con "$"
    alfabeto.set(indexOfS, "$");  		
    // se alfabeto contiene "A" rimuovi "A"
    if (alfabeto.contains("A")) { 		
      alfabeto.remove("A");      		
    }
    // recuperiamo una sotto lista
    List<String> sublist = alfabeto.subList(0,19);  
    // estraiamo un array dalla lista
    String[] array = sublist.toArray(new String[0]);
    System.out.println("\nNuovo array");
    stampaArray(array);
    // cancelliamo gli elementi dell'array
    alfabeto.clear();    			
    stampaArrayList(alfabeto);
  }
  
  // metodo che stampa una lista
  public static void stampaArrayList(List<String> alfabeto) {
    if (alfabeto.isEmpty()) {
      System.out.println("\nArraylist vuoto!");
    } else {
      int i = 0;
      // ciclo che termina superato l'ultimo elemento
      while (i < alfabeto.size()) { 
        // stampiamo una lettera e uno spazio
        System.out.print(alfabeto.get(i) + " ");	
        i++;
      }
    }
  }
  
  // metodo che stampa un array
  public static void stampaArray(String[] alfabeto) {
    if (alfabeto.length == 0) {
      System.out.println("\nArray vuoto!");
    } else {
      int i = 0;
      // ciclo che termina superato l'ultimo elemento
      while (i < alfabeto.length) { 
        // stampiamo una lettera e uno spazio
        System.out.print(alfabeto[i] + " "); 	
        i++;
      }
    }
  }
}