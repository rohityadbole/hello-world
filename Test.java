package com.mvc.spring.itss.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.spring.itss.model.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext app=new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		ApplicationContext cntxt=SpringContextUtil.getApplicationContext();
		
		//System.out.println(app);
		Employee e=(Employee)cntxt.getBean(Employee.class);
		System.out.println(e.getEmployeename());
		
	}

}
