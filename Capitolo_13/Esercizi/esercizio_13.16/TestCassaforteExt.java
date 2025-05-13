import java.io.*;

public class TestCassaforteExt {
    public static void main(String[] args) {
        CassaforteExt c = new CassaforteExt("SteelPro", "ModX", 7777);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CassaforteExt.ser"))) {
            oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CassaforteExt.ser"))) {
            CassaforteExt c2 = (CassaforteExt) ois.readObject();
            System.out.println("Oggetto deserializzato: " + c2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
