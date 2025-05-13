import java.io.*;
import java.util.*;

public class TestStringReader {
    public static void main(String args[]) throws IOException{
        char[] cbuf = new char[4]; // array di caratteri dove inserire i caratteri letti
        Reader reader = new StringReader("Java");  // StringReader legge stringhe
        int bytesRead = reader.read(cbuf, 1, 2);   // bytesRead vale 2
        System.out.println(Arrays.toString(cbuf)); // stampa [, J, a, ]
    }
}