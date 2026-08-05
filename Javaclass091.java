package Java.com.ex;

import com.the.dto.Human;
//                  ^
// 다른 폴더에 있는 지정된이름 이 많을때 위에
//휴먼이 아닌 .*로 쓰면 모든걸 쓸수있다.


public class Javaclass09 {

	public static void main(String[] args) {
		
	/*	
		Car c= new Car();
		c.brand="현대";
		c.model="소나타";
		c.year=2020;
		
		c.year=c.year+20;
		
		System.out.println(c.brand);
		System.out.println(c.model);
		System.out.println(c.year);
		
		//기아 투산 1841년식 데이터 정보를 추가해서 출력
		
		Car d= new Car();
		d.brand="기아";
		d.model="투싼";
		d.year=1101;
		
		d.year=d.year+740;
		
		System.out.println(d.brand);
		System.out.println(d.model);
		System.out.println(d.year);
		
		*/
		
		com.the.dto.Human h= new com.the.dto.Human();
		h.name="홍길동";
		h.age= 19;
		h.height= 166.6;
		
		System.out.println("내이름은:"+ h.name);

		Human h2=new Human();
		h2.name="홍길도";
		System.out.println(h2.name);
		
		
		
	}

}
