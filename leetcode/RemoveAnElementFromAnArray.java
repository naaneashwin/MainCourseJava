package leetcode;

public class RemoveAnElementFromAnArray {
	public static void main(String []args) {
		int[] a = {1,2,3,4,5,6};
		int [] b = new int[a.length-1];
		int target = 5;
		int index = 0;
		for(int i=0; i<a.length;i++) {
			if((a[i]^target)!=0) {
				b[index] = a[i];
				if(index==b.length-1) {
					break;
				}
				index++;
				
			}
			else {
				continue;
			}
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}
}
