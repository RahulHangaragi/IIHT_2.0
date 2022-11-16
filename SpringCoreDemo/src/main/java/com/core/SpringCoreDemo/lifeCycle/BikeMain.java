package com.core.SpringCoreDemo.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/lifeCycle/config.xml");
		Motorbike moto1 = (Motorbike) context.getBean("motorbike1");
		System.out.println(moto1);
		context.registerShutdownHook();

	}

}