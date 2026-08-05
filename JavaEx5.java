package com.the.ex;

public class JavaEx5 {

	public static void main(String[] args) {
		System.out.println("01");
		if(true) {
			System.out.println("03");
		}else {
			System.out.println("02");
			for(int i=0;i<2;i++) {
				System.out.println("04");
			}
			System.out.println("06");
		}
		System.out.println("07");
	}

}
