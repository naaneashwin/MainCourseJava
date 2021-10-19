package leetcode;

public class ExcelSheetColumnTitle {
	//Given a integer , return the respective Column title
	public static void main(String[] args){
		int n = 95;//CN
		String result = "";
		while(n>0) {
			n--;
			result = (char)('A'+n%26) + result;
			n/=26;
		}
		System.out.println(result);
	}
}
