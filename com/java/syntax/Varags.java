package com.java.syntax;

public class Varags {
	public static void main(String[] args) {
		int a =1,b=2,c=3,d=4;
		sum(a,b,c,d,5,6,7,8,9,10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void sum(int a, int b, int...c) {
		int sum=a+b;
		for (int i=0; i<c.length;i++) {
			if (c[i]==3) {//Even if we change the value, it won't affect the main method value
				c[i]=c[i]*5;
				System.out.println(c[i]);
			}
			sum +=c[i];
		}
	System.out.println(sum);
	}
}
