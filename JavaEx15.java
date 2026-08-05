package com.the.ex;

public class JavaEx15 {

	public static void main(String[] args) {
		
		boolean b1=5!=3;
		boolean b2=5==3;

		if(b1) {
			if(b2) {
				System.out.println("1번");
			}else {
				System.out.println("2번");
			}
		}else {
			System.out.println("3번");
			System.out.println("4번");
		}
	}

}
