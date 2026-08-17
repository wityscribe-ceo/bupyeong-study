package com.the.ex;
class Human{
	 public static int totalCount=0;// 클래스 필드
	public String name;// 인스턴스 필드 
	public int age;
	//사용자가 생성자를 건들이면 컴파일러가 기본생성자를 만들어주지 않는다. 
	public Human() {//overload overide
		
	}
	public Human(String name) {
		this.name=name;
		this.age=0;
		
	}
	// 만드는 방법 public  클래스이름( 매개변수 초기값으로 사용할 매개변수)
	public Human(String name,int age) {
		this.name=name+"nim";
		this.age=age;
		
	}
}
public class Java0814EX1 {

	public static void main(String[] args) {
		//생성자는 선언한 클래스를 인스턴스화 해서 초기값을 설정할때 사용한다.
		Human h4=new Human("gilsu");
		System.out.println(h4.name+h4.age);

		
		System.out.println(Human.totalCount);
		Human h3=new Human("홍길동",20);
		System.out.println(h3.name+h3.age);
		
		Human h1= new Human();//int a=10; h1 을 인스턴스화,
		h1.name="홍길동";
		h1.age=20;
		System.out.println("정보:"+h1.name+h1.age);
		Human.totalCount++;
		System.out.println(Human.totalCount);
		
		Human h2=new Human();
		h2.name="hong";
		h2.age=21;
		System.out.println("정보:"+h2.name+h2.age);
		Human.totalCount++;
		System.out.println(Human.totalCount);

	}

}
