package com.the.ex;
import java.util.Scanner;
public class JavaEx18 {
	public static void main(String[] args) {
		
	System.out.println("시작");
	Scanner sc= new Scanner(System.in);
//	System.out.print("a를 입력하세요:");
//		int a =sc.nextInt();
//		
//		System.out.print("b를 입력하세요:");
//		int b =sc.nextInt();
//
//		int Temp=a ;
//		a = b;
//		b= Temp;
//		
//		System.out.println("a: " + a + ", b: " + b);
//		
//	System.out.println("input 숫자 입력: ");
//	int input= sc.nextInt();
//	
//	if(input>10) {
//		System.out.println("P(10보다크다)");
//	}else {
//		System.out.println("P(10보다작다)");
//	}
//	
//	
//	
//	
//	System.out.println("종료");
	
     
//     System.out.print("input 숫자 입력: ");
//     int input = sc.nextInt();
//     
//     if (input > 0) {
//         System.out.println("양수 이다");
//     } else if (input == 0) {
//         System.out.println("0과 같다");
//     } else {
//         System.out.println("음수 이다");
//     }
// }
//}

	 System.out.print("첫 번째 숫자(a) 입력: ");
     int a = sc.nextInt();
     System.out.print("두 번째 숫자(b) 입력: ");
     int b = sc.nextInt();
     System.out.print("세 번째 숫자(c) 입력: ");
     int c = sc.nextInt();
     
     int temp;
     
     // 1. 가장 작은 변수를 찾아 a값과 교환한다.
     if (a > b) {
         temp = a;
         a = b;
         b = temp;
     }
     if (a > c) {
         temp = a;
         a = c;
         c = temp;
     }
     // 이 시점에서 a에는 무조건 세 수 중 가장 작은 값이 들어갑니다.
     
     // 2. 남은 변수를 비교해서 c가 더 작으면 b와 교환한다.
     if (b > c) {
         temp = b;
         b = c;
         c = temp;
     }
     
     // 3. a, b, c를 순서대로 출력한다.
     System.out.println("작은 수부터 출력: " + a + ", " + b + ", " + c);
     
 }
}