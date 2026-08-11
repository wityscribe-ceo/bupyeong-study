package com.the.ex;

import java.util.Random;
import java.util.Scanner;

public class Java0811Ex4 {

	public static void main(String[] args) {
		
//		 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인
//	3,4,5로 변경한 다음에 배열의 내용을 화면에 출력하는 코드를 구현하여 보자.
//
//		
//		int[] a = {1, 2, 3};
//		
//	     // 2. 반복문을 돌며 각 방의 값에 2를 더해 저장하기
//        for (int i = 0; i < a.length; i++) {
//            a[i] = a[i] + 2; // 원래 있던 값에 2를 더해서 다시 그 방에 넣기 (a[i] += 2 로 써도 돼요)
//        }
//
//        // 3. 변경된 배열의 내용 화면에 출력하기
//        System.out.println("--- 변경 후 배열 출력 ---");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("a[" + i + "]의 값: " + a[i]);
//        }
//    }
//}
//		a[]={12,1,51,3,6,8,5}의 a배열에서 가장
//		큰 값과 가장 작은 값을 더하는  프로그램을 작성해 보자.
		
		
//		int [] arr= {12, 1, 51, 3,6 ,8 ,5};
//		int max = arr[0];
//		int min = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if(arr[i]> max) {
//				max = arr[i];
//				}
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println(max+ min);
//	
		//배열에 5개의 숫자를 입력받아 넣은 다음
	//	숫자 하나를 입력받아 해당 숫자가 몇번째 
	//	인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.

//	
//		 Scanner scanner = new Scanner(System.in);
//	        
//	        // 5개의 정수를 저장할 배열 선언 및 생성
//	        int[] numbers = new int[5]; 
//
//	        // 1. 5개의 숫자 입력받아 배열에 순서대로 저장하기
//	        System.out.println("5개의 정수를 순서대로 입력하세요:");
//	        for (int i = 0; i < numbers.length; i++) {
//	            System.out.print((i + 1) + "번째 숫자: ");
//	            numbers[i] = scanner.nextInt();
//	        }
//
//	        // 2. 검색할 숫자 입력받기
//	        System.out.print("\n위치(인덱스)를 찾을 숫자를 입력하세요: ");
//	        int target = scanner.nextInt();
//
//	        // 3. 배열을 순회하며 해당 숫자의 인덱스 탐색
//	        int foundIndex = -1; // 찾지 못했을 경우를 대비해 -1로 초기화
//	        for (int i = 0; i < numbers.length; i++) {
//	            if (numbers[i] == target) {
//	                foundIndex = i; // 일치하는 숫자를 찾으면 해당 인덱스(방 번호) 저장
//	                break;          // 정답을 찾았으므로 더 이상 반복하지 않고 탈출
//	            }
//	        }
//
//	        // 4. 검색 결과 조건별 출력
//	        if (foundIndex != -1) {
//	            System.out.println("결과: 숫자 " + target + "은(는) [" + foundIndex + "]번 인덱스에 있습니다.");
//	        } else {
//	            System.out.println("결과: 입력하신 숫자 " + target + "은(는) 배열에 존재하지 않습니다.");
//	        }
//
//	        // 스캐너 자원 해제
//	        scanner.close();
//	
//		9.배열 크기를 입력 받아 배열 크기 만큼 
//		1,2,3,1,2,3,1,2,3 … 숫자를 순서대로 배열안에 
//		넣은 다음 배열의 내용을 출력해 보자.

//		
//		int size=10;
//		int array[]=new int[size];
//		
//		for(int i=0;i<array.length;i++) {
//			array[i]=i%3+1;
//		}
//		
//		System.out.println(java.util.Arrays.toString(array));
//		
//		
//		 배열에 들어있는 내용과 관계없이 다음과 같이 출력되는 2개의 프로그램을 구현해 보자.
//		  a)배열에 1,2,3이 들어 있으면 1,2,3,3,2,1 이 들어 있는 배열을 만들어 출력
//		  b)배열에 7,9,21,15,23 이 들어 있으면 23,15,21,9,7,7,9,21,15,23 이 들어 있는 배열
//
//       int a[]= {1,2,3};
//       int b[]= new int[a.length*2];
//       
//       for(int i=0; i<a.length;i++) {
//    	   b[i]=a[i];
//       }
//       
//       for(int i=0; i<a.length;i++) {
//    	   b[i+a.length]=a[a.length-i-1];
//       }
//       
//		System.out.println(java.util.Arrays.toString(b));
//		
		
//		 int a[]= {7,9,21,15,23};
//		 int b[]= new int[a.length*2];
//		
//		for (int i=0; i<a.length;i++) {
//			b[i]=a[a.length-i-1];
//		}
//		
//		for(int i=0; i<a.length;i++) {
//			b[i+a.length]=a[i];
//		}
//		
//		System.out.println(" " + java.util.Arrays.toString(b));
//		
//		
		
		Random r= new Random();
		int arr[]=new int[6];
		
		for (int i=0; i<100;i++) {
			int number=r.nextInt(6);
			arr[number]=arr[number]+1;
		}
		System.out.println(java.util.Arrays.toString(arr));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}