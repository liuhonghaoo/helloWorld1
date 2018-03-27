package com.neuedu.perspn.testSpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args){
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("F:/fuhuaqi/abc/WebContent/WEB-INF/config/spring/applicationContext.xml");
		Student s1 = (Student) context.getBean("Student1");
		Student s2 = (Student) context.getBean("Student2");
		s1.show();
		s2.show();
	}
}
