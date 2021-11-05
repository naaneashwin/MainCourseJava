package leetcode;
import java.util.HashMap;

class LongestSubStringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Solution obj = new Solution();
		int x = obj.lengthOfLongestSubstring("abcabcabcd");//7
		System.out.println(x);
	}
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if(s.length()==0) return 0;
        HashMap<Character,Integer> data = new HashMap<>();
        int max = 0;
        int left =0;
        for(int right =0;right<s.length();right++) {
        	if(data.containsKey(s.charAt(right))) {
        		left= Math.max(left, data.get(s.charAt(right))+1);
        	}
        	data.put(s.charAt(right), right);
        	max = Math.max(max, right-left+1);
        }
        return max;
    }
}
