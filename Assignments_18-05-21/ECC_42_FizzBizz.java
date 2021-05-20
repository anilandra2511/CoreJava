package com.ojas.assignments;
import java.util.Scanner;
public class ECC_42_FizzBizz
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		System.out.println(getOutputString(num));
	}

	static String getOutputString(int n) 
	{
		String res = "";
		if(n > 0) 
		{
			if (n % 3 == 0 && n % 5 == 0)
				res += "FIZZBIZZ";
			else if (n % 5 == 0)
				res += "BIZZ";
			else if (n % 3 == 0)
				res += "FIZZ";
			else
				res += n;
		}
		else 
		{
			res += "Error";
		}
		return res;
	}
}
