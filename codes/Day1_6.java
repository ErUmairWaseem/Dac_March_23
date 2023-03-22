// Write a Java Program to find whether a given number is Leap year or NOT.

import java.lang.*;
import java.util.Scanner;

class Day1_6
{
	public static void Leapyear(int x)
	{
		if(x%400 == 0)
		{
			System.out.println(x+" is a leap year");
		}
		else if(x %100 != 0 && x % 4 == 0)
		{
			System.out.println(x+" is a leap year");
		}
		else
		{
			System.out.println(x+" is not a leap year");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year : ");
		int x = sc.nextInt();
		
		Leapyear(x);
	}
}