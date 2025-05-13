import java.nio.file.*;
import java.net.*;

public class PathMethods {
    public static void main(String args[]) {
        Path pathToTest = Path.of("C:\\", "\\Test");
        System.out.println("Path.of(String first, String... more): " + pathToTest);
        try {
            Path pathToThisFile = Path.of(new URI("file:///PathMethods.java"));
            System.out.println("Path.of(URI uri): " + pathToThisFile);
        } catch (URISyntaxException exc) {
            exc.printStackTrace();
        }
        //Path pathToImaginaryFile = Paths.get("ImaginaryRoot-imaginaryFolder-..-.-..-imaginaryFile");
        //System.out.println("toString: "+pathToImaginaryFile.toString());
        Path desktop = Paths.get("C:\\Users\\user\\.\\Desktop"); // cartella Desktop
        System.out.println("toString: " + desktop.toString());
        System.out.println("normalize: " + desktop.normalize());
        System.out.println("getFileName: " + desktop.getFileName());
        System.out.println("getRoot: " + desktop.getRoot());
        System.out.println("getNameCount: " + desktop.getNameCount());
        System.out.println("getName(0): " + desktop.getName(0));
        System.out.println("subpath(0,2): " + desktop.subpath(0,2));
        System.out.println("getParent: " + desktop.getParent());
        System.out.println("toUri: " + desktop.toUri());
        Path documents = Paths.get("C:\\Users\\user\\Documents"); // cartella Documenti
        System.out.println("desktop.startsWith: " + desktop.startsWith(documents.subpath(0,2)));
        System.out.println("desktop.endsWith: " + desktop.endsWith(documents.subpath(0,2)));
        Path deskToDoc = desktop.relativize(documents);
        System.out.println("path from desktop to documents: " + deskToDoc);
        System.out.println("path resolved documents to desktop: " + desktop.resolve(deskToDoc));
        System.out.println("desktop.equals(documents): " + desktop.equals(documents));
    }
}