package com.java.syntax;



public class NameLength {
	public static void main (String args[]) {
		String name = "    ";
		int count=0;
		for (int i =0; i<name.length();i++) {
			count = count +1;
		}
		if (count <=0) {
			System.out.println("Empty");
		}
		else if (count <4) {
			System.out.println("Short");
		}
		
		else System.out.println("Long");

	}
}
