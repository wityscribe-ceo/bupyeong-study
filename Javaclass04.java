package com.the.ex;

public class Javaclass04 {
	public static final String  IP_ADDRESS = "127.120.051.223";
	public static final String  SITE_NAME = "네이버쇼핑몰생활용품";
	public static final double  PI= 3.14;


	public static void main(String[] args) {
		
		System.out.println(Javaclass04.IP_ADDRESS);
  //Javaclass04.IP_ADDRESS= “127.120.051.223”; 변수가 아니고 상수여서 변경이 불가능
		System.out.println(Javaclass04.SITE_NAME);
		System.out.println(Javaclass04.PI);
		//같은 클래스에서는 클래스이름을 생략해서 다음과 같이 사용할 수 있다.
		//생략하는 방법은 사용하지 않는 것이 좋다.
		System.out.println(IP_ADDRESS);

		
		
		
		
	}

}
