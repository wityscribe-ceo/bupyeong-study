package com.the.ex;
import java.util.ArrayList;

import com.the.iface.Shape;

class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
}

class Rect implements Shape{

	private double width;
	private double height;
	public Rect(double width,double height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*width+2*height;
	}
	
}

public class ExInterface {
 public static void main(String[] args) {
//	Shape s1=new Shape();// 인터페이스는 생성할수 없다.
	 Shape s2=new Circle(5);
	 System.out.println(s2.getArea());
	 System.out.println(s2.getPerimeter());
	 Shape s3=new Rect(5,6);
	 System.out.println(s3.getArea());
	 System.out.println(s3.getPerimeter());
	 
	 ArrayList<Shape> list = new ArrayList<Shape>();
	 list.add(s2);
	 list.add(s3);
	 list.add(new Circle(6));
	 list.add(new Rect(2,4));
	 
	 for(Shape s:list) {
		 System.out.println("넓이:"+s.getArea()+"둘레:"+s.getPerimeter());
		 
	 }
	 
	}

}
