import java.util.HashMap;

public class TestHashMap {
    public static void main(String args[]) {
        HashMap<String, String> rubrica = new HashMap<>();
        rubrica.put("Romeo" , "01234");
        rubrica.put("Giulietta" , "56789");
        String numeroDiRomeo = rubrica.get("Romeo"); // Restituisce "01234"
        System.out.println(numeroDiRomeo);
    }
}