package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.data.jpa.entities.Student;
import com.data.jpa.services.StudentService;
import com.data.jpa.services.StudentServiceImple;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context=
				SpringApplication.run(Application.class, args);
		
		StudentService stdService =
				context.getBean(StudentServiceImple.class);
		
		
		Student std = new Student();
		std.setName("Milind");
		std.setRollno(78);
		std.setMarks(77.33f);
		
		
		boolean status= stdService.addStudentDetails(std); 	
		if(status) 
		{
			System.out.println("Student Inserted Succesfully..!");
		}
		else 
		{
			System.err.println("Student Not Inserted");
		}
	}

}
