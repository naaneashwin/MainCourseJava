package com.java.syntax;

public class PrimeNumBetween {
	public static void main(String args[]) {
		int from = 15;
		int to = 80;
		System.out.println("The prime numbers between "+from+" and "+to+" are below");
		for (int i =from; i<=to; i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isprime(int n) {
		if (n<=1) {
			return false;
		}
		else if (n%2==0) {
			return false;
		}
		else {
			for(int i = 3; i<=(n/2); i++) {
				if (n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
