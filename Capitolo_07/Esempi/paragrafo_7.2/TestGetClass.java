import java.lang.reflect.*;
import java.time.Month;
public class TestGetClass {
    public static void main(String args[]) {
        Class<?> classeObject = "Oggetto di tipo String".getClass();
        Method[] metodi = classeObject.getMethods(); // recupera i metodi visibili di String
        for (Method metodo : metodi) {  // stampa tutti i nomi dei metodi visibili di String
            System.out.println(metodo.getName());
        }
    }
}