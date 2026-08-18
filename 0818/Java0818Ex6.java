package com.the.ex;

class samkak{
	public static double kor=100;
	public static double eng=80;
	public static double math=70;
	
		
	public static void total() {
		System.out.println("총점:"+(kor+eng+math));
	}
	public static void totalCount() {
		System.out.println("평균:"+(kor+eng+math)/3);
	}
	public samkak(int kor,int eng,int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		
		
	}
}


public class Java0818Ex6 {

	public static void main(String[] args) {
		
	samkak.total();
	samkak.totalCount();

	}

}
