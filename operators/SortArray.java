package operators;

public class SortArray {
	public static void main(String []args) {
		int[] a = {2,-5,9,1,3,0};
		
		int[] b = new int[a.length];
		for(int i=0; i<b.length;i++) {
			int min = Integer.MAX_VALUE;
			int temp = a[i];
			int index = -1;
			for(int j=i;j<a.length;j++) {
				if(a[j]<min) {
					min = a[j];
					index = j;
				}
			}
			b[i]=min;
			a[index]=temp;
		}
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]);
		}
	}
}
