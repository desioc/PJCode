import java.io.*;
import java.util.*;

public class TestEncodeBase64 {
    public static void main(String args[]) throws IOException {
        Base64.Encoder encoder = Base64.getMimeEncoder();
        Persona p = new Persona ("Sergej", "Rachmaninov" , "xxx");
        try (var fos = new FileOutputStream(new File("person.base64"));
        var os = encoder.wrap(fos);
        var oos = new ObjectOutputStream (os);) {
            oos.writeObject (p);
            System.out.println("Oggetto serializzato: " + p);
        }
    }
}