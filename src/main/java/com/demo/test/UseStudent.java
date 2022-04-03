package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student) context.getBean("student");
		System.out.println(s);

		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);

	}
}
