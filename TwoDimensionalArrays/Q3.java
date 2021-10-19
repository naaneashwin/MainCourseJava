package TwoDimensionalArrays;

public class Q3 {
public static void main(String[] args) {
	//string 2d array
	String[][] arr = {{"akjsh","ahsdkjh","sbjdab"},{"bahdjb","hahe","hdahe"},{"shadknd","njnaehd","nhusnhe"}};
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
		}
	}
}
}
