package com.the.ex;

public class Java0807Ex6 {

	public static void main(String[] args) {
//		int a=3; //초기값 <반복문은 0으로 쓰면 0부터 시작이니까
//		         // 초기값 1로 하면 1부터 시작함>
//		while(a<11) {// 몇번째까지 갈지 정하는 값
//			System.out.println(a+"번째 고객님 어서오세요");
//			a=a+1; // 조건 써야 됨 아님 무한루프
//			}
//
//		int b=5;
//		while(b<9) {
//	System.out.println(b+"번째 방문을 환영합니다.");
//		b++;// 위에랑 +1 같은표시
//		}
//		
////----------------------------------------------------
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(i+"번째 환영해요");
//		}	
//			
//			
//			for(int j=5;j<9;j++) {
//				System.out.println(j+"번째 방문");
//			}
		
//		int k=0; // 
//		do {
//			System.out.println(k+"번째 환영");
//			k++;
//		}while(k<3); //조건이 안맞더라도 한번은 실행함 4여도 4가나옴
//			
		
		int input=10;
		int count=1;
//		while (count<input) {
//			System.out.println(count+"번째");
//		count++;
//		}
//	
//		
//		for ( count=1 ;count<input; count++) {
//			System.out.println(count +"가 몇변째");
//		}
		
		do {
			System.out.println(count + "은 몇번째");
			count++;
			}while(count<input);
		
		
		
	}
}
