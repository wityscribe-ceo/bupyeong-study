package com.the.ex;

import java.nio.file.spi.FileSystemProvider;

public class Java0818Ex9 {

	public static void main(String[] args) {
	com.the.dto.Java0818Ex8 h= new com.the.dto.Java0818Ex8();
	//h.age=10; private로 선언해서 접근이 불가능
	h.setAge(20);
	System.out.println(h.getAge());
	
	h.setName("홍길동");
	System.out.println(h.getName());
	com.the.dto.Java0818Ex8 h1= new com.the.dto.Java0818Ex8 (10,"홍길동");
	com.the.dto.Java0818Ex8 h2= new com.the.dto.Java0818Ex8 (10,"홍길동");
	
	System.out.println(h);
	System.out.println(h.toString());
	System.out.println(h1);
	System.out.println(h2);
	
	System.out.println(h1.getAge()==h2.getAge());
	System.out.println(h1.getName()==h2.getName());
	
	System.out.println(h1.equals(h2));//true
	//h1.equals(h2)가 true를 생성하려면 equals를 제정의해야한다.
	
	
	}

}
