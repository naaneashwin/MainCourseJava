package strings;
import java.util.*;

public class HashMapExcercise2 {
	public static void main(String[] args) {
		/*String str- "aaabbbcccddeeeffffksacd"
    print all the frequencies of all the characters
    ex- a = 4*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		HashMap<Character,Integer> data = new HashMap<>();
		
		str = str.toLowerCase();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(data.containsKey(str.charAt(i))) {
					int x = data.get(str.charAt(i));
					x++;
					data.put(str.charAt(i), x);
				}
				else {
					data.put(str.charAt(i), 1);
				}
			}
		}
		for(Character key: data.keySet()) {
			System.out.println("The frequency of character \'"+key+"\' in this string is "+data.get(key));
		}
	}
}
