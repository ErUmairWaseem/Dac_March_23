// To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....

import java.lang.*;
import java.util.Scanner;

class Day1_19
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		
		System.out.println("Series of even numbers upto "+num+" is : ");
		for(int i=2; i<=num; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+",");
			}
			
		}
	}
}