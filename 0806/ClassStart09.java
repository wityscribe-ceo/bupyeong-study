package com.the.ex;

public class ClassStart09 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=7;
		
		int temp;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a가 가장큼:"+a);
			}else {
				System.out.println("c가 가장큼:"+c);
			}
		}else {
			if(b<c) {
				System.out.println("c가 가장큼:"+c);
			}else {
				System.out.println("b가 가장큼:"+b);
			}
		}

	}

}
