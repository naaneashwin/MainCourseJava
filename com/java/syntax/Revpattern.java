package com.java.syntax;

import java.util.Scanner;

public class Revpattern {
	public static void main (String args[]) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number");
		int value = n.nextInt();
		n.close();
		for (int i = value; i>0; i--) {
			for (int j=i; j>0;j--) {
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}
