// How to check whether the given number is Positive or Negative in Java? 

import java.lang.*;
import java.util.Scanner;

class Day1_5
{
	
	public static boolean ispositive(int x)
	{
		
		if(x > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int x = sc.nextInt();
		
		
		if(ispositive(x))
		{
			System.out.println(x+" is positive");
		}
		else
		{
			System.out.println(x+" is negative");
		}
			
		
	}
}