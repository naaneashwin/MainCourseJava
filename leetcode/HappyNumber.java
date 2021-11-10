package leetcode;
import java.util.HashSet;

/*
 * A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not
 */
public class HappyNumber {
	private static boolean isHappy(int n) {
        HashSet<Integer> inside = new HashSet<>();
        inside.add(n);
        
        while(n!=1){
            int x = square(n);
            if(inside.contains(x)) return false;
            inside.add(x);
            n=x;
        }
        return true;
    }
    private static int square(int n){
        int sum =0;
        while(n!=0){
            int temp = n%10;
            sum += temp*temp;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
		System.out.println(isHappy(2));
	}
}
