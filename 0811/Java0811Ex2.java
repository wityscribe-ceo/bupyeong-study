package com.the.ex;

import java.util.Random;
import java.util.Scanner;

public class Java0811Ex2 {

	public static void main(String[] args) {
	
//		int number=10;
//		boolean isPrime=true;
//		
//		if(number<=1) {
//			isPrime=false;
//		}else {
//		for(int i=2;i<number;i++) {
//			if(number%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		}
//		if(isPrime) {
//			System.out.println(number+"은소수");
//		}else {
//			System.out.println(number+"은 소수가 아님");
//		}
//		
//		
//		int number=3;
//		int count=0;
//		for(int i=0;i*number<=1000;i++) {
//			System.out.println(" "+i*number);
//			count++;
//		}
//		System.out.println("총 개수는 "+ count);

//		사용자에게 열의 데이터 개수을 입력받아 열에 맞춰서 1부터 100까지 순서대로 출력하는 프로그램을 구현해 보자. 
//
//		int number=5;
//		
//		for(int i=1; i<=100;i++) {
//		System.out.print(" "+ i);
//		if(i%number==0) {
//			System.out.println();
//		}
//		}
//		
		
		
//		컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현해 보자.
//		맞춘 회수와 틀린 회수를 기록해서 보여주고 3번 맞추면 프로그램이 종료되게 만들자.
//		
//		Random random=new Random();
//		Scanner sc = new Scanner(System.in);
//
//		int count=0;
//		int wrongCount=0;
//		
//		while(count<3) {
//			System.out.println("1.앞면 2.뒷면");
//			int user=Integer.parseInt(sc.nextLine());
//			int computer=random.nextInt(2)+1;
//			if(user==computer) {
//				count++;
//				System.out.println("정답입니다");
//			}else {
//				wrongCount++;
//				System.out.println("틀렸습니다");
//			}
//		}
//		
//				System.out.println("정답:"+count);
//				System.out.println("오답:"+wrongCount);

//		Random random=new Random();
//		Scanner sc = new Scanner(System.in);
//		int count =0;
//		int wrongCount=0;
//		
//		for(int i=0;i<10;i++) {
//		int computer=random.nextInt(6)+1;
//		System.out.println("주사위 숫자를 맞춰보세요:");
//		int user=Integer.parseInt(sc.nextLine());
//		
//		if(computer==user) {
//			count++;
//			System.out.println("맞췄습니다");
//		}else {
//			wrongCount++;
//			System.out.println("틀렸습니다");
//		}
//			
//		
//		}
//		
//		System.out.println("맞춘회수" + count);
//		System.out.println("틀린회수" + wrongCount);
//	
		
//		숫자 맞추기 게임을 구현해 보자.
//		숫자 맞추기 게임은 컴퓨터와 사용자가 간단한 상호작용을 통해 진행됩니다. 게임의 규칙과 흐름은 다음과 같습니다:
//	
//		
//		Random r=new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		int computer=r.nextInt(10)+1;
//		int count=0;
//			boolean isSuccess=false;
//		while(count<5) {
//			count++;
//			System.out.println("맞출 숫자 입력");
//			int user=Integer.parseInt(sc.nextLine());	
//			if(computer==user) {
//				System.out.println("축하");
//				isSuccess=true;
//				break;
//			}else {
//				System.out.println("틀렸어");
//				if(computer>user) {
//					System.out.println("컴퓨터가 더 커");
//				}else {
//					System.out.println("컴퓨터가 더 작아");
//					
//				}
//			}
//		}
//		
//	if (isSuccess) {
//	
//	}else {
//		System.out.println("실패 하였습니다.");
//	}
	
		
	
	}
	
}
