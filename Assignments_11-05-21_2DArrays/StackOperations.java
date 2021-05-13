package com.ojas.corejava;
import java.util.Scanner;
public class StackOperations 
{
	static int top = -1;
	static int stack[] = new int[5];

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("MENU DRIVEN APPLICATION\n");
		System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit\n\nEnter your optio to perform:\n");
		while (true)
		{
			int ch = s.nextInt();
			int ele;

			switch (ch) 
			{
			case 1:
				System.out.println("Enter an element to be pushed");
				ele = s.nextInt();
				System.out.println(push(ele));
				break;
			case 2:
				System.out.println(pop());
			case 3:
				System.out.println(display(stack));
				break;
			case 4:
				System.exit(0);
			}
		}
	}

	static String display(int[] stack)
	{
		String res1 = "";
		for (int i = 0; i < stack.length; i++) 
		{
			res1 += " " + stack[i];
		}
		return res1;
	}

	static String pop()
	{
		String res = "";

		if (isEmpty()) 
		{
			res = "Stack is Empty";
		} 
		else
		{
			int ele = stack[top];
			top--;
			res = ele + " is Poped Out";
		}
		return res;
	}

	static boolean isEmpty() 
	{
		boolean b = false;

		if (top == -1)
		{
			b = true;
		}
		return b;
	}

	static String push(int ele) 
	{
		String res = "";
		if (isFull()) 
		{
			res = "Stack Is Full";
		} 
		
		else {
			stack[++top] = ele;
			res = ele + " is Pushed into Stack";
		}
		return res;
	}

	private static boolean isFull()
	{
		boolean b = false;

		if (top == stack.length - 1) 
		{
			b = true;
		}
		return b;
	}

}
