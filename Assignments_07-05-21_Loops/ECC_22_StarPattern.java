package com.ojas.methods;

import java.util.Scanner;

public class ECC_22_StarPattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int max =  sc.nextInt();
		System.out.println(createStarPattern(max));
	}
	static String createStarPattern(int star)
	{
		String res = "";
		if(star > 0)
		{
			for(int i = 1 ; i<=star ; i++)
			{
				for(int j =1;j <= i ; j++)
				{
					res += " * ";
				}
				res += "\n";
			}
		}
		else if(star < 0)
			res += -1;
		else
			res += -2;
		return res;
	}

}
