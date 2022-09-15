package com.Assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment1.Employee;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/assignment5/config.xml");
		SetterMessage e=(SetterMessage) context.getBean("employee");
		System.out.println(e);

	}

}
