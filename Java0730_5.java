package Java.com.ex;

public class Java0730_5 {

	public static void main(String[] args) {
	
		/*
	String str=String.format("안녕 %s 내나이는 %d 내키는 %f", "방가워",12,182.1);	
	System.out.println(str);
		
	System.out.println(String.format(":%f:", 3.141592));
	System.out.println(String.format(":%+f:", 3.141592));
	System.out.println(String.format(":%10f:", 3.141592));
	System.out.println(String.format(":%10.3f:", 3.141592));
	System.out.println(String.format(":%-10f:", 3.141592));
	System.out.println(String.format("%%f"));
	
	
	

	int age= 156;
	String name = "hong";
	double height = 175.3;
	
	String total= String.format("이름:%s, 나이: %d , 키: %f", name ,age , height);
	System.out.println(total);
		
		
	*/	
		java.util.Scanner cho3 = new java.util.Scanner(System.in);
		System.out.println("첫번째 정수 입력>>");
		int i1=Integer.parseInt(cho3.nextLine());
		System.out.println("입력된 정수:" + i1);
		
		System.out.println("두번째 정수 입력>>");
		int i2=Integer.parseInt(cho3.nextLine());
		System.out.println("입력된 정수:" + i2);
		
		int c1= i1 / i2;
		int c2= i1 % i2;
		
		System.out.println("몫은 " + c1 + "이고, 나머지는 " + c2 +"입니다.");
		
		
		
		
		
		
	}

}
