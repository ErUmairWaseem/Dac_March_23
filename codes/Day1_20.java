// To print the following series ODD number Series 1 3 5 7 9 11 13...

import java.lang.*;
import java.util.Scanner;

class Day1_20
{
	public static void Odd_Series(int x)
	{
		int i=1;
		
		System.out.print("Series of odd numbers upto "+x+" is : ");
		
		while(i <= x)
		{
			if(i % 2 != 0)
			{
				System.out.print(i+",");
			}
			i++;
		}
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range : ");
		int x = sc.nextInt();
		
		Odd_Series(x);
	}
} 