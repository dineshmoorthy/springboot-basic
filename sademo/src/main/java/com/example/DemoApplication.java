package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
/*@Controller
@EnableAutoConfiguration*/
@SpringBootApplication
public class DemoApplication 
//implements RequestHandler
{
	 /*@RequestMapping("/demoo")x
	    @ResponseBody
	    String home() {
	        return "Hello Demo2 World!";
	    }*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World! started !!! ");
	}

	/*@Override
	public Context handleRequest(String arg0, Context arg1) {
		// TODO Auto-generated method stub
		return "HIIII :::: "+arg0;
	}*/

	/*@Override
	public Object handleRequest(Object arg0, Context arg1) {
		// TODO Auto-generated method stub
		return "Hiiii ::: "+arg0.toString();
	}*/
	 public String handleRequest(String input, Context context) {
	        context.getLogger().log("Input: " + input);
	        return "Hello and Welcome - " + input;
	    }
	
}
