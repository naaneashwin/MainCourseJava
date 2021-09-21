package com.java.syntax;
import java.util.*;
public class ReplacingNumberAtSpecifiedIndex {
	public static void main(String args[]) {
		int arr[]= {1,2,6,52,8592,156,45};
		int num=0;
		System.out.println("Enter the index value");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		scan.close();
		for (int i=0; i<arr.length;i++) {
			if (i==index) {
				arr[i]=num;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));//to print array directly
	}
}
