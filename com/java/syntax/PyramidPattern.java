package com.java.syntax;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String args[]) {
		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
		for (int i=1; i<=value; i++) {
			{
			for (int j=i; j<value; j++) {
				System.out.print("  ");
			}
			for (int k=1; k<(2*i);k++) {
				System.out.print("* ");
			}
			}
			System.out.println();
		}
}
}