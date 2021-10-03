package operators;

public class and1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		int c = a&b;
		int d = a|b;
		
		if(c>10 && c<20) {
			System.out.println("Between 10 & 20");
		}
		else System.out.println(c);
		if(d>10 || d<20) {
			System.out.println("Between 10 & 20");
		}
		else System.out.println(d);
	}
	
}
