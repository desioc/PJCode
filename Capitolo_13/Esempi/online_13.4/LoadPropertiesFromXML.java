import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFromXML {
    public static void main(String[] args) {
        // creazione di un oggetto Properties
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("config.xml")) {
            // caricamento delle properties da XML
            properties.loadFromXML(fis);

            // lettura delle proprietà
            String language = properties.getProperty("app.language");
            String version = properties.getProperty("app.version");
            String theme = properties.getProperty("app.theme");

            System.out.println("Lingua: " + language);
            System.out.println("Versione: " + version);
            System.out.println("Tema: " + theme);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
