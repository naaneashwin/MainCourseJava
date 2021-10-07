package com.java.syntax;
import java.util.*;
public class Pangram {
	public static void main(String...args) {
		//When a word contains all the letters in English alphabet
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence/word:");
		String str = s.nextLine();
		s.close();
		int count = 0;
		for(char i= 'a'; i<='z';i++) {
			for(int j=0; j<str.length();j++) {
				if((i^str.charAt(j))==0) {
					count++;
					break;
				}
			}
		}
		if(count >=26) System.out.println("True");
		else System.out.println("False");
	}
}
