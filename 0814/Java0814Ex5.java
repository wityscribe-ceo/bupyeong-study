package com.the.ex;

import java.util.Scanner;

class Bank{
	public static String name="hong";
	public static int account=0;
	//출력
	public static void printBalance() {
		System.out.println("======================");
		System.out.println(Bank.name+"님의 현재 계좌 금액은:"+Bank.account);
	}
	
	 //출금
 	public static void withdraw(int amount) {
		if(amount>0) {
			
		}else {
			System.out.println("음수는 입금할수 없습니다."); 
			return;
		}
		
		
		if(account-amount>0) {
			account=account-amount;
			 System.out.println(amount+"원을 출금하였습니다.");
			 		
		}else {
			System.out.println("돈이 모자랍니다");
		}
	}
	
	// 입금 
	
	public static void deposit(int amount) {
		if(amount>0) {
			account=account+amount;
			System.out.println(amount+"원이 입금");
		}else {
			System.out.println("0 이하는 입금할수 없습니다."); 
		}
	}
	
	
}
public class Java0814Ex5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("1.입금 2. 출금 .3계좌정보 4.종료");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("입금 금액 입력>>");
				Bank.deposit(Integer.parseInt(sc.nextLine()));
				break;
			case "2":
				System.out.println("출금 금액 입력>>");
				Bank.withdraw(Integer.parseInt(sc.nextLine()));
				break;
			case "3":
				Bank.printBalance();
				break;
			case "4":
				isFlag=false;
				break;
				 
			}
		}
		System.out.println("은행 프로그램 종료");
	}

}
