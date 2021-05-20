package com.ojas.assignments;
import java.util.Scanner;
public class ECC_41_CollatzSequence 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(getSequence(num));
	}
	
	static String getSequence(int n) 
	{
		if (n > 0) 
		{
			String str = "";
			str = str + "" + n;
			int count = 0;
			while (n > 1)
			{
				if (n % 2 == 0) 
				{
					n = n / 2;
				}				
				else
				{
					n = (3 * n) + 1;
				}
				count++;
				str = str + " " + n;
			}
			if (count < 100)
			{
				return str;
			} 
			else 
			{
				return "Does not Converge";
			}
		} 
		else
		{
			return "Error";
		}
	}

}
