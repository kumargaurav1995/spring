package com.SpringSeventh;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,Shape{

	private Point PointA;
	private Point PointB;
	private Point PointC;
	private ApplicationContext context;
	
	public Point getPointA() {
		return PointA;
	}


	public void setPointA(Point pointA) {
		PointA = pointA;
	}


	public Point getPointB() {
		return PointB;
	}


	public void setPointB(Point pointB) {
		PointB = pointB;
	}


	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}


	public void draw(){
		System.out.println("Drawing Triangle");
		System.out.println("Point A - ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B - ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C - ("+getPointC().getX()+","+getPointC().getY()+")");
	}


	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
		
	}


}

