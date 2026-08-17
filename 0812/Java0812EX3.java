package com.the.ex;

import java.util.Scanner;

public class Java0812EX3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int adultCount=0;
      int teenCount=0;
      int childCount=0;
      String ticketType="";
      int total=0;
      
      


		Scanner sc=new Scanner(System.in);
		String input="";
		while(!input.equals("0")) {
			System.out.println("이원권 종류:"+ticketType);
			System.out.println("대인 : "+adultCount);
			System.out.println("청소년 : "+teenCount);
			System.out.println("소인/경로 : "+childCount);
			System.out.println("total : "+total);
			
			System.out.println("1.대인 2.청소년 3.소인/경로 4.종류선택 5.계산 6.초기화 0.종료");
			input=sc.nextLine();
			switch(input) {
			case "1":
				System.out.println("대인 몇명 인가요?");
				adultCount=Integer.parseInt(sc.nextLine());
				break;
			case "2":				
				System.out.println("청년 몇명 인가요?");
				teenCount=Integer.parseInt(sc.nextLine());
				break;
			case "3":
				System.out.println("소인/경로 몇명 인가요?");
				childCount=Integer.parseInt(sc.nextLine());
				break;
			case "4":
				System.out.println("1. 주간권  2. 오후권 3. 윈터야간권 4. 2일권 ");
				ticketType=sc.nextLine();
				break;
			case "5":
				switch(ticketType) {
				case "주간권":
					total=adultCount*46000+teenCount*39000+childCount*36000;
					break;
				case "오후권":
					total=adultCount*38000+teenCount*32000+childCount*29000;
					break;
				case "윈터야간권":
					total=adultCount*20000+teenCount*17000+childCount*16000;
					break;
				case "2일권":
					total=adultCount*74000+teenCount*62000+childCount*58000;
					break;
				default:
					System.out.println("이용권 종류를 다시 선택하세요.");
				}
				
				break;
			case "6":
				adultCount=0;
				teenCount=0;
				childCount=0;
				ticketType="";
				total=0;
				break;
			case "0":
				break;
			}
			
		}
		
	}
}
