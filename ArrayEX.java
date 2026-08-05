package com.the.ex;

import java.util.Arrays;

public class ArrayEX {

	public static void main(String[] args) {
		int[] numbers= {9,1,2,3,4,5};
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		System.out.println(numbers[4]);
		System.out.println(numbers[1]);
		
		numbers[3]=30;
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(numbers[0]+ numbers[5]);
		
		numbers=new int[10];
		System.out.println(Arrays.toString(numbers));
		
		int [] arrayWithSize=new int [5];
		System.out.println(Arrays.toString(arrayWithSize));
		
		System.out.println(arrayWithSize.length);
		
		
		
	}

}
