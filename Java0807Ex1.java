package com.the.ex;

public class Java0807Ex1 {
	
	public static void main(String[] args) {
	//9번 문제 연속 
		// 아래 클래스 위로 써야됨 두개 
		//public static final int avgCutline=60;
		//public static final int suvjectCutline=40;
//		
//	int java = 35;
//	int html = 10;
//	int db=20;
//	
//	int avg=(java+html+db)/3;
//	
//	if(avg>=Java0807Ex1.avgCutline && java>=Java0807Ex1.suvjectCutline
//			&& html>=Java0807Ex1.suvjectCutline && db>=Java0807Ex1.suvjectCutline) {
//		System.out.println("합격을 축하합니다.");
//
//	}else {
//		System.out.println("불합격입니다 공부하세요");
//	}
//	
//	if (java<Java0807Ex1.suvjectCutline) {
//		System.out.println("자바 과락");
//	}
//	if (db<Java0807Ex1.suvjectCutline) {
//		System.out.println("db 과락");
//	}
//	if (html<Java0807Ex1.suvjectCutline) {
//		System.out.println("html 과락");
//	}
//	
	// 10번
		String tableType="성인";
		double weight =87;
		double height = 172.1;
		
		double mbi = weight/((height-100)*0.9)*100;
		
		if(tableType.equals("성인")) {
			if(mbi<100) {
				System.out.println("체중 미달");
			}else if (mbi<110)	{//if (mbi>100&&mbi<110)
				System.out.println("정상");
			}else if (mbi<120)	{
				System.out.println("과체중");
			}else if (mbi<150)	{
				System.out.println("비만");
			}else {
				System.out.println("고도 비만");
			}
		}else {
			if(mbi<95) {
				System.out.println("체중 미달");
			}else if (mbi<120) {
				System.out.println("정상");
			}else if (mbi<130)	{
				System.out.println("경도 비만");
			}else if (mbi<150)	{
				System.out.println("중도 비만");
			}else {
				System.out.println("고도 비만");
			}
		}
			System.out.println(mbi);
		
		
		
		
		
 }
}
