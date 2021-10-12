package operators;

public class ArrayMerging {
	public static void main(String[] args) {
		int[] a = {2,0};
		int[] b = {1};
		int m =1, n=1;
		int tail1 = m-1;
		int tail2 = n-1;
		int finalResult = m+n-1;
		//o/p should be {1,2,2,3,4,5}; without creating new array
		if(m==0) {
			a=b;
		}
		else {
			
			while(tail1>=0 && tail2>=0) {
				if(a[tail1]>b[tail2]) {
					a[finalResult]=a[tail1];
					tail1--;
				}
				else {
					a[finalResult] = b[tail2];
					tail2--;
				}
				finalResult--;
			}
			while(tail1<0 && tail2>=0) {
				a[finalResult]=b[tail2];
				tail2--;
				finalResult--;
			}
			while(tail1>=0 && tail2<0) {
				a[finalResult]=a[tail1];
				tail1--;
				finalResult--;
			}
			
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
