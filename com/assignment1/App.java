package com.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/assignment1/config.xml");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);

	}

}
