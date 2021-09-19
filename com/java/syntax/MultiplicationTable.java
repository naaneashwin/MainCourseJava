package com.java.syntax;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String atgs[]) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int tabof = s.nextInt();
		System.out.println("Upto which number");
		Scanner s1 = new Scanner(System.in);
		int upto = s1.nextInt();
		s1.close();
		s.close();
		int pro = 0;
		for (int i=1; i<=upto;i++) {
			pro = tabof*i;
			System.out.println(tabof+" x "+i+" = "+pro);
		}
	}
}
