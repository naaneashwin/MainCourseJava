package javapractice;

import java.util.Scanner;

public class FibonacceSeriesWithRecursion {
	private static int n1=0,n2=1,n3=0;
	private static void Fib(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			Fib(count-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int count = scan.nextInt();
		scan.close();
		if (count<=0) {
			System.out.println("Run the proram again by entering a positive value");
		}
		else if (count==1) {
			System.out.println(n1);
		}
		else  if (count == 2) {
			System.out.println(n1+" "+n2);
		}
		else {
			System.out.print(n1+" "+n2);
			Fib(count-2);
		}
	}
	
}
