// Write a java program to Reverse a given number. 

import java.lang.*;
import java.util.Scanner;

class Day1_13
{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int x = sc.nextInt();
		int rev=0;
		
		while(x!=0)
		{
			int rem = x % 10;
			rev = rev*10 + rem;
			x= x / 10;
		}
		System.out.print("Reverse of a "+x+" is: "+rev);
		
	}
}