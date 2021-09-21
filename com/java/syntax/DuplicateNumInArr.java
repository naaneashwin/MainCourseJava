package com.java.syntax;

public class DuplicateNumInArr {
	public static void main(String args[]) {
		//This is for a number repeating only once
		int arr[] = {1,2,6,3,58,6,58,9,12};
			for(int i=0; i<arr.length;i++) {
				for (int j=i+1; j<arr.length; j++) {
					if (arr[i]==arr[j]) {
						System.out.println("The duplicate value is = " + arr[j]);
						System.out.println("The index numbers are "+i+ " and " +j);
					}
				}
			}
	}
}
