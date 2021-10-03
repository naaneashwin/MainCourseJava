package com.java.syntax;

public class Array2 {
	//for only one repeating element
	public static void main(String[] args) {
		int arr[]= {4,6,2,4,6,5,2};
		int num = 0;
		for(int i=0; i<arr.length;i++) {
			
				num=num^arr[i];
			
		}
		System.out.println(num);
	}
}
