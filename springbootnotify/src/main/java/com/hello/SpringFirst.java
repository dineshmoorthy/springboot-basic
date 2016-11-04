package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringFirst {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringFirst.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringFirst.class, args);
		System.out.println("From springFirst ...."+ ctx.getApplicationName()+"....."+ctx.getDisplayName()+"....."+ctx.getClass());
	}
}

/*
1. if we give two springapplication.run it wont run
*/