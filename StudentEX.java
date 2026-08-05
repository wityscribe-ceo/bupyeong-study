package com.the.ex;

import java.util.Scanner;

public class StudentEX {

	public static String name1;
	public static int age1;
	public static double kor1;
	public static double eng1;
	public static double math1;
	public static double score1;
	public static double avg1;
	
	public static String name2;
	public static int age2;
	public static double kor2;
	public static double eng2;
	public static double math2;
	public static double score2;
	public static double avg2;
	
	
	public static String name3;
	public static int age3;
	public static double kor3;
	public static double eng3;
	public static double math3;
	public static double score3;
	public static double avg3;
	
	
	
	public static double totalScore;
	public static double totalAvg;
	public static double totalCount;
	
//	 학생 1명 추가
	
	
	
	
	
	public static void main(String[] args) {
		// 학생관리 프로그램
		//이름 , 나이, 국, 영, 수 ,점수, 평균, 총점,총평균,총학생수
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학생 관리 프로그램");
		System.out.println("1번째 학생 정보");
		System.out.println("학생 이름>>");
		name1=sc.nextLine();
		System.out.println("나이를 입력>>");
		age1=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
		System.out.println("국어점수 입력>>");
		kor1=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
		System.out.println("영어점수 입력>>");
		eng1=Double.parseDouble(sc.nextLine());
		System.out.println("수학점수 입력>>");
		math1=Double.parseDouble(sc.nextLine());
		score1=kor1+eng1+math1;
		avg1=(score1)/3;
		
		totalScore=score1;
		totalAvg=avg1;
		totalCount=totalCount+1;
		
		System.out.println(String.format(
				"1번째 학생정보는 이름은%s 나이는: %d\n"+
				"국어:%f 영어:%f 수학 %f 총점:%f 평균:%f"
				,name1,age1,kor1,eng1,math1,score1,avg1));
		///////////////////////////////////////////
		/// 
		System.out.println("2번째 학생 정보");
		System.out.println("학생 이름>>");
		name2=sc.nextLine();
		System.out.println("나이를 입력>>");
		age2=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
		System.out.println("국어점수 입력>>");
		kor2=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
		System.out.println("영어점수 입력>>");
		eng2=Double.parseDouble(sc.nextLine());
		System.out.println("수학점수 입력>>");
		math2=Double.parseDouble(sc.nextLine());
		score2=kor2+eng2+math2;
		avg2=(score2)/3;
		
		totalScore=score2;
		totalAvg=avg2;
		totalCount=totalCount+1;
		
		System.out.println(String.format(
				"2번째 학생정보는 이름은%s 나이는: %d\n"+
				"국어:%f 영어:%f 수학 %f 총점:%f 평균:%f"
				,name2,age2,kor2,eng2,math2,score2,avg2));
		
		////////////////////////////////////////////
		
		System.out.println("3번째 학생 정보");
		System.out.println("학생 이름>>");
		name3=sc.nextLine();
		System.out.println("나이를 입력>>");
		age3=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
		System.out.println("국어점수 입력>>");
		kor3=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
		System.out.println("영어점수 입력>>");
		eng3=Double.parseDouble(sc.nextLine());
		System.out.println("수학점수 입력>>");
		math3=Double.parseDouble(sc.nextLine());
		score3=kor3+eng3+math3;
		avg3=(score3)/3;
		
		totalScore=score3;
		totalAvg=avg3;
		totalCount=totalCount+1;
		
		System.out.println(String.format(
				"3번째 학생정보는 이름은%s 나이는: %d\n"+
				"국어:%f 영어:%f 수학 %f 총점:%f 평균:%f"
				,name3,age3,kor3,eng3,math3,score3,avg3));
		
		
		
		System.out.println("전체 학생정보");
		System.out.println("전체 학생수:"+totalCount);
		System.out.println("전체 학생 점수:"+totalScore);
		System.out.println("전체 학생 평균:"+totalAvg);
		
		
		////////////////////////////////////////////////
		
		
	}

}