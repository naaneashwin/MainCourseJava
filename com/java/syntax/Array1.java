package com.java.syntax;
import java.util.*;

public class Array1 {
//Find the numbers which is not repeated, in the given integer array
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int l = s.nextInt();
		
		int arr[] = new int[l];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<l; i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0; i<l;i++) {
			int count =0;
			for(int j=0; j<l;j++) {
				if(j==i) {
					continue;
				}
				else if(arr[i]==arr[j]) {
					count ++;
				}
			}
			if(count ==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
