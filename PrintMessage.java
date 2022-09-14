package com.yash.springioc.question2;

import org.springframework.beans.factory.annotation.Value;

public class PrintMessage {

	
	private String message="Yash";
	

	@Override
	public String toString() {
		return "PrintMessage [message=" + message + "]";
	}
	
	
	
}
