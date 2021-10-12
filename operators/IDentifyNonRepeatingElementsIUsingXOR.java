package operators;

public class IDentifyNonRepeatingElementsIUsingXOR {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,4,2,1};
		int value = 0;
		for(int i=0; i<a.length;i++) {
			value = value^a[i];
		}
		int v1=0,v2=0;
		
		int ans = value&(~(value-1));
		for(int i=0; i<a.length;i++) {
			if((ans&a[i])==0) {
				v1=v1^a[i];
			}
			else {
				v2=v2^a[i];
			}
		}
		System.out.println(v1);
		System.out.println(v2);
		
	}
}
