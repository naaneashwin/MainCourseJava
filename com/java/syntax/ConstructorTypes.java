package com.java.syntax;

public class ConstructorTypes {
	private int carNum;
	private String carName;
	
	//You can use access modifier or not
	//classname(parameters if req){}
	//constructor name and class name ust be same
	public ConstructorTypes(){
		this.carNum=33;
		this.carName="RedBull";
	}
	public ConstructorTypes(int carNum, String carName){
		this.carNum=carNum;
		this.carName=carName;
	}
	
	public void display() {
		System.out.println(carNum);
		System.out.println(carName);
		System.out.println();
	}
}
