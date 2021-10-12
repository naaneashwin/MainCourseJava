package strings;
import java.util.*;
public class PuctuationCounterInString {
	public static void main(String[] args) {
		//count the number of punctuation used in a string
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = s.nextLine();
		s.close();
		int punchCounter = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==','||str.charAt(i)=='?'||str.charAt(i)==';'||str.charAt(i)==':'
					||str.charAt(i)=='!'||str.charAt(i)=='-'||str.charAt(i)=='"'||str.charAt(i)=='.'
					||str.charAt(i)=='\'') {
				punchCounter++;
			}
		}
		System.out.println("The number of Punctuation sysbols present in the givem string is : "+punchCounter);
	}
}
