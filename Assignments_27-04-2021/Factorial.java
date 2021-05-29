package com.ojas.basicprograms;

import java.util.Scanner;

public class Factorial
{

	public static void Fact(int num)
	{
		if(num<0)
		      System.out.println("String ERROR");
	        else
	        {
	          int i,fact=1;  
	          for(i=1;i<=num;i++)
	          {    
	             fact=fact*i;    
	           }    
	          System.out.println("Factorial of "+num+" is "+fact);
	           
	         }
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number to find its Factorial : ");
		Scanner s = new Scanner(System.in);
		try 
		{ 
		  int n=s.nextInt();
		  if(n>=0)
		  {
            Fact(n);
		  }
		  else
		  {
			  System.out.println("String ERROR");
		  }
		}catch(Exception e)
		 {
			System.out.println("String ERROR");
		 }
        s.close();      
	}
}
