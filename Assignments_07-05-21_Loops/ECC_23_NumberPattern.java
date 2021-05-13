package com.ojas.methods;

import java.util.Scanner;

public class ECC_23_NumberPattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int row =  sc.nextInt();
		System.out.println(numberPattern(row));
	}
	
	static String numberPattern(int num)
	{
		String res = "";
		if(num > 0)
		{
			for(int i = 1 ; i <= num ; i++)
			{
				for(int j = 1 ; j <= i ; j++)
				{
					res += (i*j) + " ";
				}
				res += "\n";
			}
		}
		else if(num < 0)
			res += -1;
		else
			res += -2;
		return "\n"+res;
	}

}
