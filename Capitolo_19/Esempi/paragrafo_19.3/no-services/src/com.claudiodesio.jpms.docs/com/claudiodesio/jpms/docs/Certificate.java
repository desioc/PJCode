package com.claudiodesio.jpms.docs;

import com.claudiodesio.jpms.Document;

public class Certificate implements Document {

    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un certificato!");
    }

}