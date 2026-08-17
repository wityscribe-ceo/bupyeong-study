package com.the.ex;

public class Java0812Ex2 {

	public static void main(String[] args) {
		int account=0;
		String inputString ="9";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		while(!inputString.equals("0")) {
		System.out.println("메뉴:1.입금 2.출금 3.조회 0.종료"); 
		inputString=sc.nextLine();
		
		switch(inputString) {
		case "1":
			System.out.println(" 입금액을 입력하세요 ");
			int money=Integer.parseInt(sc.nextLine());
			account=account+money;
			break;
		case "2":
			System.out.println(" 출금액을 입력하세요 ");
			money=Integer.parseInt(sc.nextLine());
			account=account-money;
			break;
		case "3":
			 System.out.println("현재 금액은:"+account);
			break;
		case "0":
			System.out.println("프로그램 종료"); 
			break;
			default:
			System.out.println("잘못된 입력");
			
		}
		
		
		
	}
		System.out.println("은행 프로그램 종료");
		
}
}