package com.core.SpringCoreDemo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/collection/collectionConfig.xml");
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getProps());
		
		Employee emp2 = (Employee) context.getBean("employee2");
		System.out.println(emp2.getEmployeeName());
		System.out.println(emp2.getAddress());
		System.out.println(emp2.getCourses());
		System.out.println(emp2.getPhone());
		System.out.println(emp2.getProps());
	}

}
