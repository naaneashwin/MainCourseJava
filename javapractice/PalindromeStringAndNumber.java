package javapractice;
import java.util.*;

public class PalindromeStringAndNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your input: ");
		String orig = scan.nextLine();
		scan.close();
		int forward=0,backward=orig.length()-1;
		while (forward<=backward) {
			if (orig.charAt(forward)!=orig.charAt(backward)) {
				break;
			}
			forward++;
			backward--;
		}
		if(forward>backward) {
			System.out.println("Palindome");
		}
		else System.out.println("Not Palindrome");
		
	}
}
