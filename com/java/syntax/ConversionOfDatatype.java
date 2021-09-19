package com.java.syntax;

import java.util.Scanner;

public class ConversionOfDatatype {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		scan.close();
		System.out.println("The entered number is integer and the value = "+num);
		float fl = num;
		System.out.println("The entered integer is converted to float = "+fl);
		double dble = num;
		System.out.println("The entered integer is converted to double = "+dble);
		long lng = num;
		System.out.println("The entered integer is converted to long = "+lng);
	}

}
