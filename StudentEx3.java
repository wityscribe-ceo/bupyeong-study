package com.the.ex;
import com.the.dto.*;
public class StudentEx3 {

	public static void main(String[] args) {
		
		
	java.util.Scanner sc= new java.util.Scanner(System.in);
		
	GradeManagement st1=new GradeManagement();
	GradeManagement st2=new GradeManagement();
	GradeManagement st3=new GradeManagement();
	GradeManagement st4=new GradeManagement();
	
System.out.println("학생 성적 관리 프로그램");	
	

	System.out.println("[1/4]번째 학생 정보를 입력합니다.");
	System.out.print("학생 이름:");
	st1.name=sc.nextLine();
	System.out.print("성적 점수:");
	st1.score=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
		
	
	System.out.println("[2/4]번째 학생 정보를 입력합니다.");
	System.out.print("학생 이름:");
	st2.name=sc.nextLine();
	System.out.print("성적 점수 :");
	st2.score=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	
	System.out.println("[3/4]번째 학생 정보를 입력합니다.");
	System.out.print("학생 이름:");
	st3.name=sc.nextLine();
	System.out.print("성적 점수 :");
	st3.score=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	
	
	System.out.println("[4/4]번째 학생 정보를 입력합니다.");
	System.out.print("학생 이름:");
	st4.name=sc.nextLine();
	System.out.print("성적 점수 :");
	st4.score=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	
	
	
	
System.out.println("<<학생 성적 통계>>");
System.out.println("1."+st1.name+":"+st1.score +"점");
System.out.println("2."+st2.name+":"+st2.score +"점");
System.out.println("3."+st3.name+":"+st3.score +"점");
System.out.println("4."+st4.name+":"+st4.score +"점");

System.out.println("-------------------------");

GradeManagement.totalCount=4;

GradeManagement.totalScore = GradeManagement.totalScore + st1.score;
GradeManagement.totalScore = GradeManagement.totalScore + st2.score; // 추가!
GradeManagement.totalScore = GradeManagement.totalScore + st3.score; // 추가!
GradeManagement.totalScore = GradeManagement.totalScore + st4.score;	
GradeManagement.totalAvg = (int) ((double) GradeManagement.totalScore / GradeManagement.totalCount);

System.out.println(String.format("전체 학생 총 점수:%d점", GradeManagement.totalScore));
System.out.println(String.format("전체 평균:%d점", GradeManagement.totalAvg)); // 소수점 1자리 출력
System.out.println(String.format("총 학생수:%d명", GradeManagement.totalCount));		
	}

}
