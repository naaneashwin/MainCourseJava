package com.java.syntax;

public class ReverseString {
	public static void main(String args[]) {
		String str = "Geekster", revStr="";
		for (int i = str.length()-1;i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
	}
}
