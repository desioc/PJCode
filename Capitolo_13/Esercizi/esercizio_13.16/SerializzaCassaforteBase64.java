import java.io.*;
import java.util.Base64;

public class SerializzaCassaforteBase64 {
    public static void main(String[] args) {
        Cassaforte c = new Cassaforte("SecureSafe", "X1000", 1234);

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos);
             FileWriter writer = new FileWriter("Cassaforte.base64")) {

            oos.writeObject(c);
            String encoded = Base64.getEncoder().encodeToString(baos.toByteArray());
            writer.write(encoded);

            System.out.println("Cassaforte serializzata in Base64");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
