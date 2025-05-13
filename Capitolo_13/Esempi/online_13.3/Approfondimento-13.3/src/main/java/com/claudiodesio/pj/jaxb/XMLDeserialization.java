package com.claudiodesio.pj.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XMLDeserialization {
	public static void main(String[] args) throws JAXBException {
		String xmlInput = "<person>" + "<name>Steven</name>" + "<surname>Wilson</surname>" + "<age>57</age>"
				+ "</person>";

		// Deserializzazione in oggetto Java
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Person person = (Person) unmarshaller.unmarshal(new StringReader(xmlInput));
		System.out.println("Oggetto deserializzato: " + person);
	}
}
