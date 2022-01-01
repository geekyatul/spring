package com.spring.ioc.IOC_Assignment1.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    
	private String studentId;
	private String studentName;
	@Autowired
	private List<Test> studentTest;
	
	 public Student() {}

	public Student(String studentId, String studentName, List<Test> studentTest) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentTest = studentTest;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Test> getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest
				+ "]";
	};
	 
	  
	

}
