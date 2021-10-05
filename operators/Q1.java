package operators;

public class Q1 {
	public static void main(String[] args) {
		int []a = {1,2,4,3,5,1};
		int k = 3;
		int count = 0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					count = 1;
					if(Math.abs(i-j)<=k) {
						count = 2;
					}
				}
				
			}
		}
		if(count ==2) {
			System.out.println("True");
		}
		else System.out.println("False");
	}
}
