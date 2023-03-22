//heck if the given number is EVEN or ODD. 

import java.lang.*;
import java.util.Scanner;

class Day1_1
{
	public static void odd_even(int x)
	{
		if(x % 2 == 0)
		{
			System.out.print(x+" is even");
		}
		else
		{
			System.out.print(x+" is odd");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int x = sc.nextInt();
		
		odd_even(x);
	}
}