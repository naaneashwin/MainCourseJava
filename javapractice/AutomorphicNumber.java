package javapractice;

import java.util.Scanner;

public class AutomorphicNumber {
//If the square of the number contains the number in the end is called 
	//Automorphic number
	//Examples 6-36
	//5-25
	//25-625
	//76-5776
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		int square = num*num,numR, squareR;
		boolean flag = false;
		aa: for(;num>0;) {
			numR = num%10;
			for(;square>0;) {
				squareR = square%10;
				if(squareR==numR) {
					flag = true;
					square/=10;
					break;
				}
				else {
					flag = false;
					break aa;
				}
			}
			num/=10;
		}
		if(flag) {
			System.out.println("Automorphic Number");
		}
		else System.out.println("Not Automorphic Number");
	}
}
