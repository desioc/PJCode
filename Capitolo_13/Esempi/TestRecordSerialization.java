import java.io.*;

public class TestRecordSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var artista = new Artista ("Robert", "Schumann", 46);
        try (var fos = new FileOutputStream("artista.ser");
             var oos = new ObjectOutputStream(fos)) {
            oos.writeObject(artista); // serializzazione
        }
        try (var fis = new FileInputStream("artista.ser");
             var ois = new ObjectInputStream(fis)) {
            Artista deserialized = (Artista) ois.readObject(); // deserializzazione
            System.out.println("Oggetto deserializzato: " + deserialized);
        }
    }
}
