package com.the.dto;

public class Java0818Ex2 {
	//클래스 필드
	public static int totalCount=0;
	//인스턴스 필드
	public String name="이름";
	public String id="학번";
	public int age=10;
	public static int getTotalCount() {
		return Java0818Ex2.totalCount;
	}
	public static void setTotalCount(int count) {
		Java0818Ex2.totalCount=count;
	}
	
	public void studentInfo() {
		System.out.println("학번:"+this.id);
		System.out.println("학생이름:"+this.name);
		System.out.println("나이:"+this.age);
	}
	
	//클래스 초기화 블록/static블럭/정적블록
	static {
		System.out.println("정적블록 실행 totalcount를 초기화");
		Java0818Ex2.totalCount=0;
	}
	//같은 이름으로 여러개의 생성자,메소드를 만들수 있는 방법을 overload 오버로드라한다.
	// 생성자 추가
	public Java0818Ex2() {//매개변수없는 생성자를 기본 생성자라고 한다.
		//특징은 사용자가 생성자를 만들지 않으면 컴파일러가 자동으로 만들어줌
		
		this("s/n","기본 생성자",10);
		
	}
	
	public Java0818Ex2(String name,int age) {
		this("s/n",name,age);// 생성자 최상단에 표시해야한다
		
	}
	// this 는 자기자신에 인스턴스 주소
	// this 는 생략할수 있고 지역변수랑 이름이 겹치면 생략할수 없다.
	public Java0818Ex2(String name,String id,int age) {
		Java0818Ex2.totalCount++;
		this.id=id;
		this.name=name;
		this.age=age;
		
		}
		
	}

