package com.ojas.assignments;
import java.util.Scanner;
public class ECC_35_StringWeaver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string values :");
		String first = sc.next();
		String second = sc.next();
		System.out.println(getWeavedString(first,second));
	}
	
	static String getWeavedString(String one,String two) 
	{
		String res = "";
		if(one != null && two != null)
		{
			if(one.length() < two.length())
			{
				res += one.concat(two).concat(one);
			}
			else if(one.length() > two.length())
			{
				res += two.concat(one).concat(two);
			}
			else if(one.length() == two.length())
			{
				for(int i = 0 ; i < one.length() ; i++)
				{
					res += one.charAt(i) +""+ two.charAt(i);
				}
			}
		}
		else
			res += -1;
		return res;
	}

}
