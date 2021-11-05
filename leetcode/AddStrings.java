package leetcode;

public class AddStrings {
public static void main(String[] args) {
	Sol obj = new Sol();
	System.out.println(obj.addStrings("11", "111"));
}
}
class Sol {
    public String addStrings(String num1, String num2) {
        StringBuffer s = new StringBuffer();
        int carry =0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0||j>=0||carry==1){
            int x = i<0 ? 0 : num1.charAt(i)-'0';
            int y = j<0 ? 0 : num2.charAt(j)-'0';
            s.append((x+y+carry)%10);
            carry = (x+y+carry)/10;
            i--;
            j--;
        }
        return s.reverse().toString();
    }
}