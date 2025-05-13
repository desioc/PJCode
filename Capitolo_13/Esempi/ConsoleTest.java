import java.io.*;

public class ConsoleTest {
    public static void main(String args[]) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Please launch this class from command line");
            return;
        }
        System.out.println("Enter password");
        char[] password;
        if ((password = console.readPassword()) != null) {
            System.out.print("Password = ");
            System.out.print(password);
        }
    }
}
