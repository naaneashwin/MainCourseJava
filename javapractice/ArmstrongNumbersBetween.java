package javapractice;
import java.util.*;
public class ArmstrongNumbersBetween {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the start number: ");
		int start = scan.nextInt();
		System.out.println("Enter the last number: ");
		int end = scan.nextInt();
		scan.close();
		for(int i=start; i<=end; i++) {
			if(armstrongNum(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean armstrongNum(int n) {
		boolean flag = false;
		int temp, digit=0, last,sum=0;
		temp=n;
		while(temp>0) {
			temp/=10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			int power=1;
			last = temp%10;
			for (int i=1; i<=digit; i++) {
				power = power*last;
			}
			sum=sum+power;
			temp/=10;
		}
		if(sum==n) {
			flag=true;
		}
		else flag=false;
		
		return flag;
	}
}
