package com.the.ex;
import java.util.Random;
public class Java0807Ex4 {

	public static void main(String[] args) {
	
		//15번 문제
		//6~10 사이의 랜덤수 구하기
		//import java.util.Random;		
		
//		Random r=new Random();
//		int number=r.nextInt(5);
//		number=number+6;//6-10
//		
	//16번 문제
		Random r=new Random();
		int number=	r.nextInt(10)+1;// 1- 45사이 랜덤수
		int count=0;
		
		
		
		int numbers[]=new int[3];
		numbers[0]=r.nextInt(10)+1;
		numbers[1]=r.nextInt(10)+1;
		numbers[2]=r.nextInt(10)+1;
	
	
		int userNumbers[]=new int[3];
		userNumbers[0]=3;
		userNumbers[1]=6;
		userNumbers[2]=1;
	
		if (numbers[0]==userNumbers[0]) {
			 count++;
		}
	
		if (numbers[0]==userNumbers[1]) {
			 count++;
		}
	
		if (numbers[0]==userNumbers[2]) {
			 count++;
		}
	
		if (numbers[1]==userNumbers[0]) {
			 count++;
		}
	
		if (numbers[1]==userNumbers[1]) {
			 count++;
		}
	
		if (numbers[1]==userNumbers[2]) {
			 count++;
		}
	
		
		if (numbers[2]==userNumbers[0]) {
			 count++;
		}
	
		if (numbers[2]==userNumbers[1]) {
			 count++;
		}
	
		if (numbers[2]==userNumbers[2]) {
			 count++;
		}
	
		System.out.println(java.util.Arrays.toString(numbers));
		System.out.println(java.util.Arrays.toString(userNumbers));
		System.out.println(count);
	
	
	}

}
