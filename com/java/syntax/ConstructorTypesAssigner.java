package com.java.syntax;

public class ConstructorTypesAssigner {
	public static void main(String[] args) {
		ConstructorTypes defConstructor = new ConstructorTypes();
		defConstructor.display();
		ConstructorTypes parameterizedConstructor = new ConstructorTypes(44,"Mercedes");
		parameterizedConstructor.display();
	}
}
