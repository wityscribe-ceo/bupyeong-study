package com.the.ex;
import java.util.Scanner;
public class Java0812Ex1 {

	public static void main(String[] args) {
		
		String inputString="9";
		while(!inputString.equals("0")) {
			System.out.println("전체메뉴:1. 메뉴 2. 메뉴 3매뉴 0.종료");
			inputString=new java.util.Scanner(System.in).nextLine();
			switch(inputString) {
			case "1":
				System.out.println("메뉴1번 관련작업");
				break;
			case "2":
				System.out.println("메뉴2번 관련작업");
				break;
			case "3":
				System.out.println("메뉴3번 관련작업");
				break;
			case "0":
				System.out.println("메뉴 종료");
				break;
				default:
					System.out.println("잘못된 입력");
				}
		}
		System.out.println("프로그램 종료");

		
	}

}
