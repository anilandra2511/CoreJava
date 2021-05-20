package com.ojas.assignments;
import java.util.Scanner;
public class ECC_32_FindTriangle
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three sides of a Triangle");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		System.out.println(findTriangle(first,second,third));
	}

	static String findTriangle(int a, int b, int c)
	{
		String res = "";
		if(a > 0 && b > 0 && c > 0)
		{
			if(a >= (b + c) || b >= (a + c)  || c >= (a + b))
			{
				res += -3;
			}
			else if(a == b && b == c)
			{
				res += "Equilateral Triangle";
			}
			else if((a == b && b != c ) || (b == c && c != a) || (a == c && a != b))
			{
				res += "Isosceles Triangle";
			}
			else if(a != b && b != c && a != c)
			{
				res += "Scalene Triangle";
			}
		}
		else if(a == 0 || b == 0 || c == 0)
		{
			res += -1;
		}
		else if(a < 0 || b < 0 || c < 0)
		{
			res += -2;
		}
		return res;
	}
}
