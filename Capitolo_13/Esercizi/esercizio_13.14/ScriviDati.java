import java.io.*;

public class ScriviDati {
    public static void main(String args[]) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("nuovo file.txt");
        DataOutputStream dos = new DataOutputStream(fos);) {
            for (int i = 0; i < 50; i++) {
                dos.writeInt(i);
            }
        }
    }
}