package com.the.ex;

public class Java0813Ex1 {

	public static void main(String[] args) {
		
		Season courrentSeason =Season.SPRING;
		
		switch(courrentSeason) {
		case Season.SPRING:
			System.out.println("꽃구경");
		break;
		case SUMMER:
			System.out.println("해수욕");
			break;
		case Season.AUTUMN:
			System.out.println("단풍구경");
			break;
		case Season.WINTER:
			System.out.println("눈싸움");
			break;
			default:
				
		}

	}

}
