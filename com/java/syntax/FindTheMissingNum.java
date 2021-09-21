package com.java.syntax;

public class FindTheMissingNum {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,13,14,15};
		for (int i=0; i<arr.length;i++) {
			if ((arr[i]-arr[i+1])!=-1) {
				int mn = arr[i]+1;
				System.out.println("The missing number is = "+ mn);
				break;
			}
		}
	}
}
