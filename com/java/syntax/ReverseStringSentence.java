package com.java.syntax;

public class ReverseStringSentence {
	public static void main(String args[]) {
		String str = "Java is better than Python", reversedString = "";
		String []arr= str.split(" ");
		int l = arr.length;
		for (int i=0; i<l;i++) {
			//Object is defined because I have not defined static method below
			ReverseStringSentence obj = new ReverseStringSentence();
			String reversedStr = obj.reverser(arr[i]);
			reversedString = reversedString + " " + reversedStr;
		}
		System.out.println(reversedString);
			
	}
	private String reverser(String str) {
		String revarr= "";
		for (int i=str.length()-1; i>=0;i--) {
			revarr = revarr + str.charAt(i);
		}
		return revarr;
	}
}
