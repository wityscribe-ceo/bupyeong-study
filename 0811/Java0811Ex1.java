package com.the.ex;



public class Java0811Ex1 {

	public static void main(String[] args) {
		
//사용자에게 계속해서 숫자를 입력받아 1~10사이의 숫자를
//3번 입력 할 때 까지 반복한다. 
//입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고
	//사용자가 제대로 입력한 총합을 출력하는  프로그램을 만들어 보자.
//		int count=0;
//		int wrongCount=0;
//		int sum=0;
//	while(count<3) {
//		System.out.println("숫자를 입력하세요");
//		int input=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//	
//	if(input >=1&& input <=10) {
//		System.out.println("올바른 범위 입니다");
//		sum=sum+input;
//		count++;
//		
//	}else {
//		System.out.println("범위에 벗어 난다");
//		wrongCount++;
//		
//	}
//	
//	
//	}
//		
//		System.out.println("잘못된 입력:"+wrongCount);
//		System.out.println("올바른 입력:"+count);
//		System.out.println("올바른 수의 합:"+sum);
//		
//		

//	// 0부터 시작하는 4의 배수 10개를 출력하시오. 	
//		for(int i=0;i<10;i++) {
//			System.out.print(" "+4*i);
//		}
//		
//	//13. 두수를 입력 받아 최소 공배수를 출력하는 프로그램을 만들어 보자.	
//		 int a= 2;
//		 int b= 3;
//		 for(int i=1;i<100;i++) {
//			 if(i%a==0&&i%b==0) {
//				 System.out.println(i+"는 최소 공배수");
//				 break;
//			 }
//		 }
//		
//  15.   100이하의 수학과목 점수를 5번 입력받아
		//60이하 점수가 몇 개인지 출력하는 프로그램을 구현해 보자.
		
		int sum=0;
		
		for(int i=1;i<6;i++) {
			
				System.out.println("수학과목 점수를 입력하세요 (100이하)");
				int a = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
				if(a<=60) {	
					sum++;
					System.out.println(+i+ "번째수는  60이하 입니다");
				
				}else  {
			System.out.println("60이하의 수가 아닙니다.");
		
		}
	}
		 System.out.println("60이하의 총개수는 "+sum);
		
		
		
		
		
		
	
		
	}

}
