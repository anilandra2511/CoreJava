package com.ojas.assignments;
import java.util.Scanner;
public class ECC_50_CricketScores 
{
	public static void main(String[] args)
	{
		int runs=0;
		float overs=0;		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the Runs to score and the Overs remaining\n");
		
		System.out.print("Runs to WIN : ");
		runs = sc.nextInt();
		
		System.out.print("Overs/balls remaining : ");
		overs=sc.nextFloat();
		
		System.out.println(getDisplayDetails(runs,overs));
	}
	
	static String getDisplayDetails(int runs, float overs)
	{
		String res = "";
		int i = (int)overs;
		float d = overs-i;
		int balls = (int)(i*6+(int)(d*10));
		if(balls < 100)
		{
			res = runs+" runs in "+balls+" balls \nReq. Runrate : "+((float)runs/balls)+" per ball";
		}
		else if(balls > 100)
			res=runs+" runs in "+overs+" overs \nReq. Runrate : "+((float)runs/overs)+" per over";
		return res;
		
	}

}
