public class TestConfrontoStiliIf {
    public static void main(String args[]) {
        int x = 0, y = 1, z = 0;
        // versione 1
        if (x != 0)
            if (y < 10)
                z = 5;
        else	
            z = 7;
        System.out.println(z);
        // versione 2        
        if (x != 0) {
            if (y < 10)
                z = 5;
        } else
            z = 7;
        System.out.println(z);
    }
}
