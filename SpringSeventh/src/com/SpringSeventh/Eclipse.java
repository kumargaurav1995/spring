package com.SpringSeventh;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Eclipse implements Shape{
	
	private Point center1;
	public Point getCenter1() {
		return center1;
	}

	@Resource(name="PointB")
	public void setCenter1(Point center1) {
		this.center1 = center1;
	}

	public Point getCenter2() {
		return center2;
	}

	@Resource(name="PointC")
	public void setCenter2(Point center2) {
		this.center2 = center2;
	}

	private Point center2;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Eclipse");
		System.out.println("Eclipse: Points are "+"("+center1.getX()+","+center1.getY()+") and ("+center2.getX()+","+center2.getY()+")");
	}
	
	@PostConstruct
	public void initializeEclipse(){
		System.out.println("Init of Eclipse");
	}
	
	@PreDestroy
	public void destroyEclipse(){
		System.out.println("Init of Eclipse");
	}
	
}
