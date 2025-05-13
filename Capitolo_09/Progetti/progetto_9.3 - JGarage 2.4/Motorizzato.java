// interfaccia Motorizzato
package com.jgarage.model;

public sealed interface Motorizzato permits Auto, Moto {
    int NUMERO_RUOTE = 2;
    String targa();
}
