package com.claudiodesio.pj.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDeserialization {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// JSON di input
		String jsonInput = "{\"nome\":\"Johnny\",\"cognome\":\"Cash\",\"età\":71}";

		// Deserializzazione in oggetto Java
		Person deserializedPerson = mapper.readValue(jsonInput, Person.class);
		System.out.println("Oggetto deserializzato: " + deserializedPerson);
	}
}
