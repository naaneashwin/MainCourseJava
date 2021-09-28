package javapractice;
import java.util.*;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int orig = scan.nextInt();
		scan.close();
		int dupl = orig;
		int rev=0;
		while(dupl>0) {
			int x = dupl%10;
			rev = rev*10 + x;
			dupl/=10;
		}
		if (rev==orig) {
			System.out.println("yes a palindrome");
		}
		else System.out.println("Not a palindrome");
	}
}
