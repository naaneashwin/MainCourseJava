package leetcode;

import java.util.Arrays;

public class ReshapeMatrix {
	public static void main(String[] args) {
		int mat[][]= {{1,2},{3,4}};
		int r = 1;
		int c = 4;
		ReshapeMatrix k = new ReshapeMatrix();
		int[][] a = k.matrixReshape(mat, r, c);
		System.out.println(Arrays.deepToString(a));
	}
	public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c) return mat;
        int[][] hosaMatrix = new int[r][c];
        int[] arr = new int[c];
        int count = 0;
        int val = -1;
        for(int i=0; i<mat.length;i++){           
            for(int j=0; j<mat[i].length;j++){
            	val=j;
                if(count<c){
                    arr[count]=mat[i][j];
                    count++;
                }
                else {
                     
                }
            }
            if(count>c) {
            	for(int x=0; x<r;x++){
                    for(int y=0; y<c;y++){
                        for(int z=0; z<arr.length;z++){
                            hosaMatrix[x][y] = arr[z];
                        }
                    }
                }
            	arr[0] = mat[i][val];
                count=1;
            }
        }
        if(count>=c) {
        	for(int x=0; x<r;x++){
                for(int y=0; y<c;y++){
                        hosaMatrix[x][y] = arr[y];
                    
                }
            }
        }
        return hosaMatrix;
	}
}

