package com.the.ex;

import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;
import java.util.Scanner;
public class Java0807Ex5 {

	public static void main(String[] args) {
	
		//17. 
		
		 Scanner scanner = new Scanner(System.in);

	        // 2. 사용자에게 소득 물어보기
	        System.out.print("소득을 입력하세요 (단위: 만원): ");
	        double totalIncome = scanner.nextDouble(); // 사용자가 입력한 숫자를 a에 저장
	        System.out.print("작년에 비용 처리한 금액(쓴 돈)을 입력하세요 (단위: 만원): ");
	        double expenses = scanner.nextDouble();

	    
			// 3. 차감 후 실제 세금을 매길 금액(과세표준) 계산
	        double a = totalIncome - expenses;

	        // 마이너스 세금이 나오지 않도록 방어 코드 추가
	        if (a < 0) {
	            a = 0;
	        }
	        
	        double b=0;//세액
			double c=0;//누진공제액
		if (a<= 1400) {
			b=6;
			c=0;
			
		}else if (a<=5000) {
			b=15;
			c=126;
		}else if (a<=8800) {
			b=24;
			c=576;
		}else if (a<=15000) {
			b=35;
			c=1544;
		}else if (a<=30000) {
			b=38;
			c=1994;
		}else if (a<=50000) {
			b=40;
			c=2594;
		}else if (a<=100000){//5억초과	
			b=42;
			c=3594;
		}else if(a>100000){
			b=45;
			c=6594;
		}
		double tex= a * (b/100) - c;
		
		System.out.println("총 번금액은 "+ a);
		System.out.println("세율은 "+ b);
		System.out.println("누진공제액은 "+ c);
		System.out.println("종합소득세는? "+ tex);
		System.out.println("지방소득세는? "+ tex*0.1);
		System.out.println("총납부할 세금은?"+ (tex +(tex*0.1)));
		
	}

}
