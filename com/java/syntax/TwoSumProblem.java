package com.java.syntax;
import java.util.*;
public class TwoSumProblem {
	public static void main(String[] args) {
		//the addition of two numbers in an array must equal to the target value,
		//if such numbers present print yes, else no
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array values: ");
		int[] a = new int[5];
		for(int i=0; i<a.length;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the target value");
		int target = s.nextInt();
		s.close();
		boolean flag = false;
		aa: for(int i=0; i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(target == (a[i]+a[j])) {
					flag = true;
					if (flag) {
						System.out.println("Yes");
						System.out.println("The numbers are "+a[i]+" and "+a[j]);
						System.out.println(("The index values are "+i+" and "+j));
					break aa;
				}
				else flag=false;
			}
		}
		
		}
		if(!flag)  System.out.println("False");
	}
}
