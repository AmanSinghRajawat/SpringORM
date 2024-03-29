package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student(44, "radha sumit", "kanpur");

		int result = studentDao.insert(student);
		System.out.println("Record Inserted : " + result);

	}
}
