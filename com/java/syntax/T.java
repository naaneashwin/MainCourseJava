package com.java.syntax;
import java.util.Scanner;

public class T {
			public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your string to check palindrom: ");
			String str=sc.nextLine();
			str=str+"";
			sc.close();
			char ch[] =new char[str.length()];
			
			System.out.println("Length of string :"+ch.length);
			for(int i=0;i<str.length();i++)
			{
				ch[i]=str.charAt(i);
			}
			/*for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			}*/
			
			boolean flag=false;
			 
			int len=ch.length;
			
			
			for(int i=0;i<ch.length;i++)
			{
				
				if(ch[i]==ch[len-1])
				{
					len--;
				}
				else {
					flag=true;
				}
			}
			if(flag==true)
			{
				System.out.println("String is not a palindrom");
			}
			else
			{
				System.out.println("String is a palindrom");
			}
			
				
			
					
		}

}
