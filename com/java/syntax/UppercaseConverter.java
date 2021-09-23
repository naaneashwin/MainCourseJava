package com.java.syntax;
import java.util.*;
public class UppercaseConverter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input");
		String str = scan.nextLine();
		scan.close();
		String converter = "";
		for (int i =0; i<str.length();i++) {
			char c =  str.charAt(i);
			int n = c;
			int m = 0;
			char d = '\0';
			char e ='\0';
			int tracer = 0;
			{
				if (n>96 && n<123) {
					m = n-32;
					d = (char)m;
					tracer = 1;
				}
				else {
					e = (char)n;
					tracer=2;
				}
				
				
			}
			if (tracer==1) {
				converter = converter + d;
			}
			else if (tracer ==2) {
				converter = converter +e;
			}
		}
		System.out.println(converter);
	}
}
