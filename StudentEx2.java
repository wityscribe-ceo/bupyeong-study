package com.the.ex;
import com.the.dto.*;
public class StudentEx2 {

	public static void main(String[] args) {
//		com.the.dto.Student.totalCount=10;
//		com.the.dto.Student st1= new com.the.dto.Student();
//		st1.name1="홍길동";
//		
	java.util.Scanner sc= new java.util.Scanner(System.in);
	
	Student st1=new Student();
	Student st2=new Student();
	Student st3=new Student();
		
	System.out.println("학생 관리 프로그램");	
	

	System.out.println("1번째 학생 정보");
	System.out.println("학생 이름>>");
	st1.name=sc.nextLine();
	System.out.println("나이를 입력>>");
	st1.age=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	System.out.println("국어점수 입력>>");
	st1.kor=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
	System.out.println("영어점수 입력>>");
	st1.eng=Double.parseDouble(sc.nextLine());
	System.out.println("수학점수 입력>>");
	st1.math=Double.parseDouble(sc.nextLine());
	st1.score=st1.kor+st1.eng+st1.math;
	st1.avg=st1.score/3;
	
	
	Student.totalCount=Student.totalCount+1;
	Student.totalScore=Student.totalScore+st1.score;
	
	
	
	System.out.println("최종결과 출력");
	System.out.println(String.format("학생1: 이름:%s 나이:%d",st1.name,st1.age));
	System.out.println(String.format("국어:%f 영어:%f 수학:%f 총점:%f"
			+"평균:%f",st1.kor,st1.eng,st1.math,st1.score,st1.avg));
	/////////////////////////////////////////////////////////////
	
	System.out.println("2번째 학생 정보");
	System.out.println("학생 이름>>");
	st2.name=sc.nextLine();
	System.out.println("나이를 입력>>");
	st2.age=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	System.out.println("국어점수 입력>>");
	st2.kor=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
	System.out.println("영어점수 입력>>");
	st2.eng=Double.parseDouble(sc.nextLine());
	System.out.println("수학점수 입력>>");
	st2.math=Double.parseDouble(sc.nextLine());
	st2.score=st2.kor+st2.eng+st2.math;
	st2.avg=st2.score/3;
	
	
	Student.totalCount=Student.totalCount+1;
	Student.totalScore=Student.totalScore+st2.score;
	
	
	
	System.out.println("최종결과 출력");
	System.out.println(String.format("학생2: 이름:%s 나이:%d",st2.name,st2.age));
	System.out.println(String.format("국어:%f 영어:%f 수학:%f 총점:%f"
			+"평균:%f",st2.kor,st2.eng,st2.math,st2.score,st2.avg));
	
	///////////////////////////////////////////////////////////////////
	
	System.out.println("3번째 학생 정보");
	System.out.println("학생 이름>>");
	st3.name=sc.nextLine();
	System.out.println("나이를 입력>>");
	st3.age=Integer.parseInt(sc.nextLine());// Integer.parseInt(sc.nextLine());
	System.out.println("국어점수 입력>>");
	st3.kor=Double.parseDouble(sc.nextLine());// Doble.parseDouble(sc.nextLine));
	System.out.println("영어점수 입력>>");
	st3.eng=Double.parseDouble(sc.nextLine());
	System.out.println("수학점수 입력>>");
	st3.math=Double.parseDouble(sc.nextLine());
	st3.score=st3.kor+st3.eng+st3.math;
	st3.avg=st3.score/3;
	
	
	Student.totalCount=Student.totalCount+1;
	Student.totalScore=Student.totalScore+st3.score;
	Student.totalAvg = Student.totalScore / (Student.totalCount * 3);
	
	System.out.println("최종결과 출력");
	System.out.println(String.format("학생3: 이름:%s 나이:%d",st3.name,st3.age));
	System.out.println(String.format("국어:%f 영어:%f 수학:%f 총점:%f"
			+"평균:%f",st3.kor,st3.eng,st3.math,st3.score,st3.avg));
	
	
	
	
	System.out.println("종합정보");
	System.out.println(String.format("전체 학생 총 점수:%f 평균:%f 학생수:%d",
	Student.totalScore,Student.totalAvg,Student.totalCount));
	
	
	
	
	
	
	
	
	
	
	}

}
