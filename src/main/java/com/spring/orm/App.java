package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDaoImpl;
import com.spring.orm.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");

		EmployeeDaoImpl employeeDaoImpl = context.getBean("employeeDao", EmployeeDaoImpl.class);

		Employee employee = new Employee();
		employee.setId(10);
		employee.setFname("AAAAAAAAA");
		employee.setLname("BBBBBBBB");
		 
		int i = employeeDaoImpl.insert(employee);

	}
}
