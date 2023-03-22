//Write a Java Program to find the Factorial of a given number.

import java.lang.*;
import java.util.*;

class Day1_2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++)
			{
				fact = fact*i;
			}
		System.out.println("Factorial of "+num+" is : "+fact);
	}
	
}
