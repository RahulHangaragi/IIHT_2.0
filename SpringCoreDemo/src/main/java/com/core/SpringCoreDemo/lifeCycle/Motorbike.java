package com.core.SpringCoreDemo.lifeCycle;

public class Motorbike {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Motorbike() {
		super();
	}

	@Override
	public String toString() {
		return "Motorbike [name=" + name + ", price=" + price + "]";
	}

	public void init() {
		System.out.println("This is Initialize method of the Bean");
	}
	
	public void destroy() {
		System.out.println("This is Destroy method of the Bean");
	}
}
