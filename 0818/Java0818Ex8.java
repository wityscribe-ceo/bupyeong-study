package com.the.dto;

import java.util.Objects;

public class Java0818Ex8 {

	private int age;
	private String name;
		
	

	//캡슐화 외부에서 직접 접근하지 못하게 private로 선언하고
	//메소드를 이용해서 접근하는 방법 
	//getter setter 방식을 이용해서 캡슐화 구현
	
	//1 생성자
	//2. getter setter
	//3. toString
	//4. hashcode and equals
	
	
	
	public Java0818Ex8(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {//해쉬를 사용하는 컬랙션에는 반드시 필요해야 문제가 발생하지 않는다.
		
		return Objects.hash(Integer.valueOf(age), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Java0818Ex8 other = (Java0818Ex8) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public Java0818Ex8() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Java0818Ex8 [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return this.age;
		
	}
	
	public void setAge(int age) {
		if(age<0) {
			this.age=0;
			System.out.println("나이는 음수를 넣을수 없습니다.");
		}
		this.age=age;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
