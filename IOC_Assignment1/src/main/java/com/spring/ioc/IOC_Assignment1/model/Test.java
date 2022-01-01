package com.spring.ioc.IOC_Assignment1.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTest")
@Scope("prototype")
public class Test {
	
	private String testId;
	private String testTitle;
	private int testMark;
	
	public Test() {}

	public Test(String testId, String testTitle, int testMark) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testMark = testMark;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public int getTestMark() {
		return testMark;
	}

	public void setTestMark(int testMark) {
		this.testMark = testMark;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testMark=" + testMark + "]";
	};
	
	
	
	
	

}
