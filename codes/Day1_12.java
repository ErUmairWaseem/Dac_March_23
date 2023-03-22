//How to add two numbers without using the arithmetic operators in Java?

import java.lang.*;
import java.util.Scanner;

class Day1_12
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x = sc.nextInt();
		System.out.println("Enter second number : ");
		int y = sc.nextInt();
		
		for(int i=1; i<=y; i++)
		{
			x++;
		}
		System.out.print("Sum of two is : "+x);
		
	}
}

