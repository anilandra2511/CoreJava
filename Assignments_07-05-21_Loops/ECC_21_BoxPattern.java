package com.ojas.methods;

import java.util.Scanner;

public class ECC_21_BoxPattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows and columns : ");
		int row =  sc.nextInt();
		int column =  sc.nextInt();
		System.out.println(createBoxPattern(row,column));
	}
	
	static String createBoxPattern(int rows,int columns)
	{
		String result = "";
		
		if(rows > 0 && columns > 0)
		{
			for(int i = 1;i <= rows; i++)		
			{
				for(int j=1 ;j <= columns ; j++)
				{
					if(i == 1 || i == rows)
					{
						result += " * ";
					}
					else if(j == 1 || j == columns)
					{
						result += " * ";
					}
					else
					{
						result += "    ";
					}
				}
				result += "\n";	
			}
		}
		else if(rows < 0 || columns < 0)
			result += -1;
		else
			result += -2;
		
		return result;
	}

}
