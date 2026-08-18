package com.the.ex;
import com.the.dto.Java0818Ex2;
public class Java0818Ex1 {

	public static void main(String[] args) {
		System.out.println("시작");
		Java0818Ex2 st1=new Java0818Ex2();
		Java0818Ex2 st2=new Java0818Ex2();
		Java0818Ex2 st3=new Java0818Ex2("001","홍길순",20);
		st1.studentInfo();
		st2.studentInfo();
		st3.studentInfo();
//		System.out.println(st3.name+st3.id+st3.age);
		
		
		Java0818Ex2.setTotalCount(20);
		System.out.println(Java0818Ex2.getTotalCount());
		System.out.println("종료");
	
	}

}
