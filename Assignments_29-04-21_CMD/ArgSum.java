package com.ojas.basicprograms;

public class ArgSum 
{

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2])  +Integer.parseInt(args[3]);
		System.out.println("The Sum of the given four values is "+ (a+b));
	}

}
