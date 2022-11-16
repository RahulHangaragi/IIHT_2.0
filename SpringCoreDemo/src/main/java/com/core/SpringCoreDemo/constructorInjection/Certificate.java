package com.core.SpringCoreDemo.constructorInjection;

public class Certificate {

	String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
