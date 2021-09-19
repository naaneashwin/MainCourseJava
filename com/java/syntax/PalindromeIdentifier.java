package com.java.syntax;

//import java.util.Scanner;

//import java.util.Scanner;

public class PalindromeIdentifier {
	public static void main (String[] args) {
		//Scanner s = new Scanner(System.in);
		String word ="nayyan";//s.next();
		//s.close();
		int l = word.length();
		//if (l%2==0)
		int c = 0;
		for (int i =0; i<=l/2 ;i++) {
			char f = word.charAt(i);
			for (int k =l-1; k>(l/2) ;k--) {
				char b = word.charAt(k);
				if (f==b) {
					c += 1;
				}
			}
		}
		if (c==l/2) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		/*String original = "";
		String reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any name or number");
		original = s.next();
		int l = original.length();
		s.close();
		for (int i = l-1; i>=0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}*/
	}
}
