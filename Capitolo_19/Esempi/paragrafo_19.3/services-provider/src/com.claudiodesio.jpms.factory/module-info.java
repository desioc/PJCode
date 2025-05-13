module com.claudiodesio.jpms.factory {
    requires com.claudiodesio.jpms.spi;
    exports com.claudiodesio.jpms.factory to com.claudiodesio.jpms.handlers;
    uses com.claudiodesio.jpms.spi.Document;
}