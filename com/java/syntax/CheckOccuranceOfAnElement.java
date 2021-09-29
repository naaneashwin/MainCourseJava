package com.java.syntax;
import java.util.*;

public class CheckOccuranceOfAnElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array values :");
		int arr[] = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Enter the target to check : ");
		int target = s.nextInt();
		s.close();
		boolean flag = false;
		for(int i=0; i<arr.length;i++) {
			if(target==arr[i]) {
				flag = true;	
			}
			else flag = false;
		}
		if(flag) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
