package com.claudiodesio.pj.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Classe serializzabile con JAXB
@XmlRootElement(name = "person")
class Person {
	private String name;
	private String surname;
	private int age;

	public Person() {
	} // Necessario per la deserializzazione

	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlElement(name ="name")
	public String getName() {
		return name;
	}

	@XmlElement(name ="surname")
	public String getSurname() {
		return surname;
	}

	@XmlElement(name ="age")
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}
