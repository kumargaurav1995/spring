package com.SpringSixth;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Triangle implements InitializingBean,DisposableBean{
	
	private int point1;

	public int getPoint1() {
		return point1;
	}


	public void setPoint1(int point1) {
		this.point1 = point1;
	}


	@Autowired
	private MessageSource messageSource2;
	public MessageSource getMessageSource2() {
		return messageSource2;
	}


	public void setMessageSource2(MessageSource messageSource2) {
		this.messageSource2 = messageSource2;
	}


	public MessageSource getMessageSource() {
		return messageSource2;
	}


	public void setMessageSource(MessageSource messageSource2) {
		this.messageSource2 = messageSource2;
	}


	private List<Point> points;
	
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw(){
		for(Point point : points)
		System.out.println("Point - ("+point.getX()+","+point.getY()+")");
		System.out.println(this.messageSource2.getMessage("nextMessage", null,"Default Greeting for printing",null));
		System.out.println(this.messageSource2.getMessage("coordinate.message", null,"Default Greeting for coordinates",null));
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for Triangle");
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy method called for Triangle");
	}
}
