package com.ojas.methods;

import java.util.Scanner;

public class ECC_19_RangeWithStep 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int min =  sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();
		System.out.println(getNumbersInRange(min,max,step));
	}

	static String getNumbersInRange(int num1 , int num2 , int incre )
	{
		String res = "";
		if(num1 < num2)
		{
			if (num1 > 0 && num2 > 0) 
			{
				int i = num1+1;
				while (i < num2)
				{
					res = res+ i + " ";
					i += incre;
				}
			} 
			else if (num1 < 0 || num2 < 0) 
			{
				res = "" + -1;
			} 
			else if (num1 == num2)
			{
				res = "" + -2;
			}
			return res;
		}
		else
		{
			res = ""+ -3;
		}
		return res;
	}
}
