package com.claudiodesio.jpms.certs;

import com.claudiodesio.jpms.spi.Document;

public class CertFactory {
    public static Document provider() {
        return new Certificate("Creato con provider!");
    }
}