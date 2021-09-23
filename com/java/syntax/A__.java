package com.java.syntax;

public class A__ {

		
		public static void main(String[] args) {
			
			int [] a= {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
			int e_length = a.length+1;
			int sum1 = ((e_length)*(e_length+1))/2;
			int sum = 0;
			for(int i = 0; i<a.length;i++) {
				sum=sum + a[i];
			}
			int missing = sum1 - sum;
			System.out.println("Missing number is = "+missing);
		}

	}


