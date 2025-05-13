// classe FileReaderRisorsa
package com.gestorefile;

public class FileReaderRisorsa implements AutoCloseable {

    public FileReaderRisorsa() {
        System.out.println("Apertura della risorsa FileReaderRisorsa...");
    }

    public void leggiDati() {
        System.out.println("Sto leggendo i dati dal file...");
    }

    @Override
    public void close() {
        System.out.println("Chiusura della risorsa FileReaderRisorsa...");
    }
}
