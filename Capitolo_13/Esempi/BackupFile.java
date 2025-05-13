import java.io.*;

public class BackupFile {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Specificare il nome del file!");
            System.exit(0);
        }
        File inputFile = new File(args[0]);
        File outputFile = new File(args[0] + ".backup");
        try (var inputStream = new FileInputStream(inputFile);
             var outputStream = new FileOutputStream(outputFile)) {
            inputStream.transferTo(outputStream);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}