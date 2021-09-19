package com.java.syntax;

import java.util.Scanner;

public class ReverseNumber {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number which has more than 3 digits");
		int i = s.nextInt();
		System.out.println("The entered number = "+i);
		s.close();
		int rev_num=0;
		while (i!=0) {
			{int rem = i%10;
			rev_num = rev_num*10 + rem;
			i /=10;
			}
		}
		System.out.println("The reversed number = "+rev_num);
	}
}
