//Swap two numbers without using the third variable approach.

import java.lang.*;
import java.util.Scanner;

class Day1_4
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int x = sc.nextInt();
		
		System.out.println("Enter second number ");
		int y = sc.nextInt();
		
		System.out.print("Before swaping first number : "+x+"\nBefore swaping second number :"+y);
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.print("\n\nAfter swaping first number : "+x+"\nAfter swaping second number :"+y);
	}
}
