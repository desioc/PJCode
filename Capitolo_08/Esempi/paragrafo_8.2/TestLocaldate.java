import java.time.LocalDate;

public class TestLocaldate {
    public static void main(String args[]) {
        Object obj = LocalDate.now();
        String descrizione = obj.toString(); //invocazione virtuale del metodo
        System.out.println(descrizione);
    }
}