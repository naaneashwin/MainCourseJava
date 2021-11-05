package operators;

import java.util.Scanner;

public class swapNumbersUdingXOR {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		s.close();
		System.out.println("Initial values A = "+A+" and B = "+B);
		//xor with zero remains the same number
		//00001001-9-A
		//00000011-3-B
		A = A^B;
		//A= 00001010 - 10
		//B= 00000011 -3
		B=A^B;
		//A= 00001010 -10
		//B= 00001001 -9
		A=A^B;
		//A= 00000011 -3
		//B= 00001001 -9
		
	
	}
}
