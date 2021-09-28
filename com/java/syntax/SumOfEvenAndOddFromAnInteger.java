package com.java.syntax;
import java.util.*;

public class SumOfEvenAndOddFromAnInteger {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(N);
        int evenSum=0;
        int oddSum=0;
        if (N>=0 && N<=100000000){
            int i=N;
            while(i!=0){
                int x=i%10;
                
                if (x%2==0){
                	evenSum += x;
                 }
                else{
                    oddSum += x;
                }
                i/=10;
            }
        
            
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
