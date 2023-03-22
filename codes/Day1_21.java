//  Write a Java Program to print all the Factors of the Given number. 

import java.lang.*;
import java.util.Scanner;

class Day1_9
	{
		public static boolean isprime(int x)
		{
			int count=0, num=x;
			
			for(int j=0; j<=num; j++)
			{
				int y=num%j;
				if(y == 0)
					count++;
			}
			if (count == 2)
				return true;
			else
				return false;
			
		}
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any Number: ");
			int x = sc.nextInt();
			
			System.out.print("Factors of "+x+" is: ");
			for(int i=1; i<=x; i++)
			{
				if(isprime(i))
				{
					if(x%i == 0)
					{
						
						System.out.print(i+",");
					
					}
				}
				
				
			}
			
		}
	}