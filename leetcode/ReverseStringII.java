package leetcode;

public class ReverseStringII {
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s,k));
	}
	public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
        int i=0, l = arr.length;
        if(k>=arr.length){
            arr = reverser(arr,i,l);
        }
        else {
            int j=0;
            int start = j*k;
            int end = start + k;
            while(end<=arr.length){
                arr = reverser(arr, start, end);
                j+=2;
                start = j*k;
                end = start+k;
            }
            
        }
        String sms = "";
        for(int x=0; x<arr.length; x++){
            sms+=arr[x];
        }
        return sms;
    }
    static char[] reverser(char[] arr,int i , int l ){
        int m = l-1;
        for(;i<m;i++){
            char temp = arr[i];
            arr[i] = arr[m];
            arr[m]=temp;
        }
        return arr;
        
    }
}
