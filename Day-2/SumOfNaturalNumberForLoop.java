package com.blz.javabasic;

public class SumOfNaturalNumberForLoop {

	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		
		for(int num = i ; num>0 ; num--) {
			sum = sum + num;
		}
		System.out.println("sum= " +sum);
	}

}
