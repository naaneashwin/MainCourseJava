package com.java.syntax;

public class MethodOverloadingB {

 public static void add(int a,int b) {
	 int sum = a+b;
	 System.out.println(sum);
 }
 public static void add(int a,int b,int c) {
	 int sum = a+b+c;
	 System.out.println(sum);
 }
 public static void add(double a, double b) {
	 double sum=a+b;
	 System.out.println(sum);
 }
}
