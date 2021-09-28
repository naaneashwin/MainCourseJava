package com.java.syntax;
import java.util.*;
public class CheckingNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = scan.nextInt();
		scan.close();
		check(num);
	}
	public static void check(int num) {
		if(num>100) {
			System.out.println("Number is greater than 100");
			if (num>150) {
				System.out.println("Number is greater than 150");
			}
			else System.out.println("Number is less than 150");
		}
		else {
			System.out.println("Number is less than 100");
			if (num>50) {
				 System.out.println("Number is greater than 50");
			}
			else  System.out.println("Number is less than 50");
		}
	}
}
