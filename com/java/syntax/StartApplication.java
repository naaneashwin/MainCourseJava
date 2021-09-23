package com.java.syntax;

public class StartApplication {
	public static void main (String args[]) {
		Users A = new Users();
		Users B = new Users();
		Users C = new Users();
		Users D = new Users();
		Users E = new Users();
		//Setters
		A.setStudentID(1);
		A.setFirstName("Arthur");
		A.setLastName("Shelby");
		A.setCity("Small Heath");
		A.setAge(28);
		
		B.setStudentID(2);
		B.setFirstName("Thomas");
		B.setLastName("Shelby");
		B.setCity("Birmingham");
		B.setAge(27);
		
		C.setStudentID(3);
		C.setFirstName("John");
		C.setLastName("Shelby");
		C.setCity("London");
		C.setAge(24);
		
		D.setStudentID(4);
		D.setFirstName("Finn");
		D.setLastName("Shelby");
		D.setCity("Ireland");
		D.setAge(20);
		
		E.setStudentID(5);
		E.setFirstName("Michael");
		E.setLastName("Gray");
		E.setCity("Manchester");
		E.setAge(22);
		
		
		//Getters
		
		System.out.println(A.getStudentID());
		System.out.println(A.getFirstName());
		System.out.println(A.getLastName());
		System.out.println(A.getCity());
		System.out.println(A.getAge());
		
		
		System.out.println(B.getStudentID());
		System.out.println(B.getFirstName());
		System.out.println(B.getLastName());
		System.out.println(B.getCity());
		System.out.println(B.getAge());
		
		System.out.println(C.getStudentID());
		System.out.println(C.getFirstName());
		System.out.println(C.getLastName());
		System.out.println(C.getCity());
		System.out.println(C.getAge());
		
		System.out.println(D.getStudentID());
		System.out.println(D.getFirstName());
		System.out.println(D.getLastName());
		System.out.println(D.getCity());
		System.out.println(D.getAge());
		
		System.out.println(E.getStudentID());
		System.out.println(E.getFirstName());
		System.out.println(E.getLastName());
		System.out.println(E.getCity());
		System.out.println(E.getAge());
		
		
	}
}
