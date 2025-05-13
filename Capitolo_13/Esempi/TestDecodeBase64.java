import java.io.*;
import java.util.*;

public class TestDecodeBase64 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Base64.Decoder decoder = Base64.getMimeDecoder();
        try (var fis = new FileInputStream (new File("person.base64"));
             var os = decoder.wrap(fis);
             var ois = new ObjectInputStream(os);) {
            Persona personaDecoded = (Persona)ois.readObject();
            System.out.println("Oggetto deserializzato: " + personaDecoded);
        }
    }
}