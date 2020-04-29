package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@EnableDynamoDBRepositories
public class Application 
//implements RequestHandler
{
	static final Logger log = LoggerFactory.getLogger(Application.class);
	
	 public static Object handleRequest(Request request, Context context) throws ResourceNotFoundException{
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		Student student = null;
		switch(request.getHttpMethod()){
		case "GET" :
			student = mapper.load(Student.class,request.getId());
			if(student == null){
				
				throw new ResourceNotFoundException("not found "+request.getId());
			}
			return student;
		case "POST":
			student = request.getStudent();
			mapper.save(student);
			return student;
		default:
			break;
		}
	        
	       
	        return null;
	    }
	
}
