package com.SpringSeventh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		 Shape shape1=(Shape)context.getBean("triangle");
		 Shape shape2=(Shape)context.getBean("circle");
		 Shape shape3=(Shape)context.getBean("eclipse");
shape1.draw();
shape2.draw();
shape3.draw();
	}

}
