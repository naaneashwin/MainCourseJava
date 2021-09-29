package javapractice;
import java.util.*;

public class StarPatternRightTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the rows you want : ");
		int row = scan.nextInt();
		scan.close();
		for(int i=0; i<row;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
