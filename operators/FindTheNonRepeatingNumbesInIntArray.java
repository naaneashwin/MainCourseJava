package operators;

public class FindTheNonRepeatingNumbesInIntArray {
	public static void main(String[] args) {
		//Find 2 non repeating element in an array using bitwise operator
		//I/p- [1,5,8,6,5,1,6,2]
		//O/p- 8,2
		int a[]={1,5,8,6,6,5,1,3,6};
		for(int i=0; i<a.length;i++) {
			int count = 1;
			for(int j=0; j<a.length;j++) {
				if((a[i]^a[j])==0 && i!=j) {
					count++;
				}
			}
			if(count ==1) {
				System.out.println(a[i]);
			}
		}
	}
}
