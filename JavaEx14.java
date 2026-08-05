package com.the.ex;

import java.util.Scanner;

public class JavaEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		if(5>num) {
			System.out.println(num + 15);
		}else {
			System.out.println(num + 5);
		}
	}

}
