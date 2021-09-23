package com.java.syntax;

public class ReverseWordsOfSentence {
	public static void main(String args[]) {
		String str="Java is better than Python";
		String revstr="";
		String[] arr = str.split(" ");
		for (int i=arr.length-1; i>=0;i--) {
			revstr = revstr +" " +arr[i];
		}
		System.out.println(revstr);
	}
}
