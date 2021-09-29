package com.java.syntax;

import java.util.Scanner;

public class ArrayAscendingPropertyChecker {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of array you want to create : ");
		int l = s.nextInt();
		System.out.println("Enter the array members : ");
		int arr[]= new int[l];
		int count =0;
		for(int i=0; i<l;i++) {
			arr[i] = s.nextInt();
		}
		for(int i=0; i<l-1; i++) {
			if(arr[i]<arr[i+1]) {
				count++;
			}
		}
		if(count==l-1) {
			System.out.println("TRUE");
		}
		else System.out.println("FALSE");
	}
}
