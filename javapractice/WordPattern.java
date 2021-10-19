package javapractice;

public class WordPattern {
	public static void main(String[] args) {
		String a = "asdklejdfhncks";
		int x = 1;
		for(int i=0; i<2*a.length()-1;i++) {
			if(i<a.length()) {
				for(int j=0; j<=i;j++) {
					System.out.print(a.charAt(j));
				}
			}
			else {
				for(int j=0; j<a.length()-x;j++) {
					System.out.print(a.charAt(j));
				}
				x++;
			}
			System.out.println();
		}
		
	}
}
