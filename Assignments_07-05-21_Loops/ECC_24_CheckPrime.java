package com.ojas.methods;

import java.util.Scanner;

public class ECC_24_CheckPrime 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number to check :");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println(""+checkPrime(val));
	}
	
	static String checkPrime(int num)
	{
		String res = "";
		if(num > 1)
		{
			int i=2,count = 0;
			while(i<num)
			{
				if(num%i == 0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count == 0)
				res += "TRUE";
			else
				res += "FALSE";
		}
		else if(num == 1 || num == 0)
			res += " "+ -2;
		else
			res += " "+ -1;
		
		return res;
	}

}
