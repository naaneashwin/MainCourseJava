package com.java.syntax;
import java.util.*;
public class AreaAndCircumfranceOfCircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle(in mm): ");
		int rad = scan.nextInt();
		scan.close();
		area(rad);
		circumference(rad);
	}
	public static void area(int r) {
		double a = 3.14*r*r;
		System.out.println("The area of the circle is "+a+" Sq.mm");
	}
	public static void circumference(int r) {
		double c = 2*3.14*r;
		System.out.println("The circumference of the circle is "+c+" mm");
	}
}
