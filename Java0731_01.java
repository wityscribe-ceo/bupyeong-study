package Java.com.ex;

public class Java0731_01 {

	//전역변수
	public static int globalCounter=0;
	
	//전역상수
	public static final int MY_COUNT=0; 
	public static void main(String[] args) {
		
	Java0731_01.globalCounter=10;
		int localCoounter=20;
	
		System.out.println(Java0731_01.globalCounter+localCoounter);
		Java0731_01.globalCounter=Java0731_01.globalCounter+localCoounter;
		
		
		

	}

	
	
	
}
