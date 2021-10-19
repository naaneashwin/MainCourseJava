package leetcode;

public class ReverseStringII {
	public static void main(String[] args) {
		String s= "abcdefghi";//bacdfeghi
		int k = 2;
		char ch[]=s.toCharArray();
		if(k>ch.length) {
			int f=0;
			int b = ch.length - 1;
			while(f<=b) {
				char temp = ch[b];
				ch[b]=ch[f];
				ch[f]=temp;
				f++;
				b--;
			}
		}
		else {
			int n=0;
			while(((n+1)*k-1)<ch.length) {
				int f=n*k;
				int b = (n+1)*k-1;
				while(f<=b) {
					char temp = ch[b];
					ch[b]=ch[f];
					ch[f]=temp;
					f++;
					b--;
				}
				n+=2;
			}
		}
		String str = "";
		for(int i=0; i<ch.length;i++) {
			char m = ch[i];
			str = str+m;
		}
		System.out.println(str);
	}
}
