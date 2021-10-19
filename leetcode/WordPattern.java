package leetcode;
import java.util.*;
public class WordPattern {
	public static void main(String[] args) {
		String s = "dog dog dog dog";
		String p = "abba";
		boolean m = wordPattern(p,s);
		if(m) System.out.println("True");
		else System.out.println("False");
	}
	    public static boolean wordPattern(String pattern, String s) {
	        String []arrayString = s.split(" ");
	        boolean flag = true;
	        HashMap<Character,String> data = new HashMap<>();
	        char[] charArray = pattern.toCharArray();
	        if(charArray.length != arrayString.length) flag = false;
	        else {
	        	for(int i=0; i<charArray.length;i++) {
		        	if(data.containsKey(charArray[i])) {
		        		if(!data.get(charArray[i]).equals(arrayString[i])) {
		        			flag = false;
		        			break;
		        		}
		        	}
		        	else {
		        		if(data.containsValue(arrayString[i])) {
		        			flag=false;
		        			break;
		        		}
		        		data.put(charArray[i], arrayString[i]);
		        	}
		        }
	        }
	        return flag;
	    }
	}

