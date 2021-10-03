package com.java.syntax;

public class Array3 {
	public static void main(String[] args) {
		int a[]= {2,0,1,3,4,6};
		int xor = 0;
		int i=0;
		for(i=0; i<a.length;i++) {
			xor = xor^i^a[i];
		}
		xor=xor^i;
		System.out.println(xor);
	}
}