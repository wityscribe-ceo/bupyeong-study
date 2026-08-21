package com.the.ex;

import java.util.ArrayList;

class Pet{
	public void eat() {
		System.out.println("1.애완동물이 밥을 먹습니다.");
	}
	public void move() {
		System.out.println("2.애완동물이 움직입니다.");
		
	}
}


class Cat extends Pet{
	public void eat() {
		System.out.println("3.cat이 생선을 먹습니다.");
	}
	public void work() {
		System.out.println("4.쥐를 잡습니다.");
		
	}
}
class Dog extends Pet{
	public void eat() {
		System.out.println("5.강아지가 뼈다귀를 먹습니다.");
		
	}
	public void hunting() {
		System.out.println("6. 강아지가 꿩을 사냥합니다.");
	}
}
public class ExOverride {

	public static void main(String[] args) {
		//다형성을 이용해서 3개의 클래스를 ArrayList에 담아서 조작해보자.
		ArrayList<Pet> list=new ArrayList<>();
		//List<Pet> l=new ArratList<>();
		list.add(new Pet());
		list.add(new Cat());
		list.add(new Dog());
		
		for(Pet p:list) {
			p.eat();
		}
		//100개의 동물 클래스가 뭘 먹는지 출력하는 메소드를 만들어 출력하시오.
		
		
	//다형성
		//부모를 상속받은 자식은 부모 변수에 넣을 수 있다.
//		부모 클래스는 Pet
		// 자식 클래스는 Dog, Cat
		Pet p1=new Pet();
		Pet p2=new Dog();
		Pet p3=new Cat();
	
//		Pet 클래스가 들어가 있는경우
//		p1.eat();
//		p1.move();
		
//		Dog클래스가 들어가 있는경우
		// Pet eat move 중 같이 있는 자식 eat 이 찍힘
//		p2.eat();
//		p2.move();
//		
//		p3.eat();
//		p3.move();
//		
//		
		//다형성 특징
		//1. 부모에 자식을 넣을수 있다.
		//2. 오버라이드된 메소드는 들어있는 인스턴스에 메소드가 실행된다.
		
		
//		Pet p1=new Pet();
//		p1.eat();
//		p1.move();
//
//		Cat c1=new Cat();
//		c1.eat();
//		c1.move();
//		c1.work();
//		
//		Dog d1=new Dog();
//		d1.eat();
//		d1.move();
//		d1.hunting();
	}

}
