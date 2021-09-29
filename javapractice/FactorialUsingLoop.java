package javapractice;
import java.util.*;
public class FactorialUsingLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = scan.nextInt();
		scan.close();
		long fact=1;
		for (int i=num; i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
