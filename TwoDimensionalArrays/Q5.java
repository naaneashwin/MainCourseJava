package TwoDimensionalArrays;

public class Q5 {
public static void main(String[] args) {
	//In a 3 column matrix , if the sum of 0 and 1th column elements is equal to 2nd column then print true
	//else false
	int [][] arr = {{3,2,5,10},{4,6,10,20},{9,16,25,51}};
	boolean flag = true;
	for(int i=0; i<arr.length; i++) {
		int ans = 0;
		for(int j=0; j<arr[1].length-1;j++) {
			ans = ans + arr[i][j];
		}
		if(arr[i][arr[i].length-1]!=ans) {
			flag = false;
			break;
		}
	}
	if(flag) System.out.println("True");
	else System.out.println("False");
	}
}
