package strings;

public class SwapStrings {
	public static void main(String[] args) {
		//swap 2 strings without using 3rd variable
		String a = "Hello";
		String b = "World";
		a = a.concat(b);
		b= b.concat(a);
		a= a.replace("Hello", "");
		b= b.replace("World","");
		
		/*int i = 0;
		int j = 0;
		while(i<a.length()) {
			char c = a.charAt(i);
			a = a.replace(a.charAt(i), b.charAt(j));
			b = b.replace(b.charAt(j), c);
			j++;
			i++;
			
		}*/
		System.out.println(a);
		System.out.println(b);
	}
}
