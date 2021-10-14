package strings;

public class SwapStrings {
	public static void main(String[] args) {
		//swap 2 strings without using 3rd variable
		String a = "He";
		String b = "She";
		a = a+b;
		System.out.println(a);
		b=a.substring(0, (a.length()-b.length()));
		//a = a.substring((a.length()-b.length()), a.length());
		a = a.substring(b.length());
		
		System.out.println(b);
		System.out.println(a);
	}
}
