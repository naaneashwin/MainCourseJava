package com.java.syntax;

import java.util.Scanner;

public class Pattern {
	public static void main (String args[]) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number");
		int value = n.nextInt();
		n.close();
		for (int i = 0; i<value; i++) {
			for (int j=0; j<=i;j++) {
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}

