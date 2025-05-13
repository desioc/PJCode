import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SavePropertiesToXML {
    public static void main(String[] args) {
        // creazione di un oggetto Properties
        Properties properties = new Properties();

        // aggiunta di alcune coppie chiave-valore
        properties.setProperty("app.language", "it");
        properties.setProperty("app.version", "1.2.3");
        properties.setProperty("app.theme", "dark");

        try (FileOutputStream fos = new FileOutputStream("config.xml")) {
            // salvataggio delle properties in formato XML
            properties.storeToXML(fos, "Configurazione dell'applicazione");
            System.out.println("File XML salvato con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
