package com.claudiodesio.pj.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(@JsonProperty("nome") String name, @JsonProperty("cognome") String surname, 
		@JsonProperty("età") int age) {}

//public record Person(String name, String surname, int age) {} // prima versione dell'esempio'