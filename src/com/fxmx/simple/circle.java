package com.fxmx.simple;

public class circle {
	double rad;
	final double PI;
	
	public circle(double r){
		rad = r;
		PI = 3.14;
	}
	
	public double getArea(){
		return (rad*2)*PI;
	}
}