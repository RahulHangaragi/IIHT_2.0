package com.core.SpringCoreDemo.constructorInjection;

public class Person {

	private String name;
	private int personId;
	private Certificate certi;

	public Person(String name, int personId, Certificate certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		//return "Person [name=" + name + ", personId=" + personId + "Certificate ="+ certi +"]";
		return this.name + " : " + this.personId + " { " + this.certi.name + " } ";
	}

}
