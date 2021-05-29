package com.ojas.basicprograms;

import java.util.Scanner;

public class FactorsList 
{
	public static void findFactors(int n)
	{
	    if(n>0)
	    	{
	    		System.out.println("The factors of "+n+" are as follows...");
	    		for(int i=1; i <= n; i++)
	       
	    		{
	    			if(n % i == 0)
	    				System.out.print(i+"  ");
	            }
	    	}
	    	else
	    	{
	    		System.out.println("String ERROR");
	    	}
	}
	public static void main(String[] args)
	{
		int num = 0; 
		System.out.print("Enter a number to find its Factors : ");
	    Scanner s = new Scanner(System.in);
	    try
	    {
	       num = s.nextInt();
	       if(num>=0)
	       {
	         findFactors(num);
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
