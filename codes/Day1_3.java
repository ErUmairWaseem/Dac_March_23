// Write a Java Program to find the Factorial of a given number.


import java.lang.*;
import java.util.Scanner;

class Day1_3
{
	public static int factorial(int x)
	{
		if(x == 0)
		{
			return 1;
		}
		else
		{
			return (x*factorial(x-1));
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		//int fact = 1; 
		//fact = factorial(num);
		System.out.println("Factorial of "+num+" is: "+factorial(num));
	}
}