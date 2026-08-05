package com.the.ex;

public class Javaclass02 {

	public static final double CW=7.7777777;
	// ^      ^     ^
	// 위 표시 항상 표시 해야된다 심볼릭 함수

	//System.out.println(Javaclass02.CW);
	// 클래스 제목과 내가 만든 심볼릭 상수 합쳐서표시
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Javaclass02.CW);
		
		// 블리언 상수 
		System.out.println(true);
		System.out.println(false);
		//몇몇 언어에서는 0 은 false 1은 true 사용된다.
		//자바는 허용하지 안는다.
		
		System.out.println(232);
		System.out.println(55);
		
		System.out.println(5);
		System.out.println(51);
		
		//long 은  소문자 l 또는 대문자 L 을 붙이면 된다.
		//(10000000L)

		
		// float
		System.out.println(4.12f);
		System.out.println(6F);
		
		//double
		System.out.println(12.4);
		System.out.println(8.);
		System.out.println(.301);
		
		
		//문자 상수 한글자 한단어 '' 가능
		
		System.out.println('a');
		System.out.println('각');
		System.out.println('시');
		
		// 문자열 상수 여러글자 여러단어 "" 가능
		System.out.println("문자열");
		
		System.out.println(Math.PI);
		
		
		
	}

}
