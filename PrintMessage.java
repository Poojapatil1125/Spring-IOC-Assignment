package com.assignment2;
//2.Create a class called PrintMessage with a single membervariable 
//called message which is initialized with a default value"Yash". Instantiate this class and test
import org.springframework.beans.factory.annotation.Value;

public class PrintMessage {

	
	private String message="Yash";
	

	@Override
	public String toString() {
		return "PrintMessage [message=" + message + "]";
	}
	
	
	
}
