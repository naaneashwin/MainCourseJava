package javapractice;

import java.util.Scanner;

public class AutomorphicNumberBetween {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number start: ");
		int start = s.nextInt();
		System.out.print("Enter the number start: ");
		int last = s.nextInt();
		for(int i=start; i<=last; i++) {
			if(AutomorphocNumber2.isAutomorphic(i)) {
				System.out.println(i+" is an automorphic number");
			}
		}
	}
}
