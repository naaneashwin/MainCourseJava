package javapractice;

import java.util.Scanner;

public class StarPatternLeftPascal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the rows you want : ");
		int row = scan.nextInt();
		scan.close();
		for(int i=0; i<row;i++) {
			for(int j=1; j<=row;j++) {
					if(j<row-i) {
						System.out.print("  ");
					}else System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row+1; i<2*row;i++) {
			for(int j=1; j<=row;j++) {
					if(j<=i-row) {
						System.out.print("  ");
					}
					else System.out.print("* ");
			}
			System.out.println();
		}
	}
}
