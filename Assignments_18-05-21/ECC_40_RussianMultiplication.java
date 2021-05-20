package com.ojas.assignments;
import java.util.Scanner;
public class ECC_40_RussianMultiplication
{
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println(getProduct(num1, num2));
	}
	
	static int getProduct(int n1, int n2) 
	{
		int res = 0;
		if (n1 > 0 && n2 > 0) 
		{
			System.out.print("The Russian Multiplication of "+n1+" and "+n2+" is ");
			if (n1 % 2 != 0)
			{
				res += n2;
			}
			while (n1 != 1)
			{
				n1 = n1 / 2;
				n2 = n2 * 2;
				if (n1 % 2 != 0) 
				{
					res += n2;
				}

			}
		}
		else
			res += -1;
		
		return res;

	}

}
