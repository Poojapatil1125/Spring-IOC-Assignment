package com.yash.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Spring First Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee1 e=(Employee1) context.getBean("employee1");
		System.out.println(e);
		//Employee1 e1=(Employee1)context.getBean("employee1");
		//System.out.println(e1);
	}

}
