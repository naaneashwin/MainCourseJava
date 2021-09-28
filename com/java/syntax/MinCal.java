package com.java.syntax;
import java.util.*;

public class MinCal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you want to perform addition or subtraction, if addition type sum, "
				+ "if multiplication type multiply : ");
		String oper = scan.nextLine();
		System.out.print("Enter you first number: ");
		int a = scan.nextInt();
		System.out.print("Enter you second number: ");
		int b = scan.nextInt();
		scan.close();
		String str1 = "sum", str2 = "multiply";	
		if (oper.equals(str1)) {
			add(a,b);
		}
		if (oper.equals(str2)) {
			multiply(a,b);
		}
	}
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("The sum of two numbers is "+c);
	}
	public static void multiply(int a, int b) {
		int c = a*b;
		System.out.println("The product of two numbers is "+c);
	}
}
