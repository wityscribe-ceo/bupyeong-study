package com.the.ex;

import java.util.Scanner;

public class JavaEx9 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        int a = 11;
        int b = 14;
        
        System.out.print("Input 숫자입력 ");
        int input = sc.nextInt();
        
        if (input == 0) {
            a = 5;
        } else {
            b = a + 3;
        }
        
        System.out.println("a, b 출력: " + a + ", " + b);
        
System.out.println("종료");
    }
}
	


