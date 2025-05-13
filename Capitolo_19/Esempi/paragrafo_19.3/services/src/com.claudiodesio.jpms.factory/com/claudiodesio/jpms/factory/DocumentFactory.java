package com.claudiodesio.jpms.factory;

import com.claudiodesio.jpms.spi.Document;
import java.util.Iterator;
import java.util.ServiceLoader;

public class DocumentFactory {

    public static Document getDocument(String documentId) {
        ServiceLoader<Document> serviceLoader = ServiceLoader.load(com.claudiodesio.jpms.spi.Document.class);
        for (Document document : serviceLoader) {
            if (document.getType().equals(documentId)) {
                return document;
            }
        }
        throw new IllegalArgumentException("Nessun documento trovato con ID=" + documentId);
    }
}
