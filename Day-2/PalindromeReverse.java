package com.blz.javabasic;

public class PalindromeReverse {
public static void main(String args[]) {

	int i = 123;
	int remain;
	int reverse = 0;
	int temp;
	temp = i;
	System.out.println("orignal number is - 123");
	
	for(int num = i ; num>0 ;) {
		remain = num%10;
		reverse = reverse*10 + remain;
		num = num/10;
	}
	System.out.println("Reversed number: " +reverse);
	if(temp == reverse) {
		System.out.println("Palindrome number");
	}
	else {
		System.out.println("Not a Palindrome number");
	}








}











}