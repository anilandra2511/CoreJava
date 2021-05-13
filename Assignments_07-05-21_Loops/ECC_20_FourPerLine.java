package com.ojas.methods;

import java.util.Scanner;

public class ECC_20_FourPerLine 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int max =  sc.nextInt();
		System.out.println(getFourPerLine(max));
	}
	
	static String getFourPerLine(int num)
	{
		String res ="";
		if(num > 0 && num < 100)
		{
			for(int row =1 ; row <= num ; row++)
			{
				res += row + "  ";
				if(row % 4 == 0)
				{
					res += "\n";
				}
			}
		}
		else if(num < 0)
			res += -1;
		else if(num == 0)
			res += -2;
		else
			res += -3;
		
		return res;
	}

}
