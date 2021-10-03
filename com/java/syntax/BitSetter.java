package com.java.syntax;

import java.util.Scanner;

public class BitSetter {
	public static void main(String[] args) {
		//7 6 5 4 3 2 1 0
		//0 0 0 0 0 0 0 1; = 1;
		//128 64 32 16 8 4 2 1
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		System.out.println("Enter the bit number to check:");
		int bit = s.nextInt();
		int mask = 1;
		s.close();
		System.out.println(num = (num|(mask<<bit))); 
	}
}

