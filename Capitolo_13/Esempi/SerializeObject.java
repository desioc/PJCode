import java.io.*;

public class SerializeObject {
    public static void main(String args[]) throws IOException {
        Persona p = new Persona("Claudio", "De Sio Cesari", "xxx");
        try (var f = new FileOutputStream(new File("persona.ser"));
             var s = new ObjectOutputStream(f);) {
            s.writeObject(p);
            System.out.println("Oggetto serializzato!");
        }
    }
}
