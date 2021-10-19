package hashmap;

import java.util.HashMap;

public class nonRepetitiveElementUsing1ForLoop {
	public static void main(String[] args) {
		String str = "abcabcdefdefg";
		boolean flag = false;
		//Find the non repetitive element using HashMap
		str = str.toLowerCase();
		HashMap<Character,Integer> a = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				if(a.containsKey(str.charAt(i))) {
					flag = true;
					int x = a.get(str.charAt(i));
					x++;
					a.put(str.charAt(i), x);
				}
				else {
					a.put(str.charAt(i), 1);
				}
			}
		}
		if(a.containsValue(1)) {
			for(Character m : a.keySet()) {
				int x = a.get(m);
				if(x==1) {
					System.out.println(m);
					break;
				}
		}
		}
		else System.out.println("No Non Repetitive element");
	}
}
