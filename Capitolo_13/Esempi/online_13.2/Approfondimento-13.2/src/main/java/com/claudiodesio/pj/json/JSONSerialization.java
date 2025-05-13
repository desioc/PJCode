package com.claudiodesio.pj.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONSerialization {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// Creazione di un oggetto Java
		Person person = new Person("Guthrie", "Govan", 53);

		String json = mapper.writeValueAsString(person); // Serializzazione
		System.out.println("Oggetto serializzato in JSON: " + json);
	}
}


