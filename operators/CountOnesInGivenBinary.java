package operators;

public class CountOnesInGivenBinary {
	public static void main(String[] args) {
		CountOnesInGivenBinary obj = new CountOnesInGivenBinary();
		int a = obj.hammingWeight(00000000000000000000000010000000);
		System.out.println(a);
	}
	 public int hammingWeight(int n) {
		 int ones = 0;
		 while(n!=0) {
			ones = ones + (n&1);
			n=n>>>1;
		 }
		 return ones;
	    }
}
