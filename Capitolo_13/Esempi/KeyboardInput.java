import java.io.*;

public class KeyboardInput {
  public static void main(String args[]) throws IOException {
    System.out.println("Digita qualcosa e premi invio\n"
        + "Per terminare il programma digita \"fine\"");
    try (InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(ir)) {
      String stringa; 
      do { 
        stringa = in.readLine(); // metodo che legge premendo il tasto Invio
        if (stringa.equals("fine")) { // condizione di fine programma 
          System.out.println("Programma terminato"); 
          break; 
        } 
        System.out.println("Hai scritto: " + stringa); 
      } while (stringa != null);        
    }
  }
}
