package com.spring.ioc.IOC_Assignment1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Configuration;

import com.spring.ioc.IOC_Assignment1.model.Student;
import com.spring.ioc.IOC_Assignment1.model.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Student student1 = context.getBean("student", Student.class);
		Test test1=context.getBean("myTest",Test.class);
		test1.setTestId("T001");
		test1.setTestTitle("Java Test");
		test1.setTestMark(60);
		
		List<Test> student1Tests=new ArrayList<>();
		student1Tests.add(test1);
		
		student1.setStudentId("S001");
		student1.setStudentName("atul Patel");
		student1.setStudentTest(student1Tests);
		
		System.out.println(student1);
		
		
		//===============================================================================
		
		Student student2 = context.getBean("student", Student.class);
		Test test2=context.getBean("myTest",Test.class);
		test2.setTestId("T001");
		test2.setTestTitle("Java Test");
		test2.setTestMark(78);
		
		Test test3=context.getBean("myTest",Test.class);
		test3.setTestId("T002");
		test3.setTestTitle("Spring Test");
		test3.setTestMark(79);
		
		
		List<Test> student2Tests=new ArrayList<>();
		student2Tests.add(test2);
		student2Tests.add(test3);
		
		student2.setStudentId("S002");
		student2.setStudentName("ajay yadav");
		student2.setStudentTest(student2Tests);
		
		System.out.println(student2);

		

				
	}
} 
