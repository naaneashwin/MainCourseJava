package javapractice;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to check : ");
		int num = scan.nextInt();
		scan.close();
		int x=0,arm=0;
		int count = 0;
		int ref = num;
		int ref1 = num;
		if(num==0) {
			count = 1;
			arm=0;
		}
		else {
			while(ref>0) {
				ref = ref/10;
				count+=1;
			}
		}
		while(ref1>0) {
			x = ref1%10;
			int power = 1;
			for(int i=1;i<=count;i++) {
				power= power*x;
			}
			arm=arm+power;
			ref1/=10;
		}
		if(arm==num) {
			System.out.println("Yes an ArmStrong Number");
		}
		else if(num==0){
			System.out.println("Not an ArmStrong Number");
		}
		else System.out.println("Not an ArmStrong Number");
	}
}
