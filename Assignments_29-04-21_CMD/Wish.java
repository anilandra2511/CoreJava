package com.ojas.basicprograms;

public class Wish 
{

	public static void main(String[] args)
	{
		if(args[0].equalsIgnoreCase("AM"))
		{
			System.out.println("Good Morning! "+args[1]);
		}
		else if(args[0].equalsIgnoreCase("PM"))
		{
			System.out.println("Good Evening! "+args[1]);
		}
		else
		{
			System.out.println("The First argument should be either AM or PM.");
		}
	}

}
