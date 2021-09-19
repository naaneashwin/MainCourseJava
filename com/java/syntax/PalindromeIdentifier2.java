package com.java.syntax;
//import java.util.Scanner;
public class PalindromeIdentifier2 {
	/*public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String word = s.next();
		s.close();
		int l = word.length();
		int c = 0;
		for (int i =0; i<=l/2 ;i++) {
			char f = word.charAt(i);
			for (int k =l-1; k>(l/2) ;k--) {
				char b = word.charAt(k);
				if (f==b) {
					c += 1;
					break;
				}
			}
		}
		if (c==l/2) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}*/
	public static void main (String args[]) {
		/*String str = "nayyan" , str2="", str1 = "";
		int l = str.length();
		int c = 0;
		for (int i = 0; i<=l/2; i++) {
			str1 +=str.charAt(i);
		}
		for (int j = l-1; j>=l/2;j--) {
			str2 +=str.charAt(j);
		}
		if (str1.equals(str2)) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not palindrome");
		*/
		String str1 = "nayjuyan";
		int f=0;
		int b=str1.length()-1;
		while (f<=b) {
			if(str1.charAt(f)!=str1.charAt(b)) {
				break;
			}
			b--;
			f++;
		}
		if (f>b) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not palindrome");
	}
}
