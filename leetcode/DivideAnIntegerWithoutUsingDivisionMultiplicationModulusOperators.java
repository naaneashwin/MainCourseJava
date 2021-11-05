package leetcode;

public class DivideAnIntegerWithoutUsingDivisionMultiplicationModulusOperators {
	public static void main(String[] args) {
		int x = divider(-2147483648,-1);
		System.out.println(x);
}
	public static int divider(int dividend, int divisor) {
		if(dividend ==0 ) return 0;
		if(divisor ==1) return dividend;
		//Overflow controller
		if(dividend ==Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
		
		long ldividend = (long)dividend;
		long ldivisor = (long)divisor;
		if(ldividend < 0) ldividend = -ldividend;
		if(ldivisor <0) ldivisor = -ldivisor;
		
		long checker = ldivisor, counter = 0;
		while(checker <= ldividend) {
			counter++;
			checker = checker + ldivisor;
		}
		
		boolean ispositive = (dividend >0 && divisor >0) || (dividend <0 && divisor <0);
		return ispositive?(int)counter : -(int)counter;
	}
}
