package operators;

import java.util.Scanner;

public class marks {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int []marks = new int[5];
	for(int i=0; i<marks.length;i++) {
		marks[i] = s.nextInt();
	}
	for(int i=0; i<marks.length;i++) {
		int a = marks[i];
		if(a<40) {
			System.out.println("Failed");
		}
		else if(a>=40 && a<=60) {
			System.out.println("C grade");
		}
		else if(a>60 && a<=80) {
			System.out.println("B grade");
		}
		else if(a>80 && a<=90) {
			System.out.println("A grade");
		}
		else if(a>90 && a<101) {
			System.out.println("A+ grade");
		}
}
}}
