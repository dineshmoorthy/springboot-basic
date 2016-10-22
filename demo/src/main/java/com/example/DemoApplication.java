package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*@Controller
@EnableAutoConfiguration*/
@SpringBootApplication
public class DemoApplication {
	 /*@RequestMapping("/demoo")
	    @ResponseBody
	    String home() {
	        return "Hello Demo2 World!";
	    }*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
