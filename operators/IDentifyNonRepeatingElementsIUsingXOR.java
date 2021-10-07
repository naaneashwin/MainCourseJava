package operators;

public class IDentifyNonRepeatingElementsIUsingXOR {
	public static void main(String[] args) {
		int[] a = {1,2,2,3,10,6,6,1};
		int value = 0;
		int i=0;
		for(; i<a.length;i++) {
			value = value^a[i];
		}
		int ans = value|(i-1);
		System.out.println(ans);
		System.out.println(i);
		System.out.println(value);
	}
}
