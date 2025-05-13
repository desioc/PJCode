module com.claudiodesio.jpms.certs {
    requires com.claudiodesio.jpms.spi;
    //exports com.claudiodesio.jpms.certs to com.claudiodesio.jpms.factory;
    provides com.claudiodesio.jpms.spi.Document with com.claudiodesio.jpms.certs.CertFactory;
}