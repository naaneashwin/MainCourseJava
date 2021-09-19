package com.java.syntax;

import java.util.Scanner;

public class FibonacciSeq {
	public static void main(String args[]) {
		int fn = 1;
		int sn = 1;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter upto which value");
		int value = n.nextInt();
		n.close();
		int fib = 0;
		if (value<=0) {
			System.out.println("Enter a positive value , rerun the program");
		}
		else if (value ==1) {
			System.out.println(1);
		}
		else if (value ==2) {
			System.out.println(1);
			System.out.println(1);
		}
		else {
				System.out.println(1);
				System.out.println(1);
				while(value>2) {
					fib = fn + sn;
					System.out.println(fib);
					fn=sn;
					sn=fib;
					value--;
			}
		
		}
	
	}

}
