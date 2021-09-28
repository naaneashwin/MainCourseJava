package com.java.syntax;
import java.util.*;

public class PerfectDatatypeDetector {
	public static void main(String[] args) {Scanner scan = new Scanner(System.in);
	int value = scan.nextInt();
	for (int i=0; i <value;i++) {
		try {
			long n = scan.nextLong();
			System.out.println(n+" can be fitted in:");
			if(n>=-128&&n<=127) {
				System.out.println("*byte");
			}
			if (n>= -Math.pow(2, 15) && n<=Math.pow(2, 15)-1) {
				System.out.println("*short");
			}
			if (n>= -Math.pow(2, 15) && n<=Math.pow(2, 15)-1) {
				System.out.println("*short");
			}
			if (n>= -Math.pow(2, 31) && n<=Math.pow(2, 31)-1) {
				System.out.println("*int");
			}
			if (n>= -Math.pow(2, 63) && n<=Math.pow(2, 63)-1) {
				System.out.println("*long");
			}
		}
		catch(Exception e) {
			System.out.println(e+" can't be fitted anywhere.");
		}
	}
	}
}
