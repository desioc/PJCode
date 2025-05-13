// interfaccia Motorizzato
package com.jgarage.model;

import java.io.Serializable;

public sealed interface Motorizzato extends Serializable permits Auto, Moto {
    int NUMERO_RUOTE = 2;
    String targa();
}
