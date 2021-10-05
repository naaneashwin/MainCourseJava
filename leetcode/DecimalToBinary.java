package leetcode;

import java.util.Scanner;

public class DecimalToBinary {
	//for only positive integers
	public static void main(String[] args) {
		//int i=23;
		//String p = String.format("%08d", i);//to add zeros in front of a number in the 
											//form of a string %-starter, 0-element to add
											//8-no.of times d-for integer
											//use string.format(string,object)-method
		//System.out.println(p);
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a number");
		int x =m.nextInt();
		String[] b = {"0","0","0","0","0","0","0","0",};
		aa: for(int j=b.length-1;j>=0;j--) {
			while(x>0) {
				if(x==1) {
					b[j]="1";
					break aa;
				}
				else {
					if(x%2==0) {
						b[j]="0";
					}
					else b[j]="1";
				}
				x/=2;
				break;
			}
		}
		for(int j=0; j<b.length;) {
			System.out.print(b[j]);
			System.out.print(b[j+1]);
			System.out.print(b[j+2]);
			System.out.print(b[j+3]);
			System.out.print(b[j+4]);
			System.out.print(b[j+5]);
			System.out.print(b[j+6]);
			System.out.print(b[j+7]);
			break;
		}
		
	}
	//1010
	//10
	//101
	//1101
}
