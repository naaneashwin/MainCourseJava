package operators;

public class ReverseArray {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int j=a.length-1;
		aa:for(int i=0; i<a.length;i++) {
			while(i<=j) {
				int x = a[i];
				int y = a[j];
				if(i<=j) {
					a[j]=x;
					a[i]=y;
					j--;
					break;
				}
				else break aa;
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
