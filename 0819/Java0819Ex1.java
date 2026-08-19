package com.the.ex;
import java.util.*;
public class Java0819Ex1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		
		//어레이 리스트에 데이터 추가 .add()
		list.add("Milk");//0
		list.add("Bread");//1
		list.add("Eggs");//2
		System.out.println("초기 list:"+list);
		
		//특정 인덱스 위치에 요소 추가하는방법
		list.add(1,"Cheese"); //0,1 1위치에 추가됨 .add()
		System.out.println("요소추가 list:"+list);
		
		// 데이터 요소 접근get 및 size방법
		String item=list.get(0);//0번째 껄 .get()하다
		System.out.println("0번 인덱스 값:"+item);

		//요소 제거
		list.remove("Bread");//.remove() 삭제
		System.out.println("Bread 삭제 list:"+list);
		
		list.remove(2);//.remove() 2번삭제
		System.out.println("인덱스 2 삭제 list:"+list);
		 
		list.set(0,"Banana");//.set() 수정 하는것
		
		
		// list 내용 출력
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String element:list) {
			System.out.println(element);
		}
		
		
	}

}
