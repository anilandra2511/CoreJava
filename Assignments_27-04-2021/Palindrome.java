package com.ojas.basicprograms;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check: ");
		Scanner s = new Scanner(System.in);
		try 
		 {
		  int n=s.nextInt();
		  if(n>=0)
		  {
		  System.out.println(IsPalindrome(n));
		  }
		  else
		  {
			  System.out.println("String ERROR");
		  }
		 }catch(Exception e)
		  {
		    System.out.println("String Error");
		  }
		s.close();
	}
	public static boolean IsPalindrome(int num)
	{
		int r,sum=0,temp;
		temp=num;    
		 while(num>0)
		  {    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)
		  {
		   return true;
		  }
		  else
		  {    
		   return false;
		  }
	}

}
