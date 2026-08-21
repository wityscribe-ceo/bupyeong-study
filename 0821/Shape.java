package com.the.iface;
//인터페이스 클래스의 설계도로 인터페이스를 상속받으면 
//인터페이스에 정의된 메소드랑 동일하게
//자식에서 재정의해야 한다.

//클래스는 다중상속이 불가능 인터페이스는 다중상속이 가능

//인터페이스 자체를 생성할수 없다.

//생성하려면 인터페이스를 상속받아 
//인터페이스의 추상메소드를 모두 재구현해야한다.

public interface Shape {
	public double getArea();
	public double getPerimeter();	
}
