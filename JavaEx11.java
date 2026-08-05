package com.the.ex;

import java.util.Scanner;

public class JavaEx11 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("숫자를 입력하세요: ");
	        int num = sc.nextInt();
	        
	        if ( 126%num ==0) {
	            System.out.println("126의 약수이다"); 
	        }else {
	        	System.out.println("126의 약수가 아니다");
	        }
	        
	        
	    }
	

}
