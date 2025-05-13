module com.claudiodesio.jpms.handlers {
    requires com.claudiodesio.jpms.spi;
    requires com.claudiodesio.jpms.factory;
    exports com.claudiodesio.jpms.handlers to com.claudiodesio.jpms.client;
}