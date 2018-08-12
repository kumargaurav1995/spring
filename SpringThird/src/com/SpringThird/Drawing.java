package com.SpringThird;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");	
		Triangle triangle=(Triangle)context.getBean("triangle");		
triangle.draw();
	}

}
