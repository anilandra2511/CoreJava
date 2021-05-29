package com.ojas.basicprograms;
import java.util.Scanner;
public class SumofFactors 
{
	public static void factorSum(int n)
	{
		int sum=0;
		if(n>0)
	    	{
			System.out.println("The factors are :");
	    		for(int i=1; i <= n; i++)
	    		{
	    			if(n % i == 0)
	    				{
	    				 System.out.print(i+" ");
	    				 sum=sum+i;
	    				}
	    			
	            }
	    		System.out.println("\nSum of the factors of "+n+" is "+sum);
	    	}
	    	else
	    	{
	    		System.out.println("String ERROR");
	    	}
	}

	public static void main(String[] args)
	{
		int num = 0;
		Scanner s = new Scanner(System.in);
	    try
	     {
	    	 System.out.println("Enter a number to find the sum of its Factors : ");
	    	 num = s.nextInt();
	    	 if (num>=0)
	    	 {
	         factorSum(num);
	    	 }
	    	 else
	    		 System.out.println("String ERROR");
	     }catch(Exception e)
	        {
	    	   System.out.println("String ERROR");
	    	}
	    s.close();
	}

}
