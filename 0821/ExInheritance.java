package com.the.ex;

class Parent{
	public int x;
	public int y;
	public Parent() {}
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void print () {
		System.out.println("부모 클래스");
		
	}
	public void getXY() {
		System.out.println("두점의 좌표는 x="+this.x+" y="+this.y);
	}
}

class Child extends Parent{
	public int z;
	public Child() {}
	public Child(int x,int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("자식 클래스");
	}
	public void getXYZ() {
	 System.out.printf("세점의 좌표는 x:%d y:%d z:%d 입니다.",this.x,this.y,this.z);
	}
}
class Child2{
	public int x;
	public int y;
	public int z;
	public Child2() {}
	public Child2(int x,int y , int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void getXYZ() {
		 System.out.printf("세점의 좌표는 x:%d y:%d z:%d 입니다.",this.x,this.y,this.z);
}
	public void print () {
		System.out.println("부모 클래스");
	}
public class ExInheritance {

	public static void main(String[] args) {
	
		Parent p1= new Parent (10,20);
		p1.print();
		p1.getXY();
		
		Parent p2=new Parent(5,10);
		p2.print();
		p2.getXY();
		
		//XYZ 좌표를 출력하는 프로그램을 만들어 보자.
		//해당 프로그램에서 xy 좌표만 출력하는 메소드도 있어야 한다.
		Child d1=new Child(1,2,3);
		d1.print();
		d1.getXY();
		d1.getXYZ();
		
		Child d2=new Child(5,23,13);
		d2.print();
		d2.getXY();
		d2.getXYZ();

		Child2 ch2=new Child2(5,2,3);
		ch2.print();
		ch2.getXY();
		ch2.getXYZ();
	}
}
public void getXY() {
	// TODO Auto-generated method stub
	
}
}

