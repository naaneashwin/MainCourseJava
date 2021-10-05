package operators;

public class AverageOfAllTheElementsOfAnArray {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum = sum + a[i];
		}
		int avg = sum/a.length;
		System.out.println(avg);
	}
}
