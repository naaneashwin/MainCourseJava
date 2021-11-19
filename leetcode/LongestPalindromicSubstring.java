package leetcode;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("bababd"));
	}
	/*public static String longestPalindrome(String s) {
        int subLength =0;
        StringBuffer res = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=i; j--){
                if(s.charAt(i)==s.charAt(j)){
                    String x = s.substring(i,j+1);
                    boolean flag = palindrome(x);
                    if(flag && subLength<x.length()){
                        subLength = x.length();
                        res.setLength(0);
                        res.append(x);
                    }
                }
                if((j-i+1)<subLength) break ;
            }
        }
        
        return res.toString();
    }
    private static boolean palindrome(String s){
        
        int i=0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }*/
	
	private static int lo;
	private static int maxLen;

	public static String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private static void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
	}
