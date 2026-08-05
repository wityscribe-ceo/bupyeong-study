package Java.com.ex;

public class Java0730_1 {

	public static void main(String[] args) {
		// Scanner  
		
	// java.util.Scanner scanner =new java.util.Scanner(System.in);
		//     int         a     =      10   과 같은거다다  위아래
	
		
		java.util.Scanner sc =new java.util.Scanner(System.in);
	
		System.out.println("문자열을 입력해주세요");
		String str1=sc.nextLine();
		System.out.println("입력값은:"+str1);
	
		System.out.println("하나더 입력해주세요");
		String str2=sc.nextLine();
		System.out.println("두번째 입력값:"+str2);
		
		
	}

}
