package com.claudiodesio.jpms.handlers;

import com.claudiodesio.jpms.factory.DocumentFactory;
import com.claudiodesio.jpms.spi.Document;

public class Trademarker {

    public void addTrademark(String documentId, String trademark) {
        Document document  = DocumentFactory.getDocument(documentId);
		document.addTrademark(trademark);
    }

}
