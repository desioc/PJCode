module com.claudiodesio.jpms.invs {
    requires com.claudiodesio.jpms.spi;
    //exports com.claudiodesio.jpms.invs to com.claudiodesio.jpms.factory;
    provides com.claudiodesio.jpms.spi.Document with com.claudiodesio.jpms.invs.Invoice;
}