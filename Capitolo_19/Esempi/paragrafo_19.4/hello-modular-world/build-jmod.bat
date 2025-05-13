javac -d mods/com.claudiodesio.jpms.hello src/com.claudiodesio.jpms.hello/com/claudiodesio/jpms/hello/* src/com.claudiodesio.jpms.hello/module-info.java
jmod create -class-path mods/com.claudiodesio.jpms.hello hello.jmod
pause;