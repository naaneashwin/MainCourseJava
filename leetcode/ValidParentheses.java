package leetcode;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "[]";
		//Not completed and have to use stack as per the discussions section
		boolean flag= true;
		if((s.length()&1)!=0) flag = false;
		else {
			int i=0;
			int j=s.length()-1;
			while(i<=j) {
				if(s.charAt(i)=='(') {
					if((int)s.charAt(j)!=(1+(int)s.charAt(i))) {
						flag = false;
						break;
					}
				}
				else {
					if((int)s.charAt(j)!=(2+(int)s.charAt(i))) {
						flag = false;
						break;
						}
					}
				i++;
				j--;
			}
		}
		if(flag) System.out.println("True");
		else System.out.println("False");
	}
}

