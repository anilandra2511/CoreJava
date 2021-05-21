package com.ojas.strings;
import java.util.Scanner;
public class ECC56_NameScore
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		System.out.println(getNameScore(str));
	}
	
	static int getNameScore(String s)
	{
		int res = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			int score = (s.charAt(i) - '@');
			res += score ;
		}
		System.out.print("The name score is : ");
		return res;
	}

}
