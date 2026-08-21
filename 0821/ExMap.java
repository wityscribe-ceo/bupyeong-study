package com.the.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class ExMap {

	public static void main(String[] args) {
		
		HashMap<String,Person> map=new HashMap<>();
		//Map 키 값으로 데이터를 저장하는 것
		//여기서는 키가 String, 값 Person Key, value
		//저장할때 키랑 값을 저장하고
		//불러올때는 키로 값을 불러온다.
		
		//추가
		map.put("java", new Person("Alice",25));
		map.put("Python", new Person("Bob",30));
		map.put("Javascript", new Person("Charlie",22));
		
		//찾기
		Person javaPerson=map.get("java");
		System.out.println(javaPerson);
		
		Person python=map.get("Python");
		System.out.println(python);
		
		//삭제
		map.remove("Python");
		
		//수정
		map.replace("java", new Person("David",26));
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		for(String Key:map.keySet()) {
		System.out.println("key:"+Key+"value:"+map.get(Key));
			
			
			
		}
		
		
		Iterator<Map.Entry<String,Person>> iterator=
				map.entrySet().iterator();
		 	while(iterator.hasNext()){
		 		Map.Entry<String,Person> entry=iterator.next();
		 		System.out.println("Key:"+entry.getKey()+"valye:"+entry.getValue());
		 	}

	}

	
		
	}

