javac -d mods --module-source-path src src/com.claudiodesio.jpms.spi/module-info.java src/com.claudiodesio.jpms.spi/com.claudiodesio.jpms/spi/* src/com.claudiodesio.jpms.invs/module-info.java src/com.claudiodesio.jpms.invs/com.claudiodesio.jpms/invs/* src/com.claudiodesio.jpms.certs/module-info.java src/com.claudiodesio.jpms.certs/com.claudiodesio.jpms/certs/* src/com.claudiodesio.jpms.factory/module-info.java src/com.claudiodesio.jpms.factory/com.claudiodesio.jpms/factory/* src/com.claudiodesio.jpms.handlers/module-info.java src/com.claudiodesio.jpms.handlers/com.claudiodesio.jpms/handlers/* src/com.claudiodesio.jpms.client/module-info.java src/com.claudiodesio.jpms.client/com.claudiodesio.jpms/client/*

jar --create --file=lib/com.claudiodesio.jpms.spi.jar --module-version=1.0 -C mods/com.claudiodesio.jpms.spi .
jar --create --file=lib/com.claudiodesio.jpms.invs.jar --module-version=1.0 -C mods/com.claudiodesio.jpms.invs .
jar --create --file=lib/com.claudiodesio.jpms.certs.jar --module-version=1.0 -C mods/com.claudiodesio.jpms.certs .
jar --create --file=lib/com.claudiodesio.jpms.factory.jar --module-version=1.0 -C mods/com.claudiodesio.jpms.factory .
jar --create --file=lib/com.claudiodesio.jpms.handlers.jar --module-version=1.0 -C mods/com.claudiodesio.jpms.handlers .
jar --create --file=lib/com.claudiodesio.jpms.client.jar --module-version=1.0 --main-class=com.claudiodesio.jpms.client.TrademarkClient -C mods/com.claudiodesio.jpms.client .

pause;