package com.springFourth;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware{
private String type;
private int height;
private String nature;
private ApplicationEventPublisher publisher; 
public int getHeight() {
	return height;
}

public String getNature() {
	return nature;
}


public Triangle(String nature, int height){
	
	this.nature=nature;
	this.height=height;
}
	
public Triangle(String nature){
	this.nature=nature;
}

public Triangle(int height){
	this.height=height;
}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println(getType()+"Triangle drawn"+"of height"+getHeight()+"of"+getNature()+"nature");
		DrawEvent drawEvent=new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	
}
