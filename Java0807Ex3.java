package com.the.ex;

import java.util.*; // Random 과 Scanner 같이 사용하려고 * 넣음

public class Java0807Ex3 {

	public static void main(String[] args) {
		//13 문제 14문제 같이`
		Random r=new Random();
		int number=r.nextInt(3);//3은 0 1 2 (3번 돌수있는숫자입력한것)
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" 가위 바위 보 중 하나를 입력하세요");
		String user=sc.nextLine();// 유저가 뭐냈는지
	
		String computer=""; //컴퓨터
		String resultString="";//이겼는지 졌는지
		
		switch(number) {
		case 0:
//			System.out.println("가위");
			computer="가위";
			switch(user) {
			case"가위":
				resultString="비김";
				break;
			case"바위":
				resultString="이김";
				break;
			case"보":
				resultString="짐";
				break;
			}
			break;
		case 1:
//			System.out.println("바위");
			computer="바위";
			switch(user) {
			case"가위":
				resultString="짐";
				break;
			case"바위":
				resultString="비김";
				break;
			case"보":
				resultString="이김";
				break;
			}
			break;
		case 2:
//			System.out.println("보");
			computer="보";
			switch(user) {
			case"가위":
				resultString="이김";
				break;
			case"바위":
				resultString="짐";
				break;
			case"보":
				resultString="비김";
				break;
			}
			break;
		}
		
		System.out.println("컴퓨터는 "+ computer);
		System.out.println("사용자는" + user);
		System.out.println("결과는 사용자가 " + resultString);
		
		
		
		
		
	}

}
