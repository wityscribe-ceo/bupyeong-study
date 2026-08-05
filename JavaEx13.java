package com.the.ex;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JavaEx13 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요:");
		int num1= sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요:");
		int num2= sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요:");
		int num3= sc.nextInt();

		int total = (num1 + num2 + num3)/3;
		
		if (total>80) {
		System.out.println("합격입니다");
		
	}else {
		System.out.println("불합격입니다.");
	}
	}
}


