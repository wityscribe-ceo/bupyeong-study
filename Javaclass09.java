package com.the.ex;

public class Javaclass09 {

	
	public static void main(String[] args) {
	/*
	 *변수 사용법
	 *선언
	 *자료형 변수명;
	 *변수명 = 변수값;
	 *
	 *자료형 변수명= 변수값;
	 *
	 */
	int a=10;
	int b;
	b=10;
	// 변수에 원하는 값을 할당하는 방법은 =(할당) 연산자를 사용한다.
	b=40;
    System.out.println(b);
    b=15;
    System.out.println(b);
    //변수로 다른 값을 할당할 수 있다.
    a=b;
    System.out.println(a);
    //변수로 다른 값을 할당할 수 있다.
    a=b+1;
    System.out.println(a);
    //자기자신에게 변경된 값을 할당할 수 있다.
    b=b+10;
    System.out.println(b);
    b=a+b;
    System.out.println(b);
	//변수는 식별자여서 같은 이름으로 2개이상 선언할수 없다.
    //int a=20;
}

}