package TwoDimensionalArrays;

public class Q2 {
public static void main(String[] args) {
	//if the sum of row and column is even , then make the respective element as zero
	int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[1].length;j++) {
			int sum = i+j;
			if((sum&1)==0) {
				arr[i][j]=0;
			}
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
		}	
	}
}
