package com.java.syntax;

public class Users {
	
	private int studentID;
	private String firstName;
	private String lastName;
	private String city;
	private int age;	
	
	//Setters
	public void setStudentID(int num) {
		studentID=num;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setLastName(String lastName) {
		//this. is used, left name must be the method name declared above and 
		//right name is equal to name declared in above line
		this.lastName = lastName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//Getters
	//you can either return this.name or just name
	public int getStudentID() {
		return studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getCity() {
		return this.city;
	}
	public int getAge(){
		return this.age;
	}
	
}
