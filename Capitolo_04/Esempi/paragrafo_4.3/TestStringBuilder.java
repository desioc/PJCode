public class TestStringBuilder {
    public static void main(String args[]) {
        // Utilizzo di StringBuilder per concatenazione
        StringBuilder stringBuilder = new StringBuilder("Holden "); // costruttore con stringa
        stringBuilder.append("Caulfield");	// concatenazione con il metodo append 
        System.out.println(stringBuilder);	// viene chiamato il metodo toString
        //System.out.println(stringBuilder.append("Caulfield"));

        // Altri metodi
        System.out.println(stringBuilder.delete(0, 7)); //cancella i caratteri da indice 0 a 6
        System.out.println(stringBuilder.insert(9, " Holden"));  //inserisce Holden a indice 9
        System.out.println(stringBuilder.replace(0, 9, "Il giovane")); //sostituisce da 0 a 9
        System.out.println(stringBuilder.reverse()); //capovolge la stringa

        System.out.println(stringBuilder.reverse().delete(0, 11).insert(6, " Caulfield"));
        
    }
}