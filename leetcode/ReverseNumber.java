package leetcode;
/*Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside
 * the signed 32-bit integer range [-231, 231 - 1], then return 0
 */
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	
	public static int reverse(int x) {
        int num = x;
        long rev=0;
        int r=0;
        if(num==0){
            rev = 0;
        }
        else if(num>0){
            while (num>0){
                int rem = num%10;
                rev = rev*10 + rem;
                num /= 10;
                if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                    r = 0;
                }
                else r = (int)rev;
            }
        }
        else{
            num = num*(-1);
            while (num>0){
                int rem = num%10;
                rev = rev*10 + rem;
                num /= 10;
                if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                    r = 0;
                }
                else r = (int)rev;
            }
            r = r*(-1);
        }
        return r;
    }
}

