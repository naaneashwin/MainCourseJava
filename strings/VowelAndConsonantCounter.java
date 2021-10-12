package strings;
import java.util.*;
public class VowelAndConsonantCounter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = s.nextLine();
		s.close();
		int vowel=0,consonant=0;
		
		for(int i=0; i<str.length();i++) {
			if(((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)
					||((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
						||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
						||str.charAt(i)=='O'||str.charAt(i)=='U') {
					vowel++;
				}
				else consonant++;
			}
		}
		System.out.println("The string has "+vowel+" vowels and "+consonant+" consonants");
	}
}
