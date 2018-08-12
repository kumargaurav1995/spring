package com.SpringSixth;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");	
		context.registerShutdownHook();
		Triangle triangle=(Triangle)context.getBean("triangle1");		
triangle.draw();
System.out.println(context.getMessage("greeting", null,"Default Greeting",null));
	}

}