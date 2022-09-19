package com.blz.javabasic;
import java.util.Scanner;
public class VowelConsonentCheck {public VowelConsonentCheck() {
	// To check Vowel Consonant
}
	public static void main(String[] args) {
		System.out.println("Enter Character:  ");
		
		Scanner sc = new Scanner(System.in);
		char alphabets = sc.next().charAt(0);
		
		switch (alphabets)
		{
		case 'A':
			System.out.println("Vowel = A");
			break;
			
		case 'E':
			System.out.println("Vowel = E");
			break;
			
		case 'I':
			System.out.println("Vowel = I");
			break;
			
		case 'O':
			System.out.println("Vowel = O");
			break;
		
		case 'U':
			System.out.println("Vowel = U");
			break;
			
		default :
			System.out.println("This Is A Consonant");
		
				
		
		
		}
		
		
		

	}

}
