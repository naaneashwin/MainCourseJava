package leetcode;

public class RomanToNumber {
	public static void main(String[] args) {
		System.out.println(romanToInt("CM"));
	}
	public static int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length() ;i++){
            int j=i+1;
            if(i<s.length()-1) {
            	for(; j<i+2;){
                    if(s.charAt(i)=='I'&&(s.charAt(j)=='V') || s.charAt(i)=='I'&&(s.charAt(j)=='X') ){
                    num =num - 2;
                    }
                    else if(s.charAt(i)=='X'&&(s.charAt(j)=='L') || s.charAt(i)=='X'&&(s.charAt(j)=='C') ){
                        	num =num - 20;
                    }
                    else if(s.charAt(i)=='C'&&(s.charAt(j)=='D') || s.charAt(i)=='C'&&(s.charAt(j)=='M') ){
                        	num =num - 200;
                    }
                    j++;
                }
            }
            if(s.charAt(i)=='I'){
                num = num+1;
            }
            else if(s.charAt(i)=='V'){
                    num = num+5;
                }
            else if(s.charAt(i)=='X'){
                    num = num+10;
                }
            else if(s.charAt(i)=='L'){
                    num = num+50;
                }
            else if(s.charAt(i)=='C'){
                    num = num+100;
                }
            else if(s.charAt(i)=='D'){
                    num = num+500;
                }
            else if(s.charAt(i)=='M'){
                    num = num+1000;
                }
            
            
                
        }
        return num;
    }
}
