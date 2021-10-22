package Oops;

import java.util.Scanner;

public class Students {
	String name;
	int age;
	char gender;
	final int rollNo; //final is used to restrict the overwriting of the rollNo value
	long mobNo;
	int totalMarks;
	String address;
	//default constructor
	public Students(){
		this.rollNo = 0;
		
	}
	//parameterized constructor
	public Students(String s, int age, char g, int roll, int mob, int tM, String add) {
		name = s;
		this.age = age;
		gender = g;
		rollNo = roll;
		mobNo = mob;
		totalMarks = tM;
		address = add;
	}
	//constructor which takes user input
	public Students(char d) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student name:");
		name = scan.nextLine();
		System.out.print("Enter Student age:");
		age = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Student gender:");
		gender = scan.next().charAt(0);
		System.out.print("Enter Student Roll No:");
		final int x = scan.nextInt();
		rollNo = x;
		scan.nextLine();
		System.out.print("Enter Student mobile number:");
		mobNo = scan.nextLong();
		System.out.print("Enter Student marks:");
		totalMarks = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Student address:");
		address = scan.nextLine();
		scan.close();
	}
	//copy constructor along with parameterized constructor
	public Students(Students obj1, Students obj2,String s, int roll,char g, int mob) {
		rollNo = roll;
		name  = s;
		gender = g;
		mobNo = mob;
		totalMarks = obj1.totalMarks;
		address = obj1.address;
		age = obj2.age;
	}
	
	//method to find top scorer
	public static void topScorer(Students obj1, Students obj2, Students obj3, Students obj4) {
		int x = -1;
		int[] tm = {obj1.totalMarks,obj2.totalMarks,obj3.totalMarks,obj4.totalMarks};
		for(int i=0; i<tm.length; i++) {
			if(tm[i]>x) {
				x=tm[i];
			}
		}
		if(x==obj1.totalMarks) System.out.println(obj1.name);
		else if(x==obj2.totalMarks) System.out.println(obj2.name);
		else if(x==obj3.totalMarks) System.out.println(obj3.name);
		else if(x==obj4.totalMarks) System.out.println(obj4.name);
	}
	
}
//display class , where main method is situated
class Display{
	public static void main(String[] args) {
		//creating first instance
		Students student1 = new Students("Thomas",22,'M',101,123456789,62,"Birmingham");
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gender);
		System.out.println(student1.mobNo);
		System.out.println(student1.rollNo);
		System.out.println(student1.address);
		System.out.println(student1.totalMarks);
		
		//second instance
		Students student2 = new Students("Arthur",23,'M',102,162662426,66,"Birmingham");
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gender);
		System.out.println(student2.mobNo);
		System.out.println(student2.rollNo);
		System.out.println(student2.address);
		System.out.println(student2.totalMarks);
		
		//third instance
		Students student3 = new Students('d');
		System.out.println(student3.name);
		System.out.println(student3.age);
		System.out.println(student3.gender);
		System.out.println(student3.mobNo);
		System.out.println(student3.rollNo);
		System.out.println(student3.address);
		System.out.println(student3.totalMarks);
		
		//fourth instance
		Students student4 = new Students("Jhon",20,'M',104,154655426,86,"Birmingham");
		System.out.println(student4.name);
		System.out.println(student4.age);
		System.out.println(student4.gender);
		System.out.println(student4.mobNo);
		System.out.println(student4.rollNo);
		System.out.println(student4.address);
		System.out.println(student4.totalMarks);
		
		//calling method
		//method is static hence we can use it without an instance of the class
		Students.topScorer(student1,student2,student3,student4);
		
		//fifth instance
		Students student5 = new Students(student2, student4, "Michael",105,'M',1248656);
		System.out.println(student5.name);
		System.out.println(student5.age);
		System.out.println(student5.gender);
		System.out.println(student5.mobNo);
		System.out.println(student5.rollNo);
		System.out.println(student5.address);
		System.out.println(student5.totalMarks);
	}
}

