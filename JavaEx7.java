package com.the.ex;

public class JavaEx7 {

	public static void main(String[] args) {
		
				System.out.println("01");
				if(true) {
					System.out.println("02");
					for(int i=0;i<2;i++) {
						System.out.println("04");
					}
					System.out.println("05");
					System.out.println("08");
				}else {
					System.out.println("03");
					if(true) {
						System.out.println("06");
					}else {
						System.out.println("07");
						for(int i=0;i<2;i++) {
							System.out.println("13");
							if(true) {
								System.out.println("12");
							}else {
								System.out.println("07");
							}
							System.out.println("11");
						}
						System.out.println("12");
						
					}
					System.out.println("09");
					
				}
				System.out.println("10");
			}
		


	

	}


