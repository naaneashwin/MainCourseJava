package operators;

public class SeperateEvenAndOdd {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] seperated = new int[a.length];
		int index = 0, revindex= a.length-1;
		for(int i=0; i<a.length;i++) {
			if((a[i]&1)==0) {
				seperated[index] = a[i];
				index++;
			}
			else {
				seperated[revindex]=a[i];
				revindex--;
			}	
		}
		for(int i=0;i<seperated.length;i++) {
			System.out.println(seperated[i]);
		}
	}
}
