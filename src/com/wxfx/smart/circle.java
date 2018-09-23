package com.wxfx.smart;

public class circle {
	double rad;
	final double PI;
	
	public circle(double r){
		rad = r;
		PI = 3.14;
	}
	
	public double getPerimeter(){
		return (rad*rad)*PI;
	}
}