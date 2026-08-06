package com.the.ex;

public class ClassStart08 {

	public static void main(String[] args) {
		//%d연산자
//		1.어떤수에 배수를 찾을때 사용
//		int number1=2232340;
//		int number2=2;
//		if(number1%number2==0) {
//			System.out.println(number1+"는 "+number2+"의배수");
//				}else {
//					System.out.println(number1+"는 "+number2+"의배수가 아님");
//				}
//		2. 어떤수가 홀수 인지 짝수인지 확인
//		int number1=12;
//		if (number1%2==0) {
//			System.out.println(number1+"는 짝수");
//		}else {
//			System.out.println(number1+ "는 홀수");
//		}
//		
		
		//3. 약수를 구할때 사용
		//약수는 나누어 떨어지는 수를 약수라 한다.
//		
//		int number =4;
//		if(number%1==0) {
//			System.out.println("1는"+number+"의 약수");
//		
//		}
//		if(number%2==0) {
//			System.out.println("2는"+number+"의 약수");
//		}
//		if(number%3==0) {
//			System.out.println("3는"+number+"의 약수");
//		}
//		if(number%4==0) {
//			System.out.println("4는"+number+"의 약수");
//		}
//		
		//4. 잔돈계산
		int number =5700;
//		천원짜리 몇개 와 잔돈 으로 출력해보자.
		System.out.println("천원짜리: " + number/1000);
		System.out.println("잔돈: " + number%1000);
	
	// 천원짜리 몇개, 오백원 짜리 몇개, 잔돈 으로 출력해보자.
		System.out.println("천원짜리: " + number/1000);
		System.out.println("오백원: " + (number%1000)/500);
		System.out.println("잔돈: " + (number%1000)%500);
		
		//5. 초를 이용해서 시 분 초 구하기
//		 1시간 3600초 1분 60초 
		int totalSeconds=10000;
		int hour= totalSeconds/3600;
		System.out.println("시간:"+hour); //남은초? totalSeconds%3600
		int min= (totalSeconds%3600)/60;
		int sec= (totalSeconds%3600)%60;
		System.out.println("분:"+min); 
		System.out.println("초:"+sec);
		
	}

}
