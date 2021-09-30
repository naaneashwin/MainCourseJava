package javapractice;

import java.util.Scanner;

public class PetersonNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = s.nextInt();
		s.close();
		int rem,sumOfFact=0,fact,temp=x; 
		for(;temp>0;) {
			rem =temp%10;
			fact = factorial(rem);
			sumOfFact = sumOfFact+fact;
			temp/=10;
		}
		if(sumOfFact==x) {
			System.out.println("Peterson Number");
		}
		else System.out.println("Not Peterson Number");
	}
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else 
			return num*factorial(num-1);
	}
}
