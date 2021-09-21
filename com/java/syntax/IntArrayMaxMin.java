package com.java.syntax;

public class IntArrayMaxMin {
	public static void main(String []args) {
		int x[] = {18,6,31,7,-10,12,78,3214,11,13};
		int max = Integer.MIN_VALUE;//inbuilt function for min value i.e -2power31
		int min = Integer.MAX_VALUE;//inbuilt function for min value i.e -2power31 -1
		for (int i = 0; i<x.length;i++ ) {
			//if ((x[i]-x[i+1])>=0) {
			if (x[i]>max) {
				max = x[i];
			}
		}
		for (int i = 0; i<x.length;i++ ) {
			//if ((x[i]-x[i+1])>=0) {
			if (x[i]<min) {
				min = x[i];
			}
		}
		System.out.println("The maximum value is = "+max);
		System.out.println("The minimun value is = "+min);
	}
}
