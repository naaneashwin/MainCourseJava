package operators;

import java.util.Scanner;

public class findOddOrEvenUsingBitwise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		
		int mask = 1;
		if((a&mask)==1) {
			System.out.println("Using AND method Odd");
		}
		else System.out.println("Using AND method Even");

		if((a^1)==a+1) {
			System.out.println("Using XOR method Even");
		}
		else System.out.println("Using XOR method Odd");
		
		if((a|1)==a) {
			System.out.println("Using OR method Odd");
		}
		else System.out.println("Using OR method Even");
}
}
