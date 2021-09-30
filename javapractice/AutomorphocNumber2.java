package javapractice;

import java.util.Scanner;

public class AutomorphocNumber2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		if(isAutomorphic(num)) {
				System.out.println("Automorphic Number");
			}
			else System.out.println("Not Automorphic Number");
		s.close();
		
	}
	public static boolean isAutomorphic(int num) {
		
		int square = num*num;
		boolean flag = true;
		for(;num>0;) {
			if(square%10!=num%10) {
					flag = false;
					break;
			}
			num/=10;
			square/=10;
		}
		return flag;
	}
}
