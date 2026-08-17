package com.the.ex;

class Cat{
	public String name;
	public int age;
	public Cat(String name, int age) {
		this.name=name;
		this.age=age;
	}
}

class Function3 {
	public static Cat f1() {
		Cat c1=new Cat("나비",5);
		return c1;
	}
	
	 public static Cat[] f2(Cat[] arr) {
		 for (int i=0;i<arr.length;i++) {
			 if(arr[i].age>10) {
				 arr[i].age=arr[i].age+2;
				 
			 }
		 } 
		 return arr;
	 }
}
public class Java0814Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=Function3.f1();
		System.out.println(c1.name+c1.age);
		
		// 고양이  5마리중 10살 이상은 2살 더 더해서 출력해보자.
		
		Cat arr[]=new Cat[5];
		arr[0]=new Cat("나비1",15);
		arr[1]=new Cat("나비2",16);
		arr[2]=new Cat("나비3",13);
		arr[3]=new Cat("나비4",12);
		arr[4]=new Cat("나비5",2);
		
		 for(Cat c:arr) {
			 System.out.print(c.name+":"+c.age+ "   ");
			 
		 }
		 
		 Cat arr1[]=Function3.f2(arr);
		 System.out.println();
		 for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i].name+":"+arr1[i].age+ "   ");
			 
		 }

	}

}
