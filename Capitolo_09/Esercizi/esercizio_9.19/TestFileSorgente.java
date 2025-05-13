public class TestFileSorgente {
    public static void main(String args[]) {
        FileSorgente file = new FileSorgente("Test" , File.TipoFile.JAVA);
        System.out.println("Caso 1: Aggiunta di testo valido");
        file.aggiungiTesto("public class Test {}");
        System.out.println("Contenuto: " + file.getContenuto());

        System.out.println("\nCaso 2: Aggiunta di testo nullo");
        try {
            file.aggiungiTesto(null);
        } catch (IllegalArgumentException exc) {
            System.out.println("Catturata eccezione prevista " + exc);
        }

        try {
            System.out.println("\nCaso 3: Aggiunta di testo a posizione invalida");
            file.aggiungiTesto("AGGIUNTA" , 100);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Catturata eccezione prevista " + exc);
        }
        try {
            System.out.println("\nCaso 4: Aggiunta di testo nullo a posizione valida");
            file.aggiungiTesto(null, 0);
            System.out.println("Contenuto finale: " + file.getContenuto());
        } catch (IllegalArgumentException exc) {
            System.out.println("Catturata eccezione prevista: " + exc);
        }
        System.out.println("\nCaso 5: Aggiunta di testo a posizione valida");
        file.aggiungiTesto("// COMMENTO\n", 0);
        System.out.println("Contenuto finale: " + file.getContenuto());
    }
}