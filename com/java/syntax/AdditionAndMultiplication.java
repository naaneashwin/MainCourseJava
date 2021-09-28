package com.java.syntax;

import java.util.Scanner;

public class AdditionAndMultiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		System.out.print("Enter second number: ");
		int b = scan.nextInt();
		scan.close();
		add(a,b);
		multiply(a,b);
	}
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of "+a+" & "+b+" is "+sum);
	}
	public static void multiply(int a, int b) {
		int product = a*b;
		System.out.println("The product of "+a+" & "+b+" is "+product);
	}
}
