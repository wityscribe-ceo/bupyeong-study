package com.the.ex;

public class Java0814Ex4 {
 
		public static void hello() {
			System.out.println("안녕하세요 반가워요");
			System.out.println("===============");
		}
		
		public static String hello(String name) {
			System.out.println(name+"안녕하세요 반가워요");
			System.out.println("===============");
			return name+"님이 이사하였습니다.";
		}
		
		
		
		public static void main(String[] args) {
			
			Java0814Ex4.hello();
			Java0814Ex4.hello();
			Java0814Ex4.hello();
			Java0814Ex4.hello();
			
			 String str= Java0814Ex4.hello("홍길동");
			 System.out.println(str);
		}

}
