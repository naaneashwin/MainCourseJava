package com.java.syntax;

public class MethodOverloadingA {
	public static void main(String args[]) {
		MethodOverloadingB.add(1, 9);
		MethodOverloadingB.add(1, 9, 4);
		MethodOverloadingB.add(1.02, 9.04256);
	}
}
