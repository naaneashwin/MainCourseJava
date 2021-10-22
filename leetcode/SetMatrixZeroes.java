package leetcode;

import java.util.Arrays;

public class SetMatrixZeroes {
/*Given an m x n integer matrix matrix, 
 * if an element is 0, set its entire row and column to 0's, and return the matrix.
You must do it in place.
 */
	public static void main(String args[]) {
		int[][] matrix = {{1,1,1,0},{1,0,1,5},{1,5,1,1}};
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		Arrays.fill(row, -1);
		Arrays.fill(col, -1);
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					row[i]=0;
					col[j]=0;
				}
			}
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				if(row[i]==0 || col[j]==0) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
