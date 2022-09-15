package com.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/assignment2/printmsgconfig.xml");
		PrintMessage e=(PrintMessage) context.getBean("print");
		System.out.println(e);
	}

}
