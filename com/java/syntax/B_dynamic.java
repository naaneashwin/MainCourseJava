package com.java.syntax;

import java.util.Scanner;

public class B_dynamic {
	public void addition() {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first value to add");
		int a = ab.nextInt();
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter second value to add");
		int b = abc.nextInt();
		int sum = a + b;
		System.out.println("The sum of two num is = "+sum);
		subtraction();
		ab.close();
		abc.close();
	}
	private void subtraction() {
		Scanner abcd = new Scanner(System.in);
		System.out.println("Enter first value to subtract");
		int a = abcd.nextInt();
		Scanner abcde = new Scanner(System.in);
		System.out.println("Enter second value subtract");
		int b = abcde.nextInt();
		int diff = a-b;
		System.out.println("The difference of two num is = "+diff);
		abcd.close();
		abcde.close();
	}
}
