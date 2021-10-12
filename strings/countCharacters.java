package strings;
import java.util.*;
public class countCharacters {
	public static void main(String args[]) {
		//program to count the number of characters in a given string
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.nextLine();
		s.close();
		int count = 0;
		for(int i=0; i<str.length();i++) {
			int x =(int)str.charAt(i);
			if(x!=32) {
				count ++;
			}
		}
		System.out.println("The character count is : "+count);
	}
}
