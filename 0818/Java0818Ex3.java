package com.the.ex;

public class Java0818Ex3 {

	public static int totalStudents=0;
	public String name;
	public int age;
	static {
		System.out.println("학생 클래스가 로드되었습니다!");
	}
	
	public Java0818Ex3(String name, int age) {
		this.name=name;
		this.age=age;
		totalStudents++;
	}
	
	public static void printTotalStudents() {
		System.out.println("전체 학생 수:"+totalStudents);
	}
	
	public void introduse() {
		System.out.println("이름:"+ name +", 나이:"+ age);
		
	 }
	
    }


