import java.io.IO;

public class TestCopyWithIO {
    public static void main(String[] args) {
        String testo = IO.readln("Scrivi qualcosa e premi il tasto invio\n");
        IO.println("Hai scritto " + testo);
    }
}
