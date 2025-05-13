package com.claudiodesio.jpms.factory;

import com.claudiodesio.jpms.docs.Certificate;
import com.claudiodesio.jpms.docs.Invoice;
import com.claudiodesio.jpms.spi.Document;

public class DocumentFactory {

    public static Document getDocument(String documentId) {
        return switch (documentId) {
            case "I" -> new Invoice();
            case "C" -> new Certificate();
            default -> throw new IllegalArgumentException("Invalid Document ID");
        };
    }
}