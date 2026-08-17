package com.the.ex;
class MyFunction{
	// 함수는 독립적으로 특정 기능 수행 매소드 객체안에서 사용되는 함수
	// 클래스 메소드, 인스턴스 메소드
	//클래스 메소드는 클래스 필드를 사용하는 메소드, 
	// 인스턴스 메소드는 인스턴스 필드를 사용하는 메소드
	public static void function1() {
		System.out.println("===================");
		System.out.println(" 홍길동 010 ");
		System.out.println("===================");
		return;
	}
}
public class Java0814Ex2 {
	public static void function2(int a) {
		for(int i=0;i<a;i++) {
			
		System.out.println(i+1+"번째 명함");
		System.out.println("===================");
		System.out.println(" 홍길동 010 ");
		System.out.println("===================");
		}
		return;
	}


	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			
		
		MyFunction.function1();
		}
		// 원하는 수 만큼 명암을 출력하는 메소드
		
		Java0814Ex2.function2(3);
		Java0814Ex2.function2(10);
	}
}
