package com.blz.javabasic;

public class ReverseIntegerNum {

	public static void main(String[] args) {
		int num = 567;
		int remain;
		int reverse = 0;
		System.out.println("orignal number is - 567");
		
		while(num>0) {
			remain = num%10;
			reverse = reverse*10 + remain;
			num = num/10;
		}
		System.out.println("Reversed number: " +reverse);
		

	}

}
