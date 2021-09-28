package com.java.syntax;
import java.util.*;
//The challenge here is to read  lines 
//of input until you reach EOF, then number and print all  lines of content.

public class UnlimetedInput {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        for (int i=1; scan.hasNext()==true;i++){
            
            System.out.println(i+ " " +scan.nextLine());
        }
        scan.close();
}
}
