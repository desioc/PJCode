package com.claudiodesio.jpms.docs;

import com.claudiodesio.jpms.spi.Document;

public class Invoice implements Document {

    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un fattura!");
    }

}