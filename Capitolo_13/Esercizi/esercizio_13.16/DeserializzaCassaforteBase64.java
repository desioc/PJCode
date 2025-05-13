import java.io.*;
import java.util.Base64;

public class DeserializzaCassaforteBase64 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Cassaforte.base64"))) {
            String encoded = reader.readLine();
            byte[] data = Base64.getDecoder().decode(encoded);

            try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
                Cassaforte c = (Cassaforte) ois.readObject();
                System.out.println("Oggetto deserializzato: " + c);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
