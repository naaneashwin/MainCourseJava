package com.java.syntax;

import java.util.Scanner;

public class MinofNumberArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array values :");
		int arr[] = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		int min = Integer.MAX_VALUE;
	

		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
