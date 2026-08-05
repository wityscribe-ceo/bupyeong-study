package com.the.ex;
import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("숫자를 입력하세요: ");
	        int num = sc.nextInt();
	        
	        if (num < 0) {
	            num = num * -1; 
	        }
	        
	        System.out.println("절대값: " + num);
	    }
	

}

    