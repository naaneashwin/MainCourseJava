package TwoDimensionalArrays;

public class Q4 {
public static void main(String[] args) {
	//In a 3x3 matrix , if all the diagonal elements are same , print true, else false
	int[][] arr= {{0,2,3},{4,0,5},{6,7,0}};
	//double ref=0;
	boolean b = true;
	aa:for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[1].length;j++) {
			if(i==j) {
				//ref = ref + arr[i][j];
				int ans = arr[i][j];
				if(ans != arr[0][0]) {
					b = false;
					break aa;
				}
				else break;
			}
		}
	}
	if(b) System.out.println("True");
	else System.out.println("False");
	/*if(ref/arr.length == arr[0][0]) {
		System.out.println("True");
	}
	else System.out.println("False");*/
}
}
