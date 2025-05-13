package com.claudiodesio.pj.jaxb;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLSerialization {
  public static void main(String[] args) throws JAXBException {
    // Creazione di un oggetto Java
    Person person = new Person("Chris", "Cornell", 51);

    // Serializzazione in XML
    JAXBContext context = JAXBContext.newInstance(Person.class);
    Marshaller marshaller = context.createMarshaller();
    // Formattazione leggibile        
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 

    StringWriter writer = new StringWriter();
    marshaller.marshal(person, writer);

    System.out.println("Oggetto serializzato in XML:\n" + writer.toString());
  }
}
