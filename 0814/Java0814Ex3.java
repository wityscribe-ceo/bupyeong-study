package com.the.ex;
class Function2{
	//void  리턴값이 없다.  return;을 생략할수 있다.
	// return 을 만나면 뒤에오는 자료형을 메소드 종료후 넘겨준다.
	//  return  을 만나면 메소드가 종료된다.
	//int double String boolean[]
	public static void f2(String name,int a) {
		for (int i=0;i<a;i++) {
			System.out.println(name+"님 만나서 반가워요");
		}
	}
	
	public static void f1() {
		System.out.println("hello");
		return;
	}
	
	public static boolean[] f3(int length) {
		boolean[] arr= new boolean[length];
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=true;
			}else {
				arr[i]=false;
			}
		}
		return arr;
	}
	
}
	public class Java0814Ex3 {
		public static void main(String[] args) {
		Function2.f1();
		
		Function2.f2("홍길동1", 4);
		
		
		boolean[] arr=Function2.f3(10);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
