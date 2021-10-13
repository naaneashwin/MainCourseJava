package strings;

public class SplitStringUsingLength {
	public static void main(String[] args) {
		//split the string for every n characters
		String str = "aaaabbbbccccdddd";
		int n = 4;
		for(int i=0; i<str.length();i++) {
			if(i%n==0 && i!=0) {
				System.out.println();
				//System.out.print(str.charAt(i));
			}
			//else {
				System.out.print(str.charAt(i));
			//}
		}
	}
}
