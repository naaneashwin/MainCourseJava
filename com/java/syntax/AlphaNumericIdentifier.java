package com.java.syntax;

import java.util.Scanner;

public class AlphaNumericIdentifier {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		scan.close();
		char c='\0';
		int d = -1;
		int tracer = 0;
		int l = str.length();
		for(int i=0; i<str.length();i++) {
			c=str.charAt(i);
			d = c;
			if ((d>47 && d<58)||(d>64 && d<91)||(d>96 && d<123)) {
				tracer +=1;
			}
			else {
				tracer += 0;
			}
		}
		if (tracer == l) {
			System.out.println("Alphanumeric");
		}
		else System.out.println("Not Alphanumeric");
	}
}
