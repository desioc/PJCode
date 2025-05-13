// classe GestoreFile
package com.gestorefile;

public class GestoreFile {

    public void gestisciFile() {
        try (FileReaderRisorsa risorsa = new FileReaderRisorsa()) {
            risorsa.leggiDati();
        } catch (Exception e) {
            System.out.println("Errore nella gestione del file: " + e.getMessage());
        }
    }
}
