package operators;

public class CopyAnArray {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6};
		int []acopy = new int[a.length];
		int index = 0;
		for(int i=0; i<a.length;i++) {
			acopy[index]=a[i];
			System.out.println(acopy[i]);
			if(index==a.length-1) {
				break;
			}
			index++;
			
		}
	}
}
