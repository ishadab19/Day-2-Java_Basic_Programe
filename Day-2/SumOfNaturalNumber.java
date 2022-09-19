package com.blz.javabasic;

public class SumOfNaturalNumber {
public static void main(String[]args) {
	int num = 10;
	int sum = 0;
	
	while(num>0) {
		
		sum = sum + num;
		num--;
	}
	System.out.println("sum= "+sum);
}
}
