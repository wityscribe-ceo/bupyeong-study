package com.the.ex;

public class MyException {

	public static void main(String[] args) {
		//프로그램 에러 런타임 에러, 컴파일에러
		//컴파일에러 int a=10.4; 문법적오류 프로그램 실행전 컴파일러가 잡아줌
		//건타임 에러 int a= Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		//런타임 에러는 예외처리를 통해 종료되지 않고 계속 동작하게 할수 있다.
		// 예외처리 방법: try catch finally를 사용
//		try {// 예외 발생 가능 부분을 중괄호로 묶는다.
//			int b=10/0;
//		System.out.println("정수 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)nextLine());
//		System.out.println("프로그램 종료");
//		}catch(NumberFormatException e) {// 발생한 예외 종류에 맞춰 처리함
//			System.out.println("숫자만 입력하세요");
//		//	e.printStackTrace();
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}catch(Exception e) {
//			System.out.println("예외 발생");
//		}finally {//예외 유무 관계없이 실행
//			System.out.println("무조건 실행");
//		}
//		
//		for(int i=3;i>=-3;i--) {
//		     try {
//		          int a=5/i;
//		          //동작 할수도 있고 안할수도 있다. 예외가 발생하면 동작하지 않음
//		          System.out.println(i);
//		     }catch(ArithmeticException e) {
//		          e.printStackTrace();
//		          System.out.println("0으로 나눌수 없습니다.");
//		     }catch(Exception e) {
//		          e.printStackTrace();
//		          System.out.println("알수 없는 예외");
//		     }finally {
//		          System.out.println(i+"작업을 완료하였습니다.");//반드시 실행된다. 예외가 발생해도 실행 않아도 실행
//		}
//}
//		try {
//			int num = Integer.parseInt("안녕");
//			System.out.println("정상 동작시만 출력");
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//		} finally {
//			System.out.println("예외와 관계없이 출력");
//		}
//	

		// 숫자로 변경할수 없는 문자열이 문제 
		
		
		
//		 try {
//	         int a=5/i;
//	         //동작 할수도 있고 안할수도 있다. 예외가 발생하면 동작하지 않음
//	         System.out.println(i);
//	    }catch(Exception e) {
//	         e.printStackTrace();
//	         System.out.println("알수 없는 예외");
//	    }catch(ArithmeticException e) {
//	         e.printStackTrace();
//	         System.out.println("0으로 나눌수 없습니다.");
//	    }finally {
//	         System.out.println(i+"작업을 완료하였습니다.");//반드시 실행된다. 예외가 발생해도 실행 않아도 실행
//	    }

		 
		 // Exception 의 상위 계열이 위로 올라와서 문제
		
		
		
		
		
 }
}