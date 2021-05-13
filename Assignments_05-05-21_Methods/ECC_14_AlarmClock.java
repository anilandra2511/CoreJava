package com.ojas.methods;

import java.util.Scanner;

public class ECC_14_AlarmClock 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Week day value and a Boolean value");
		int day = s.nextInt();
		String val = s.next();
		System.out.println(ringAlarm(day, val));
	}
	
	static String ringAlarm(int weekNum, String bool )
	{
		String res = "";
		if ((weekNum >= 0 && weekNum <= 6) && (bool.equals("true") || bool.equals("false"))) 
		{
			if ((weekNum > 0 && weekNum < 6) && (bool.equals("true")))
			{
				res =  "10:00";
			} 
			else if ((weekNum > 0 && weekNum < 6) && (bool.equals("false")))
			{
				res =  "7:00";
			} 
			else if ((weekNum == 0 || weekNum == 6) && (bool.equals("true")))
			{
				res = "OFF";
			} 

		}

		else {
			res = "Invalid Inputs";
		}
		return res;
	}

}
