package com.the.ex;
import java.util.Arrays;
public class Ex01 {

	//double형 5개를 저장할 수있는 배열을 선언하고 배열에 3의 배수 
//	0 3 6 9 12 를 넣고 다음 sum 변수에 배열의 모든값을 저장해서 출력해보자.
	
	
	public static void main(String[] args) {
		
		double[] a = new double[5];
		a[0] = 0.0;
        a[1] = 3.0;
        a[2] = 6.0;
        a[3] = 9.0;
        a[4] = 12.0;
        
        double sum = a[0] + a[1] + a[2] + a[3] + a[4];
        
        
        System.out.println(String.format("모든 배열의 합산: %.1f", sum));
		
				
			
	}

}
