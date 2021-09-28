package com.java.syntax;

import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = scan.nextInt();
		
		scan.close();
		if(eligibility(age)) {
			System.out.println("Eligible for voting");			
		}
		else System.out.println("Not eligible for voting");
		
		
	}
	public static boolean eligibility(int age) {
		boolean flag = false;
		if (age>=18) {
			flag = true;
		}
		return flag;
	}
}
