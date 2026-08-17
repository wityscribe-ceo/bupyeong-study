package com.the.ex;
class Attendance{
	public static final int ATTENDANCE=0;
	public static final int ABSENCE=1;
	public static final int LATE=2;
	public static final int EARLY_LEAVE=3;
	public static final String[] STATUS_NAME={"출석", "결석" , "지각" , "조퇴"};
	
	
	
}
public class Java0812Ex4 {

	public static void main(String[] args) {
		
		String student1="결석";
		String student2="출석";
		String student3="쉼";
		
//		int st1=0;
//		int st2=1;
//		int st3=0;
//		
		
		int st1=Attendance.ATTENDANCE;
		int st2=Attendance.ABSENCE;
		int st3=Attendance.ATTENDANCE;
		int st4=Attendance.EARLY_LEAVE;
		
		System.out.println(st4);
		
		System.out.println(Attendance.STATUS_NAME[0]);
		System.out.println(Attendance.STATUS_NAME[Attendance.ABSENCE]);
		
		
		//1~4  번 학생 출결을 출력해보자.
		System.out.println(Attendance.STATUS_NAME[st1]);
		System.out.println(Attendance.STATUS_NAME[st2]);
		System.out.println(Attendance.STATUS_NAME[st3]);
		System.out.println(Attendance.STATUS_NAME[st4]);
		
		int students[]=new int[4];
		students[0]=st1;
		students[1]=2;
		students[2]=Attendance.ATTENDANCE;
		students[3]=students[0];
		
		for(int i=0;i<students.length;i++) {
	System.out.println(i+"번째 학생은"+Attendance.STATUS_NAME[students[i]]);
		}
		
	}

}
