package com.java.syntax;

public class PrimeNumBetweenUsingNonReturnMethod {
	public static void main(String args[]) {
		int from = 15;
		int to = 80;
		System.out.println("The prime numbers between "+from+" and "+to+" are below");
		isprime(from, to);
		
		}
	public static void isprime(int m, int n) {
		boolean flag= false;
		for (int i =m; i<=n;i++) {
			if (i<=0 || (i%2)==0) {
				flag=true;
			}
			else {
				for (int j=3; j<=i/2;j++) {
					if (i%j==0) {
						flag=true;
						break;
					}
					else flag=false;
				}
			}
			if (!flag) {
				System.out.println(i);
			}
		}
	}
}

