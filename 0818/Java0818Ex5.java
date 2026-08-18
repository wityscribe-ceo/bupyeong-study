package com.the.ex;
//사각형 넓이 구하는 프로그램

class Rectangle{
	public static double height=20;
	public static double width=40;
	public static void area() {
		System.out.println("넓이:"+height*width);
	}
	public static void periphery() {
		System.out.println("둘레:"+(height*2+width*2));
	}
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
}

public class Java0818Ex5 {
//	public static double height=20;
//	public static double width=40;
//	public static void area() {
//		System.out.println("넓이:"+height*width);
//	}
//	public static void periphery() {
//		System.out.println("둘레:"+(height*2+width*2));
//	}
//	
//	
	public static void main(String[] args) {
		Rectangle r=new Rectangle(30,20);
		r.area();
		r.periphery();
		
		Rectangle r2=new Rectangle(50,30);
		r2.area();
		r2.periphery();
		
		
		//		height=30;
//		width=20;
//		area();
//		periphery();
//		
//		height=5;
//		width=4;
//		area();
//		periphery();
//		
//		
		
	}

}
