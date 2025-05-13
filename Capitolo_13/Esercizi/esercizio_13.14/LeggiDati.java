import java.io.*;

public class LeggiDati {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("nuovo file.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            for (int i = 0; i < 50; i++) {
                int valore = dis.readInt();
                System.out.println(valore);
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura: " + e.getMessage());
        }
    }
}