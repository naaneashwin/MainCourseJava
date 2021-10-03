package com.java.syntax;

import java.util.Scanner;

public class BitwiseChecker {
	public static void main(String[] args) {
		//7 6 5 4 3 2 1 0
		//0 0 0 0 0 0 0 1; = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		System.out.println("Enter the bit number to check:");
		int bit = s.nextInt();
		int mask = 1;
		if(bit>1) {
			mask = mask<<bit;
		}
		int check = num&mask;
		if(check > 0) {
			System.out.println("Set");
		}
		else System.out.println("Clear");
	}
}
