package com.the.ex;

import java.util.Scanner;

public class JavaEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(5>3) {
//			System.out.println(true);
//		}
//		
//		if(5<3) {
//			System.out.println(true);
//		}
//	
//		System.out.println(1); 
//		if(5<3){
//		System.out.println(true); 
//		}
//		System.out.println(2); 
//		
//	
//	
//		if(5>3){
//		System.out.println(true); 
//		}else{
//		System.out.println(false); 
//		}
//	
//		
//		if(5==3){
//		System.out.println(true); 
//		}else{
//		System.out.println(false); 
//		}
//	
//
//		System.out.println(1); 
//		if(5>3){
//		System.out.println(true); 
//		}else{
//		System.out.println(false); 
//		}
//		System.out.println(2); 
//	
//		int a=10;
//		int b=5;
//		if(a<b) {
//			System.out.println(true);
//		}
	
		
		int a= 10;
		int b= 5;
		if (a>b) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String string = scanner.nextLine();
		if (string.equals("java")) {
		     System.out.println("java 문자열 이다.");
		} else {
		     System.out.println("java 문자열이 아니다");
		}

		
	}

}
