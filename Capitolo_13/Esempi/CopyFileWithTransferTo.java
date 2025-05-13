import java.io.*;

public class CopyFileWithTransferTo {
    public static void main(String args[]) {
        try (InputStream inputStream = new FileInputStream("C:\\primoFile");
             OutputStream outputStream = new FileOutputStream("C:\\secondoFile")) {
            //  try (InputStream inputStream = new FileInputStream(new File("C:\\primoFile"));    (versione con classe file)
            //       OutputStream outputStream = new FileOutputStream(new File("C:\\secondoFile"))) {               
            inputStream.transferTo(outputStream);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}