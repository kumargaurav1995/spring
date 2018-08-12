package com.SpringSeventh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
@Required
@Autowired
/*@Qualifier("circleRelated")*/
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is "+"("+center.getX()+","+center.getY()+")");
	}

}
