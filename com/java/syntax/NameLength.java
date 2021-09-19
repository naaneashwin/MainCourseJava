package com.java.syntax;



public class NameLength {
	public static void main (String args[]) {
		String name = "hbsdjn";
		char c;
		int length=0;
		while(name.charAt(length)!='\n') {
			length++;
		}
		if(length<4) {
			System.out.println("less");
		}
		else {
			System.out.println("more");
		}


	}
}
