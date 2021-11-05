package leetcode;

public class SudukoChecker {
	/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated 
	 * according to the following rules:
	 

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
*/
	public static void main(String[] args) {
		//int[][] board = new int[9][9];
		int[][] board = {	{5,3,0,0,7,0,0,0,0},
							{6,0,0,1,9,5,0,0,0},
							{0,9,8,0,0,0,0,6,0},
							{8,0,0,0,6,0,0,0,3},
							{4,0,0,8,0,3,0,0,1},
							{7,0,0,0,2,0,0,0,6},
							{0,6,0,0,0,0,2,8,0},
							{0,0,0,4,1,9,0,0,5},
							{0,0,0,0,8,0,0,7,9}};
		boolean flag = true;
		main:for(int i=0; i<board.length;i++) {
			int check = -1;
			int value = -1;
			for(int j=0; j<board[i].length;j++) {
					value = board[i][j];
					check = j;
					if(board[i][j]==value && j!=check && value !=0) {
						flag = false;
						break main;
					}
			}
			for(int m = 0; m<board.length;m++) {
				if(m!=i && board[m][check]==value && value !=0) {
					flag = false;
					break main;
				}
			}
			if((i==0 || i==3 || i==6) && (check ==0 || check ==3 || check ==6)){
				for(int x =i; x<i+3; x++) {
					for(int y = check; y<check+3; y++) {
						if(board[x][y]==value && value !=0) {
							flag = false;
							break main;
						}
					}
				}
			}
		}
		if(flag) System.out.println("OK to be Sudoku");
		else System.out.println("Not OK");
	}

}
