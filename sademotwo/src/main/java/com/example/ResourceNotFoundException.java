package com.example;

public class ResourceNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String msg){
		super("Not found " +msg);
	}

}
