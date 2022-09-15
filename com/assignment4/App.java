package com.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/assignment4/ciconfig.xml");
		ConstructorMessage bean = context.getBean("cm",ConstructorMessage.class);
		System.out.println(bean);
}
}
