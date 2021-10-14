package strings;

import java.util.*;

public class MaxAndMinOccuranceUsingHashMap {
	public static void main(String[] args) {
		String a = "nhausfiunarhofml";
		a=a.toLowerCase();
		HashMap<Character,Integer> dataMap = new HashMap<>();
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				if(dataMap.containsKey(a.charAt(i))) {
					Integer x = dataMap.get(a.charAt(i));
					x++;
					dataMap.put(a.charAt(i), x);
				}
				else {
					dataMap.put(a.charAt(i), 1);
				}
			}
		}
		int max =0;
		int min = Integer.MAX_VALUE;
		Character ch1 = '\0';
		Character ch2 = '\0';
		for(Character m : dataMap.keySet()) {
			if(max<dataMap.get(m)) {
				max = dataMap.get(m);
				ch1 = m;
			}
			else if(min>dataMap.get(m)) {
				min = dataMap.get(m);
				ch2 = m;
			}
		}
		System.out.println("The minimum occurrence is "+ch2+" and it occurred "+min+" times");
		System.out.println("The maximum occurrence is "+ch1+" and it occurred "+max+" times");
	}
}
