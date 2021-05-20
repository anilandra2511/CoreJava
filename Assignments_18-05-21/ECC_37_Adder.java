package com.ojas.assignments;
import java.util.Scanner;
public class ECC_37_Adder 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values :");
		System.out.println(getSum(sc.nextInt(),sc.nextInt()));
	}
	
	static String getSum(int first, int second)
	{
		String res= "";
		if(first > 0 && second > 0)
		{
			res += "\nThe sum of "+first+" and "+second+" is : "+ (first + second) ;
		}
		else
			res += "ERROR";
		return res;
	}

}
