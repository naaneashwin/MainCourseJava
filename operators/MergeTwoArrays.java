package operators;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		int c[]=new int[a.length+b.length];
		int inc =0;
		int adderforb = a.length, adderfora = b.length;
		if((a[0]==b[0])/* && ((a[1]-a[0])==(b[1]-b[0]))*/) {
			for(int i=0; i<Math.min(a.length,b.length);i++) {
				c[inc]=a[i];
				c[inc+1]=b[i];
				inc+=2;
			}
			for(;inc<c.length;inc++) {
				if(a.length>b.length) {
					c[inc]=a[adderfora];
					adderfora++;
				}
				else {
					c[inc]=b[adderforb];
					adderforb++;
				}
				
			}
		}
		
		else if(a[0]<b[0]) {
			int ind = 0;
			for(int i=0; i<a.length;i++) {
				c[ind]=a[i];
				ind++;
			}
			for(int i=0; i<b.length;i++) {
				c[ind]=b[i];
				ind++;
			}
		}
		else if(a[0]>b[0]) {
			int ine = 0;
			for(int i=0; i<b.length;i++) {
				c[ine]=b[i];
				ine++;
			}
			for(int i=0; i<a.length;i++) {
				c[ine]=a[i];
				ine++;
			}
		}
		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}
