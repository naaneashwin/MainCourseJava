package TwoDimensionalArrays;
import java.util.*;
public class Q1 {
	//create and iterate through an 2d matrix
	public static void main(String args[]) {
		//int[][] arr = new int[5][3];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no.of rows: ");
		int row=s.nextInt();
		System.out.print("Enter the no.of columns: ");
		int col=s.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(row=0; row <arr.length;row++) {
			for(col = 0; col<arr[row].length;col++) {
				System.out.println("Enter the elements of "+row+"th row" );
				System.out.println("Enter the elements of "+col+"th column" );
				arr[row][col]=s.nextInt();
			}
		}
		for(row=0; row <arr.length;row++) {
			for(col = 0; col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
