package leetcode;

public class ExcelColumnNumbering {
	public static void main(String [] args) {
		String s = "XZY";
		int l = s.length();
		int val=0;
		for(int i=0; i<l;i++) {
			char c = s.charAt(i);
			val = (val)*26;
			for(char j = 'A'; j<='Z';j++) {
				val++;
				if(j==c) break;
			}
		}
		System.out.println(val);
	}
}
