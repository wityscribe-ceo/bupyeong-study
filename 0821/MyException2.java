package com.the.ex;

public class MyException2 {

	public static void exceptionFunction1() throws Exception{
//		try {
//		throw new Exception();
//	}catch(Exception e) {
//		System.out.println(e);
//	}
	}
		
	public static void main(String[] args) {
	
		try {
			exceptionFunction1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//		throw new NumberFormatException();
//		}catch(Exception e) {
//			System.out.println(e);
//		}

		
		
		
	}

}
