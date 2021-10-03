package leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] a = {"a"};
		
		System.out.println(longestCommonPrefix(a));
		
		
	}
	public static String longestCommonPrefix(String[] strs) {
        String empty = "";
        int temp = Integer.MAX_VALUE;
        
        if (strs.length==0) {
        	empty = "";
        }
        else if(strs.length==1) {
        	empty = strs[0];
        }
        else {
        	for(int i=0; i<strs.length-1;i++) {
            	String a = strs[i];
            	String b = strs[i+1];
            	int count = 0;
            	int min = 0;
            	if (a.length()>b.length()) {
            		min = b.length();
            	}
            	else min = a.length();
            		
            	for(int j=0; j<min; j++) {
            		if(a.charAt(j)==b.charAt(j)) {
            			count++;
            		}
            		else break;
            	}
            	if(count <= temp) {
    				temp = count;
    			}
            }
            if(temp>0) {
            	String a = strs[0];
                for(int i=0; i<temp; i++) {
                	empty = empty + a.charAt(i);
                }
            }
            else {
            	empty = "";
            }
        }
        
        return empty;
    }
}
