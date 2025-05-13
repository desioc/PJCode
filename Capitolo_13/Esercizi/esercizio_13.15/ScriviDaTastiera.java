import java.io.*;

public class ScriviDaTastiera {
    public static void main(String[] args) {
        System.out.println("Scrivi del testo (digita 'fine' per terminare):");

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.equalsIgnoreCase("fine")) {
                    break;
                }
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Contenuto salvato nel file output.txt");
        } catch (IOException e) {
            System.err.println("Errore durante lettura/scrittura: " + e.getMessage());
        }
    }
}
