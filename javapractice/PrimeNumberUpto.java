package javapractice;

import java.util.Scanner;

public class PrimeNumberUpto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
		int count=0;
		scan.close();
		if (n<0) {
			System.out.println("Run the progran again and please enter a positive integer");
		}
		else if (n==0||n==1) {
			System.out.println("No prime number");
		}
		else if (n==2) {
			System.out.println("2");
		}
		else {
			System.out.println("2");
			for (int i=3; i<=n; i++) {
					for (int j=2; j<i;j++) {
						if (i%j==0) {
							count = 1;
							break;
						}	
						else count =2;
					}
					if(count==2) {
						System.out.println(i);
					}
				}
			}
		}
	
}
