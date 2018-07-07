package com.edureka.exception.checked;

public class MyCustomBusinessException extends Exception{
	
	public MyCustomBusinessException(String str) {
		super(str);
	}
	
	public String getMessage() {
		return super.getMessage();
	}

}
