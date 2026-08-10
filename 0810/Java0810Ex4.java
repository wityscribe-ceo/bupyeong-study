package com.the.ex;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Java0810Ex4 {

	public static void main(String[] args) {
//		
//		for(int i=0;i<10;i++) {
//			if(i%2==0) {
//				continue;
//			
//		}
//			System.out.print(" i="+i);
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<10;i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.print(" i="+i);
//			
//		}
//		
//		
//		int i=0;
//		while (true) {
//			i++;
//			if(i >= 5) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
//		for (int i = 0; i<10; i++) {
//			if(i>=4) {
//				System.out.println(i);
//				break;
//				
//			}
//		}
		
//		
//		int i= 0;
//		while (i<10) {
//			i++;
//			if(i%2==1) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
//		for (int i = 1; i <=10; i++) {
//			if (i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
//		int i= 0;
//		while (true) {
//			i++;
//			if(i%3==0) {
//				continue;
//			}
//			if (i>=5) {
//				System.out.println(i);
//				break;
//			}
//		}
		
//		for (int i = 0; i < 10; i++) {
//			  if (i % 2 == 1) {
//			    continue;
//			  }
//			  System.out.println(i);
//			  if (i >= 6) {
//			    break;
//			  }
//		}
//		
//	
//		int i = 0;
//		while (true) {
////		  i++;
//		  if (i % 2 == 0) {
//		    continue;
//		  }
//		  if (i >= 8) {
//		    System.out.println(i);
//		    break;
//		  }
//		}

//		int sum = 0 ;
//		
//		for(int a=1;a<100;a++) {
//		if (sum+a<100) {
//			sum=sum+a;
//	System.out.println(String.format("%d:%d ", a, sum)); 
//		}else {
//			break;
//		}
//				}
//		
//		
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		String a=sc.nextLine();
//		
//		System.out.println("숫자를 입력하세요");
//		int count = Integer.parseInt(sc.nextLine());
//		
//		for(int i=1;i<=count;i++) {
//			System.out.println(a);
//		}
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요");
//		int a= Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 숫자를 입력하세요");
//		int b= Integer.parseInt(sc.nextLine());
//	
//		
//			if(a>b) {
//			int temp;
//			temp=a;
//			a=b;
//			b=temp;
//		}
//	
//			int sum=0;
//			for(int i=a+1;i<b;i++) {
//				sum=sum+i;
//			}
//				System.out.println(sum);
//				}
		
		
//	Scanner sc= new Scanner(System.in);
//	System.out.println("첫번째 숫자를 입력하세요");
//	int a= Integer.parseInt(sc.nextLine());
//	System.out.println("두번째 숫자를 입력하세요");
//	int b= Integer.parseInt(sc.nextLine());
////
////
//	for(int i=a;i<a+b;i++) {
//	System.out.println("i:"+i);	
//	}

		
		
		Scanner sc= new Scanner(System.in);
	
//		while (true) {
//            System.out.print("문자열을 입력하세요 (종료하려면 '종료' 입력): ");
//            String input = sc.nextLine();
//
//            // 사용자가 입력한 문자열이 "종료"와 같은지 검사
//            if (input.equals("종료")) {
//                System.out.println("프로그램을 종료합니다.");
//                break; // 루프 즉시 탈출
//            }
//
//            System.out.println("입력한 문자열: " + input);
//        }
//		
		//\==========================================
		 String input;

	        do {
	            System.out.print("문자열을 입력하세요 (종료하려면 '종료' 입력): ");
	            input = sc.nextLine();

	            // "종료"를 입력하면 바로 break로 나갑니다.
	            if (input.equals("종료")) {
	                break; 
	            }

	            // "종료"가 아닐 때만 아래 코드가 자연스럽게 실행됩니다.
	            System.out.println("입력한 문자열: " + input);

	        } while (true); // 생각을 비우고 true를 적어두면 됩니다.

	        System.out.println("프로그램을 종료합니다.");
	    }
	}
	
	
		
	//	==========================================
				
				
//			
//		        for (;;) {
//		            System.out.print("문자열을 입력하세요 (종료하려면 '종료' 입력): ");
//		            String input = sc.nextLine();
//
//		            if (input.equals("종료")) {
//		                System.out.println("프로그램을 종료합니다.");
//		                break; // 루프 탈출
//		            }
//
//		            System.out.println("입력한 문자열: " + input);
//		        }
//		    }
//		}
//		
				
	

	
