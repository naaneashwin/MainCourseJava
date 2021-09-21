package com.java.syntax;

import java.util.Scanner;

public class DiamondPattern {
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
		for (int l=value+1; l<2*value;l--) {
			{
				for (int m=((2*value)-1-l);m>1;m--) {
					System.out.print("  ");
				}
				for (int n=((2*value)-l+1);n>1;n--) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
}
}
