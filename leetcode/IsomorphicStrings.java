package leetcode;
import java.util.*;

public class IsomorphicStrings {
/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character
while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself*/
		public static void main(String[] args) {
			String s = "paper";
			String t = "title";
			boolean flag = true;
			LinkedHashMap<Character,Character> data = new LinkedHashMap<>();
			char ch1[]=s.toCharArray();
			char ch2[]=t.toCharArray();
			if(ch1.length != ch2.length) flag = false;
			else {
				for(int i=0; i<ch1.length;i++) {
					if(data.containsKey(ch1[i])) {
						if(!data.get(ch1[i]).equals(ch2[i])) {
							 flag = false;
							 break;
						}
					}
					else {
						if(data.containsValue(ch2[i])) {
							flag = false;
							break;						
						}
						data.put(ch1[i], ch2[i]);
					}
				}
			}
			if(flag) System.out.println("True");
			else System.out.println("False");
		}
}
