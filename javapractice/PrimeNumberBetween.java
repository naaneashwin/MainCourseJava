package javapractice;

import java.util.Scanner;

public class PrimeNumberBetween {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = scan.nextInt();
		System.out.print("Enter the second number: ");
		int last = scan.nextInt();
		scan.close();
		for (int i=first; i<=last;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}
	}
	public static boolean isPrime(int n) {
		boolean flag=false;
		if (n<2) {
			flag = false;
		}
		else if (n==2) {
			flag = true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
				else flag=true;
			}
		}
		return flag;
	}
}
