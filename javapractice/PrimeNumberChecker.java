package javapractice;

import java.util.Scanner;

public class PrimeNumberChecker {
	// to check whether a number is prime or not
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int N = scan.nextInt();
		scan.close();
		boolean flag = false;
		if(N<0) {
			System.out.println("Run the progran again and please enter a positive integer");
		}
		else if (N==0||N==1) {
			flag = false;
		}
		else {
				for (int j=2; j<N;j++) {
					if (N%j==0) {
						flag = false;
						break;
					}
					else flag=true;
			}
		}
		if(flag) {
			System.out.println("Prime number");
		}
		else System.out.println("Not prime number");
	}	
}

