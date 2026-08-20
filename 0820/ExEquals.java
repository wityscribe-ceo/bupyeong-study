package com.the.ex;

import java.util.ArrayList;
import java.util.Objects;

class Human{
	
	public Human(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	public String name=new String("홍길동");
	public int age =10;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
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
		Human other = (Human) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
public class ExEquals {

	public static void main(String[] args) {
	
	ArrayList<Human> list=new ArrayList<>();
		list.add(new Human("홍길동",5));
		list.add(new Human("홍길수",15));
		list.add(new Human("홍길당",25));
		list.add(new Human("홍길숙",35));
		
		
		list.add(2,new Human("강아지",5));
		
		list.set(0, new Human("홍길남",33));
		list.remove(2);
		list.remove(new Human("홍길수",15));
		
		
		for(Human h:list) {
			System.out.println(h);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println(list.contains(new Human("홍길숙",51)));
		
		
		
		
		
		
		
		
		
		
//		Human h1= new Human();
//		Human h2= new Human();
//		
//		if(h1.getName().equals(h2.getName())&&h1.getAge()==h2.getAge()){
//			System.out.println("같은데이터");
//		}else {
//			System.out.println("다른 데이터");
//		}
//		
		
//		if(h1.name.equals(h2.name)&&h1.age==h2.age) {
//			System.out.println("같은 데이터");
//		}else {
//			System.out.println("다른 데이터");	
//		}
		
		
//		String name1=new String("홍길돌");
//		int age1=10;
//		
//		String name2=new String("홍길돌");
//		int age2=10;
//		
//		if(name1.equals(name2)&&age1==age2) {
//			System.out.println("같은 사람입니다");
//		}else {
//			System.out.println("다른 사람입니다");
//		}
		
		
		
	}

}
