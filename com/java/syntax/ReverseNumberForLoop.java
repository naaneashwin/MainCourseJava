package com.java.syntax;

import java.util.Scanner;

public class ReverseNumberForLoop {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number which has more than 3 digits");
		int i = 326589;//s.nextInt();
		System.out.println("The entered number = "+i);
		s.close();
		int rev_num=0;
		for ( ; i!= 0; i /=10) {
			int rem = i%10;
			rev_num = rev_num*10 + rem;
		}
		System.out.println("The reversed number = "+rev_num);
	}
}

