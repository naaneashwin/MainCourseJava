package javapractice;
import java.util.*;
public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = scan.nextInt();
		scan.close();
		System.out.println(factorial(num));
	}
	public static int factorial(int n) {
	if(n==0) {
		return 1;
	}
	else {
		return n*factorial(n-1);
	}
	}
}
