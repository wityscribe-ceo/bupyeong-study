package com.the.ex;

import java.util.Scanner;
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
enum movie{
	WINTER_KINGDOM,WINTER__SEA
}
public class ExEnum {
	
	public static void main(String[] args) {
	// 사용자에게 계절을 입력 받아서 관련 문자열을 출력
		// 0은 봄, 1은 여름, 2는 가을, 3은 겨울
		Season s1=Season.SPRING;
		//계절입력
		Scanner sc=new Scanner(System.in);
		System.out.println("계절 입력(0-봄, 1-여름, 2-가을, 3-겨울)>>");
		int select = Integer.parseInt(sc.nextLine());
		//사용자가 0을 입력하면 Season.SPRING이되고 1을 입력하면 Season.SUMMER가 된다.
		Season season=Season.values()[select];
		switch(season) {
		case SPRING:
			System.out.println("봄이어서 꽃이핌");
			break;
		case SUMMER:
			System.out.println("여름이여서 바다");
			break;
		case AUTUMN:
			System.out.println("가을 단풍");
			break;
		case WINTER:
			System.out.println("겨울 눈");
			break;
			
			
			
		}
		
		
		
	}

}
