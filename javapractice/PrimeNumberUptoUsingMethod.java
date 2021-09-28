package javapractice;

import java.util.Scanner;

public class PrimeNumberUptoUsingMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = scan.nextInt();
		scan.close();
		primeNumbersUpto(a);
		
		
		
	}	
	public static void primeNumbersUpto(int n) {
		
		for(int i=2; i<=n; i++) {
			int count =0;
			for (int j=1; j<=i;j++) {
				if (i%j==0) {
					count+=1;
				}
				
			}
			if(count ==2) {
				System.out.println(i);
			}
		}
		
	}
}
