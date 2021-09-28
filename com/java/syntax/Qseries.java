package com.java.syntax;
import java.util.*;
/*We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.*/
public class Qseries {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q=scan.nextInt();
        
        for (int i=1; i<=q;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int n=scan.nextInt();
            int total=0;
            int semi =0;
            for (int j=0;j<n;j++){
                if (j==0){
                    semi = a+(power(2,j))*b;
                    }
                else{
                    semi = (power(2,j))*b;
                    }
                total =total + semi;
                System.out.print(total+" "); 
                }
                System.out.println();               
            }
           
        }
    
    public static int power(int base, int pow){
        int result=base;
        
        if (base>0) {
            if (pow==0) {
                result =1;
            }
            else if (pow >0) {
                for (int i=2; i<=pow;i++) {
                    result = result*base;
                }
            }
            else {
                pow=pow*(-1);
                for (int i=1; i<=pow;i++) {
                    result = 1/(result*base);
                }
            }
        }
        else if (base==0) {
            result = 0;
        }
        else {
            if (pow==0) {
                result =1;
            }
            else if (pow >0) {
                for (int i=2; i<=pow;i++) {
                    result = result*base;
                }
            }
            else {
                pow=pow*(-1);
                for (int i=2; i<=pow;i++) {
                    result = 1/(result*base);
                }
            }
            result = result*(-1);
        }
    
        
        return result;
    }
}
