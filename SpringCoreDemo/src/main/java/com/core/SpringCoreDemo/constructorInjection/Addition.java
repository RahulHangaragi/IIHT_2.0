package com.core.SpringCoreDemo.constructorInjection;

public class Addition {
	
	private int num1;
	private int num2;
	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Constructor : int, int");
	}
	
	public Addition(double num1, double num2) {
		super();
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("Constructor : double, double");
	}
	
	public Addition(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("Constructor : string, string");
	}

	public void doSum() {
		System.out.println("Sum is : " +(this.num1 + this.num2));
	}
}
