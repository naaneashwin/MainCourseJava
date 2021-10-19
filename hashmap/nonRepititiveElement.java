package hashmap;
import java.util.*;
public class nonRepititiveElement {
	public static void main(String args[]) {
		String str = "abcabcdefdef";
		//Find the non repetitive element using HashMap
		str = str.toLowerCase();
		HashMap<Character,Integer> a = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				if(a.containsKey(str.charAt(i))) {
					int x = a.get(str.charAt(i));
					x++;
					a.put(str.charAt(i), x);
				}
				else {
					a.put(str.charAt(i), 1);
				}
			}
		}
		for(Character m : a.keySet()) {
			int x = a.get(m);
			if(x==1) {
				System.out.println(m);
				break;
			}
		}
	}
}
