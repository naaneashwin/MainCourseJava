package com.java.syntax;

import java.util.Scanner;

public class MAxNumberofArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array values :");
		int arr[] = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		int max = Integer.MIN_VALUE;
	
	
			for(int i=0; i<arr.length;i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
		System.out.println(max);
	}
}
