package com.the.ex;
import java.util.Scanner;

public class JavaEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//	  Scanner sc = new Scanner(System.in);
//		        
//	  System.out.print("숫자를 입력하세요: ");
//		int num = sc.nextInt();
//		        
//		 if (num > 10) {
//			 System.out.println("10보다 큰 수입니다.");
//	  } else {
//		           
//	System.out.println("10보다 크지 않은 수입니다.");
//		     }
//		    
//		}
//	
//
//}
//Scanner sc = new Scanner(System.in);
//
//System.out.print("수를 입력하세요: ");
//int input = sc.nextInt();
//
//int result; // 변수 선언
//
//if (input == 0) {
//    result = 0;
//} else {
//    result = 1;
//}
//
//System.out.println("result: " + result);
//}
//}
//
//
//		  Scanner sc = new Scanner(System.in);
//	        
//	        System.out.print("첫 번째 수 입력: ");
//	        int num1 = sc.nextInt();
//	        System.out.print("두 번째 수 입력: ");
//	        int num2 = sc.nextInt();
//	        
//	        int total;
//	        
//	        if (num1 > num2) {
//	            total = num1 - num2;
//	        } else {
//	            total = num2 - num1;
//	        }
//	        
//	        System.out.println("두 수의 차이: " + total);
//	    }
//	}



Scanner sc = new Scanner(System.in);

System.out.print("첫 번째 수: ");
int n1 = sc.nextInt();
System.out.print("두 번째 수: ");
int n2 = sc.nextInt();
System.out.print("세 번째 수: ");
int n3 = sc.nextInt();

int max;

// 1. 먼저 n1과 n2 중 큰 수를 max에 저장
if (n1 > n2) {
    max = n1;
} else {
    max = n2;
}

// 2. 위에서 구한 max와 나머지 n3을 비교
if (n3 > max) {
    max = n3;
}

System.out.println("가장 큰 수: " + max);
}
}
