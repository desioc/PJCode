import java.io.*;

public class TestCassaforteSer {
    public static void main(String[] args) {
        CassaforteSer c = new CassaforteSer("Blindato", "Z300", 9999);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CassaforteSer.ser"))) {
            oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CassaforteSer.ser"))) {
            CassaforteSer c2 = (CassaforteSer) ois.readObject();
            System.out.println("Oggetto deserializzato: " + c2); // combinazione sarà 0
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
