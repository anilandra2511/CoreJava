package com.ojas.methods;

import java.util.Scanner;

public class ECC_15_BooleanValue
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three Boolean values:");
		System.out.println("\n"+countBoolean(s.nextBoolean(),s.nextBoolean(),s.nextBoolean()));
	}
	
	static boolean countBoolean(boolean b1, boolean b2, boolean b3)
	{
		int count=0;
		
		if(b1) 
		{
			count++;
		}
		if(b2) 
		{
			count++;
		}
		if(b3) 
		{
			count++;
		}
		
		if(count>=2) 
		{
			return true;
		}
		else 
		{
		return false;
		}
	}

}
