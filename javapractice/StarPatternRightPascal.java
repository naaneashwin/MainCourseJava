package javapractice;

import java.util.Scanner;

public class StarPatternRightPascal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the rows you want : ");
		int row = scan.nextInt();
		scan.close();
		for(int i=1; i<=row;i++) {
			for(int j=1; j<=i;j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<row;i++) {
			for(int j=row; j>i;j--) {
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
