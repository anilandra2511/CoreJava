package com.ojas.methods;

import java.util.Scanner;

public class ECC_25_CheckPalindrome 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number to check :");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println(""+checkPalindrome(val));
	}
	
	static String checkPalindrome(int num)
	{
		String res ="";
		if(num > 9)
		{
			int r=0,sum =0, temp=num;
			while(num>0)
			{
				r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			if(temp == sum)
				res += "TRUE";
			else
				res += "FALSE";
		}
		else if(num <= 9 && num == 0)
			res += " "+ -2;
		else if(num < 0)
			res += " "+ -1;
		
		return res ;
	}

}
