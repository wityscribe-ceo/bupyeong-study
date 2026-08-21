package com.the.ex;

import java.util.ArrayList;

//추상 클래스: 구현부가 없는 클래스
abstract class Shape{
	private String color;
	public abstract double getArea();
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
class Rectangle extends Shape{
	private double height;
	private double width;
	
	public Rectangle(double height,double width) {
		this.height=height;
		this.width=width;
	}
	
	@Override
	public double getArea() {
		return height*width;
	}
}

public class ExAbstract {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,20);
		System.out.println(r1.getArea());
		Shape s1= new Rectangle(11,12);
		System.out.println(s1.getArea());
		
	ArrayList<Shape> list=new ArrayList<Shape>();
	list.add(r1);
	list.add(s1);
	
	for(Shape s:list) {
		System.out.println(s.getArea());
	}
	
	
		//	 	Shape s=new Shape();
//		s.setColor("yello");
//		System.out.println(s.getColor());
		
	}

}
